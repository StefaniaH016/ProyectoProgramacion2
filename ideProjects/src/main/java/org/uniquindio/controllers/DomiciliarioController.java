package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.uniquindio.application.Main;
import org.uniquindio.domain.*;
import org.uniquindio.utils.Paths;

import java.io.IOException;

public class DomiciliarioController {

    @FXML
    private TableColumn<Pedido, String> colDireccion;

    @FXML
    private TableColumn<Pedido, String> colEstado;


    @FXML
    private TableView<Pedido> tblPedidos;


    @FXML
    void entregar(ActionEvent event) {;

        Pedido pedidoSeleccionado = tblPedidos.getSelectionModel().getSelectedItem();
        Gangazo.getInstance().entregarPedido(pedidoSeleccionado);
        refrescarTabla();
    }

    @FXML
    void irLogin(ActionEvent event) throws IOException {
        Main.actualizarVista(Paths.INICIAR_SESION);
    }

    @FXML
    public void initialize() {

        this.colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        
        refrescarTabla();

    }

    public void refrescarTabla(){
        tblPedidos.getItems().clear();
        tblPedidos.getItems().addAll(Gangazo.getInstance().getListaPedidos());
        tblPedidos.refresh();
    }
}
