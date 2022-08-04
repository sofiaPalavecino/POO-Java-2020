import java.util.HashSet;

public class Perro extends Mascota{
    private String raza;


    public Perro(){
        super();
        this.raza="Siames";
    }
    public Perro(String nombreMascota, Fecha fechaNacimiento, String nombreDuenio, HashSet<Fecha> visitas, String raza){
        super(nombreMascota,fechaNacimiento,nombreDuenio,4, "Perro");
        this.raza=raza;
    }
    @Override
    public String getRaza() {
        return raza;
    }
    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }


}
