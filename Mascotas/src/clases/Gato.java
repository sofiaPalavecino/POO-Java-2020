package clases;
import clases.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Gato extends Mascota {
    private String saludo;
    private String saludoEspecial;
    private int nivelAlegria;

    public Gato(String nombre, String nombreDuenio, String tipo){
        super(nombre,nombreDuenio,tipo);
        this.saludo="miau";
        this.saludoEspecial="MIAU!";
        this.nivelAlegria=1;
    }

    public void setSaludoEspecial(String saludoEspecial) {
        this.saludoEspecial = saludoEspecial;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getSaludoEspecial() {
        return saludoEspecial;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setNivelAlegria(int nivelAlegria) {
        this.nivelAlegria = nivelAlegria;
    }

    public int getNivelAlegria() {
        return nivelAlegria;
    }

    @Override
    public HashSet<Mascota> enviarSaludo(String nombreDuenio,HashSet<Mascota>registroMascotas) {
        if(this.getNombreDuenio()==nombreDuenio){
            String saludo=this.getSaludo();
            for(int i=1;i<this.getNivelAlegria();i++){
                saludo=saludo + this.getSaludo();
            }
            System.out.println(saludo);
        }
        else{
            System.out.println(this.getSaludoEspecial());
        }
        return registroMascotas;
    }

    @Override
    public void alimentar() {
        this.setNivelAlegria(this.getNivelAlegria()+1);
        System.out.print("Alimentado");
    }
}
