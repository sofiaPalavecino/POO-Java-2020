package clases;
import clases.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Mascota {
    private String nombre;
    private String nombreDuenio;
    private String tipo;

    public Mascota(String nombre,String nombreDuenio, String tipo){
        this.nombre=nombre;
        this.nombreDuenio=nombreDuenio;
        this.tipo=tipo;
    }
    public Mascota(){
        this.nombre="Pepito";
        this.nombreDuenio="Carlos";
        this.tipo="Perro";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public HashSet<Mascota> enviarSaludo(String nombreDuenio,HashSet<Mascota>registroMascotas){
        System.out.println("saludo no indicado");
        return registroMascotas;
    }

    public void alimentar(){
        System.out.print("inválido");
    }
}
