package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.SuscriptorTarjetaG;

public class ConsultaSuscriptor implements SuscriptorTarjetaG {

    private String nombreSuscriptor;

    public ConsultaSuscriptor(String nombreSuscriptor) {
        this.nombreSuscriptor = nombreSuscriptor;
    }

    @Override
    public void update(String mensaje) {
        System.out.println("El suscriptor" + nombreSuscriptor + "recibio el mensaje" + mensaje);
    }
}
