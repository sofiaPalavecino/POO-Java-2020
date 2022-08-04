package clases;
import clases.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Pedido {
    private int nroPedido;
    private int nroPlato;

    public Pedido(){
        this.nroPedido=1;
        this.nroPlato=1;
    }
    public Pedido(int nroPedido,int nroPlatos){
        this.nroPedido=nroPedido;
        this.nroPlato=nroPlatos;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public int getNroPlato() {
        return nroPlato;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public void setNroPlato(int nroPlato) {
        this.nroPlato = nroPlato;
    }
}

