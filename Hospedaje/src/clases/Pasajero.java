package clases;
import java.util.ArrayList;
public class Pasajero {
    private String NombrePasajero;
    private String ApellidoPasajero;
    private int EdadPasajero;
    private int DniPasajero;

    public Pasajero(){
        this.NombrePasajero="Marcos";
        this.ApellidoPasajero="Claudia";
        this.EdadPasajero=48;
        this.DniPasajero=22467589;
    }
    public Pasajero(String NombrePasajeroN, String ApellidoPasajeroN,int EdadPasajeroN,int DniPasajeroN){
        this.NombrePasajero=NombrePasajeroN;
        this.ApellidoPasajero=ApellidoPasajeroN;
        this.EdadPasajero=EdadPasajeroN;
        this.DniPasajero=DniPasajeroN;
    }

    public String getNombrePasajero(){
        return NombrePasajero;
    }

    public String getApellidoPasajero() {
        return ApellidoPasajero;
    }

    public int getEdadPasajero() {
        return EdadPasajero;
    }

    public int getDniPasajero() {
        return DniPasajero;
    }

    public void setNombrePasajero(String NombrePasajeroN) {
        this.NombrePasajero = NombrePasajeroN;
    }

    public void setApellidoPasajero(String ApellidoPasajeroN) {
        this.ApellidoPasajero = ApellidoPasajeroN;
    }

    public void setEdadPasajero(int EdadPasajeroN) {
        this.EdadPasajero = EdadPasajeroN;
    }

    public void setDniPasajero(int DniPasajeroN) {
        this.DniPasajero = DniPasajero;
    }
}
