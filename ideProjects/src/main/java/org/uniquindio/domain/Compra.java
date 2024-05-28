package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.MetodoPago;

import java.util.ArrayList;

public class Compra {

    private MetodoPago metodoPago;
    private double total;
    private ArrayList<Producto> productos;

    public Compra(MetodoPago metodoPago, double total, ArrayList<Producto> productos, Cliente cliente) {
        this.metodoPago = metodoPago;
        this.total = total;
        this.productos = new ArrayList<>();
    }

    public Compra() {
        productos = new ArrayList<>();
    }



    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {

        switch (metodoPago) {
            case "Tarjeta de crédito" -> this.metodoPago = new TarjetaCredito();
            case "Tarjeta gangazo" -> this.metodoPago = new TarjetaGangazo();
            case "Efectivo" -> this.metodoPago = new Efectivo();
        }

    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }


    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    @Override
    public String toString() {

        return "Compra{" +
                "metodoPago=" + metodoPago +
                ", total=" + total +
                ", productos=" + productos +
                '}';
    }

}
