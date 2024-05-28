package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.StateDomicilio;

public class EstadoPendiente implements StateDomicilio {

    @Override
    public void administrar(EstadoPedido pedido) {
        pedido.getPedido().setEstado("pendiente");
    }
}
