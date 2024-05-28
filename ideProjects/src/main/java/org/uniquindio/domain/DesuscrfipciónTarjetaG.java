package org.uniquindio.domain;

public class DesuscrfipciónTarjetaG extends SuscripcionTarjetaG {

    private String mensaje;

    public void update(String mensaje){
        mensaje = "te has desuscrito de tu tarjeta Ganagazo";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
