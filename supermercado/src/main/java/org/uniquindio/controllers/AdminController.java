package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.uniquindio.application.Main;
import org.uniquindio.domain.Gangazo;
import org.uniquindio.domain.Producto;
import org.uniquindio.utils.Paths;

import java.io.IOException;

public class AdminController {


    @FXML
    private TableView<Producto> tblProd;


    @FXML
    private TextField txtMarcaProd;

    @FXML
    private TextField txtNomProd;

    @FXML
    private TextField txtPrecioProd;

    @FXML
    private TableColumn<Producto, String> colCodigo;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    void actualizarProducto(ActionEvent event) {

        Producto productoSeleccionado = tblProd.getSelectionModel().getSelectedItem();

        Double precio = Double.parseDouble(txtPrecioProd.getText());

        String nombre = txtNomProd.getText();

        String marca = txtMarcaProd.getText();


        Gangazo.getInstance().actualizarProducto(productoSeleccionado, precio, nombre, marca);

        refrescarTabla();
        limpiarTabla();

    }


    @FXML
    void cargarInfo(MouseEvent event) {

        Producto productoSeleccionado = tblProd.getSelectionModel().getSelectedItem();

        if(productoSeleccionado != null){
            this.txtPrecioProd.setText(productoSeleccionado.getPrecio()+"");
            this.txtNomProd.setText(productoSeleccionado.getNombre());
            this.txtMarcaProd.setText(productoSeleccionado.getMarca());
        }

    }

    @FXML
    void crearProducto(ActionEvent event) {


        Producto producto = new Producto();
        producto.setMarca(txtMarcaProd.getText());
        producto.setNombre(txtNomProd.getText());
        producto.setPrecio(Double.parseDouble(txtPrecioProd.getText()));

        Gangazo.getInstance().agregarProducto(producto);

        tblProd.getItems().add(producto);

        limpiarTabla();
    }

    @FXML
    void eliminarProducto(ActionEvent event) {

        Producto productoSeleccionado = tblProd.getSelectionModel().getSelectedItem();

        Gangazo.getInstance().eliminarProducto(productoSeleccionado);

        refrescarTabla();

    }

    @FXML
    void initialize() {

        this.colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        refrescarTabla();

    }



    public void refrescarTabla(){
        tblProd.getItems().clear();
        tblProd.getItems().addAll(Gangazo.getInstance().getListaProductos());
        tblProd.refresh();
    }


    public void limpiarTabla(){
        this.txtPrecioProd.setText("");
        this.txtNomProd.setText("");
        this.txtMarcaProd.setText("");
    }

    @FXML
    void irLogin(ActionEvent event) throws IOException {
        Main.actualizarVista(Paths.INICIAR_SESION);
    }
}
