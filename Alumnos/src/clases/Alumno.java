package clases;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class Alumno extends Persona {
    private String apellido;
    private HashMap<String,Float>promedioMaterias;

    public Alumno(){
        super();
        this.apellido= "perez";
        this.promedioMaterias=new HashMap<>();
    }

    public Alumno(String nombre,  int edad, int telefono, String direccion, int dni, String apellido, HashMap<String,Float>promedioMaterias){
        super(nombre,edad,telefono,direccion,dni);
        this.apellido=apellido;
        this.promedioMaterias=promedioMaterias;
    }

    public HashMap<String, Float> getPromedioMaterias() {
        return promedioMaterias;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPromedioMaterias(HashMap<String, Float> promedioMaterias) {
        this.promedioMaterias = promedioMaterias;
    }


}
