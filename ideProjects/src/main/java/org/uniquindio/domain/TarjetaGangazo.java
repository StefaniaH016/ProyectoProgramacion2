package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.MetodoPago;
import org.uniquindio.domain.interfaces.SuscriptorTarjetaG;

import java.util.ArrayList;
import java.util.List;

public class TarjetaGangazo implements MetodoPago {

    private List<SuscriptorTarjetaG> suscriptores;

    public TarjetaGangazo() {
        this.suscriptores = new ArrayList<>();
    }

    public void addSuscriptores( SuscriptorTarjetaG suscriptor){
        suscriptores.add(suscriptor);
    }

    public void removeSuscriptor( SuscriptorTarjetaG suscriptor){
        suscriptores.remove(suscriptor);
    }

    public void notificar(SuscriptorTarjetaG suscriptor){
       suscriptor.update("");
    }


}
