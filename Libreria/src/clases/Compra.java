package clases;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class Compra extends Usuario{
    private float PrecioObjeto;
    private float precioFinal;
    private int UnidadesObjeto;

    public Compra(String NombreUsuario_N, String ApellidoUsuario_N, int EdadUsuario_N,float PrecioOnjeto_N, float precioFinal, int UnidadesObjeto_N) {
        super(NombreUsuario_N,ApellidoUsuario_N,EdadUsuario_N);
        this.PrecioObjeto = PrecioOnjeto_N;
        this.precioFinal = precioFinal;
        this.UnidadesObjeto = UnidadesObjeto_N;
    }

    public Compra() {
        super();
        this.PrecioObjeto = 14.5f;
        this.precioFinal = this.getPrecioObjeto()*this.getUnidadesObjeto();
        this.UnidadesObjeto = 58;
    }

    public float getPrecioObjeto() {
        return PrecioObjeto;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public int getUnidadesObjeto() {
        return UnidadesObjeto;
    }

    public void setPrecioObjeto(float PrecioObjeto_N) {
        this.PrecioObjeto = PrecioObjeto_N;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setUnidadesObjeto(int UnidadesObjeto_N) {
        this.UnidadesObjeto = UnidadesObjeto_N;
    }

    public float PrecioTotalCompra(Compra compra1) {
        float precio = (compra1.getPrecioObjeto() * compra1.getUnidadesObjeto());
        return precio;
    }
}