package clases;

import java.util.HashSet;

public class Mesa {
    private int nroMesa;
    private HashSet<Pedido>pedidos;
    private String tipo;

    public Mesa(){
        this.nroMesa=1;
        this.pedidos=new HashSet<>();
        this.tipo="Interna";
    }
    public Mesa(int nroMesa,HashSet<Pedido>pedidos,String tipo){
        this.nroMesa=nroMesa;
        this.pedidos=pedidos;
        this.tipo=tipo;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public HashSet<Pedido> getPedidos() {
        return pedidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public void setPedidos(HashSet<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
