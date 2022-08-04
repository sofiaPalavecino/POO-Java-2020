package clases;
import clases.Fecha;
import java.util.ArrayList;

public class Ingresos {
    private int numero;
    private ArrayList<Pasajero> huespedes;
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    private float precioTotal;

    public Ingresos(int numero){
        this.numero=numero;
        this.huespedes=new ArrayList<>();
        this.fechaEntrada = new Fecha();
        this.fechaSalida = new Fecha();
        this.precioTotal=0.0f;
    }
    public Ingresos(int numero,ArrayList<Pasajero> huespedes, Fecha fechaEntrada, Fecha fechaSalida,float precioTotal){
        this.numero=numero;
        this.huespedes=huespedes;
        this.fechaEntrada=fechaEntrada;
        this.fechaSalida=fechaSalida;
        this.precioTotal=precioTotal;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Pasajero> getHuespedes() {
        return huespedes;
    }

    public Fecha getFechaEntrada() {
        return fechaEntrada;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setHuespedes(ArrayList<Pasajero> huespedes) {
        this.huespedes = huespedes;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }


}
