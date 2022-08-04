import java.util.*;
 public class Gato extends Mascota{
    private String raza;

    public Gato(){
        super();
        this.raza="Siames";
    }
    public Gato(String nombreMascota, Fecha fechaNacimiento, String nombreDuenio, String raza){
        super(nombreMascota,fechaNacimiento,nombreDuenio,2,"Gato");
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
