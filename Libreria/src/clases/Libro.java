package clases;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class Libro {
    private String editorial;
    private Float precio;
    private String nombre;

    public Libro(){
        this.editorial="Sudamericana";
        this.precio=500.0f;
        this.nombre="Demian";
    }
    public Libro(String editorial,Float precio,String nombre){
        this.editorial=editorial;
        this.precio=precio;
        this.nombre=nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
