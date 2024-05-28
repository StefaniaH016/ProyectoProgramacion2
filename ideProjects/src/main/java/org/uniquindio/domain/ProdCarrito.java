package org.uniquindio.domain;

public class ProdCarrito {

    private String producto;
    private int cantidad;
    private Double precio;
    private String id;

    public ProdCarrito(String producto, int cantidad, Double precio, String id) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio * cantidad;
        this.id = id;
    }

    public ProdCarrito() {
    }


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
