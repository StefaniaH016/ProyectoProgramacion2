package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.uniquindio.application.Main;
import org.uniquindio.domain.Gangazo;
import org.uniquindio.utils.Paths;

import java.io.IOException;

public class IniciarSesionController {

    @FXML
    private TextField txtIdentificacion;


    @FXML
    void iniciarSesion(ActionEvent event) throws IOException {

        String identificacion = txtIdentificacion.getText();
        String rol = Gangazo.iniciarSesion(identificacion);

        switch (rol) {
            case "CLIENTE":
                Main.setUsuarioActual(identificacion);
                Main.actualizarVista(Paths.VISTA_CLIENTE);
                break;

            case  "ADMINISTRADOR":
                Main.setUsuarioActual(identificacion);
                Main.actualizarVista(Paths.VISTA_ADMIN);
                break;
            case "CAJERO":
                Main.setUsuarioActual(identificacion);
                Main.actualizarVista(Paths.VISTA_CAJERO);
                break;

            case "DOMICILIARIO":
                Main.setUsuarioActual(identificacion);
                Main.actualizarVista(Paths.VISTA_DOMICILIARIO);
                break;

            default:
                Main.mostrarMensaje("el usuario no existe");
                break;
        }
    }


    @FXML
    void initialize() {

    }
}
