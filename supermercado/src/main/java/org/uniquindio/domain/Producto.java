package org.uniquindio.domain;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class Producto {


    private String nombre;
    private String marca;
    private Double precio;
    private String codigo;

    private static int contador = 100;



    public Producto(String nombre, String marca, Double precio) {
        codigo = (contador++) + "";
    }
    public Producto(){
        codigo = (contador++) + "";
    }

    public String getNombre(){ return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                '}';
    }


}

