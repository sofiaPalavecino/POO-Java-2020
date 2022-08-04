import java.util.ArrayList;
import java.util.HashSet;
public class Hijo extends clases.Persona {
    private String escuelaAsistida;
    private String juegoFavorito;

    public Hijo(){
        super();
        this.escuelaAsistida="Pallotti";
        this.juegoFavorito="Saltar la soga";
    }
    public Hijo(String nombre, int edad, int telefono, String direccion, int dni,String escuelaAsistida,String juegoFavorito){
        super(nombre,edad,telefono,direccion,dni);
        this.escuelaAsistida=escuelaAsistida;
        this.juegoFavorito=juegoFavorito;
    }
}
