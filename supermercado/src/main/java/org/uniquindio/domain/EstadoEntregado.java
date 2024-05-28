package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.StateDomicilio;

public class EstadoEntregado implements StateDomicilio {

    @Override
    public void administrar(EstadoPedido pedido) {
      pedido.getPedido().setEstado("Entregado");
    }
}
