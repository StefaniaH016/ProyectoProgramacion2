package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.Persona;

import java.util.ArrayList;

public class Domiciliario implements Persona {
    private String nombre;
    private String identificacion;

    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
