package clases;
import clases.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Pez extends Mascota{
    private int vidas;

    public Pez(String nombre, String nombreDuenio, String tipo){
        super(nombre,nombreDuenio,tipo);
        this.vidas=10;
    }



    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public HashSet<Mascota> enviarSaludo(String nombreDuenio,HashSet<Mascota>registroMascotas) {
        if(this.getNombreDuenio()==nombreDuenio){
                this.setVidas(this.getVidas()-1);
                if(this.getVidas()==0){
                    System.out.print("murió");
                    Mascota m1=new Pez(this.getNombre(),nombreDuenio,this.getTipo());
                    for(Mascota m2:registroMascotas){
                        if(m1.getNombre()==m2.getNombre()){
                            m1=m2;
                        }
                    }
                    registroMascotas.remove(m1);
                }
        }
        else{
            this.setVidas(0);
            System.out.print("murió");
            Mascota m1=new Pez(this.getNombre(),nombreDuenio,this.getTipo());
            for(Mascota m2:registroMascotas){
                if(m1.getNombre()==m2.getNombre()){
                    m1=m2;
                }
            }
            registroMascotas.remove(m1);
        }
        return registroMascotas;
    }

    @Override
    public void alimentar(){
        if(this.getVidas()<10){
            this.setVidas(this.getVidas()+1);
        }
        else{
            System.out.print("Vidas al tope");
        }
    }
}
