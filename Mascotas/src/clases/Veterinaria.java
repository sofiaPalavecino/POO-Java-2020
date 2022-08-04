package clases;
import clases.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Veterinaria {
    private HashSet<Mascota>registroMascota;

    public Veterinaria(){
        this.registroMascota=new HashSet<>();
    }

    public HashSet<Mascota> getRegistroMascota() {
        return registroMascota;
    }

    public void setRegistroMascota(HashSet<Mascota> registroMascota) {
        this.registroMascota = registroMascota;
    }

    public boolean nombreExistente(String nombre){
        boolean existe=false;
        for (Mascota mascota:this.getRegistroMascota()) {
            if(mascota.getNombre()==nombre){
                existe=true;
            }
        }
        if(existe){
            return true;
        }
        else{
            return false;
        }
    }

    public void altaMascota(){
        Scanner ingreso1=new Scanner(System.in);
        Scanner ingreso2=new Scanner(System.in);
        Scanner ingreso3=new Scanner(System.in);

        String nombre=ingreso1.nextLine();
        String nombreDuenio=ingreso2.nextLine();
        String tipo=ingreso3.nextLine();

        while(tipo!="perro" || tipo!="gato" || tipo!="pajarito" || tipo!="pez"){
            ingreso3=new Scanner(System.in);
            tipo=ingreso3.nextLine();
        }

        while (nombreExistente(nombre)){
            ingreso1=new Scanner(System.in);
            nombre=ingreso1.nextLine();
        }

        switch (tipo){
            case "perro":
                Mascota m1=new Perro(nombre,nombreDuenio,tipo);
                this.getRegistroMascota().add(m1);
            case "gato":
                Mascota m2=new Gato(nombre,nombreDuenio,tipo);
                this.getRegistroMascota().add(m2);
            case "pajarito":
                Mascota m3=new Pajarito(nombre,nombreDuenio,tipo);
                this.getRegistroMascota().add(m3);
            case "pez":
                Mascota m4=new Pez(nombre,nombreDuenio,tipo);
                this.getRegistroMascota().add(m4);

        }
        System.out.println("Mascota añadida");
    }

    public void bajaMascota(String nombre){
        Mascota mascota=new Mascota();
        for (Mascota m1:this.getRegistroMascota()){
            if(m1.getNombre()==nombre){
                mascota=m1;
            }
        }
        for(Mascota m1:this.getRegistroMascota()){
            if(m1==mascota){
                this.getRegistroMascota().remove(m1);
            }
        }
        System.out.println("Mascota dada de baja");
    }

    public void saludar( String nombre, String nombreDuenio){
        for(Mascota m1:this.getRegistroMascota()){
            if(m1.getNombre()==nombre){
                this.setRegistroMascota(m1.enviarSaludo(nombreDuenio,this.getRegistroMascota()));
            }
        }
    }
}
