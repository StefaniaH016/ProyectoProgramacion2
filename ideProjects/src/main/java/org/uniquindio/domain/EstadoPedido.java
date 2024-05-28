package org.uniquindio.domain;


import org.uniquindio.domain.interfaces.StateDomicilio;

public class EstadoPedido {

    private StateDomicilio state;
    private Pedido pedido;

    public EstadoPedido(Pedido pedido) {

        this.state = new EstadoPendiente();
        this.pedido= pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setState(StateDomicilio state) {
        this.state = state;
    }

    public void seleccionar(){
        state.administrar(this);
    }

    public void setEstadoEntregado() {
        setState(new EstadoEntregado());
        seleccionar();
    }

    public void  setEstadoPendiente(){
        setState(new EstadoPendiente());
        seleccionar();
    }



}
