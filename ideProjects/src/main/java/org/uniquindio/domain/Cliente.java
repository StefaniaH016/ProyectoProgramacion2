package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.Persona;

import java.util.ArrayList;

public class Cliente implements Persona{
    private String nombre;
    private String identificacion;
    private String direccion;
    private ArrayList<Compra> compras;

    public Cliente(String nombre, String identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        compras = new ArrayList<>();
    }

    public Cliente() {
        compras = new ArrayList<>();
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }
}
