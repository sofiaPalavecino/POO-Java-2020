import java.util.ArrayList;
import java.util.HashSet;
public class Madre extends clases.Persona {
    private String nombreEmpresaTrabajo;
    private HashSet<Hijo>conjuntoHijos;

    public Madre(){
        super();
        this.nombreEmpresaTrabajo="Banco Provincia";
        this.conjuntoHijos=new HashSet<>();
    }
    public Madre(String nombre, int edad, int telefono, String direccion, int dni,String nombreEmpresaTrabajo,HashSet<Hijo>conjuntoHijos){
        super(nombre,edad,telefono,direccion,dni);
        this.nombreEmpresaTrabajo=nombreEmpresaTrabajo;
        this.conjuntoHijos=conjuntoHijos;
    }

    public String getNombreEmpresaTrabajo() {
        return nombreEmpresaTrabajo;
    }

    public HashSet<Hijo> getConjuntoHijos() {
        return conjuntoHijos;
    }

    public void setNombreEmpresaTrabajo(String nombreEmpresaTrabajo) {
        this.nombreEmpresaTrabajo = nombreEmpresaTrabajo;
    }

    public void setConjuntoHijos(HashSet<Hijo> conjuntoHijos) {
        this.conjuntoHijos = conjuntoHijos;
    }

    public HashSet<Hijo> getHijosMenores(){
        HashSet<Hijo>hijosMenores=new HashSet<>();
        for(Hijo hijo:this.getConjuntoHijos()){
            if(hijo.getEdad()<18){
                hijosMenores.add(hijo);
            }
        }
        return hijosMenores;
    }
}
