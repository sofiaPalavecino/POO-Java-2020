package clases;

import java.util.HashMap;
import java.util.Map;

public class Materia {
    private String nombreMateria;
    private Map<Alumno,Float>listaNotas;

    public Materia(){
        this.nombreMateria="Lengua";
        this.listaNotas=new HashMap<>();
    }

    public Materia(String nombreMateria){
        this.nombreMateria=nombreMateria;
        this.listaNotas=new HashMap<>();
    }

    public Map<Alumno, Float> getListaNotas() {
        return listaNotas;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setListaNotas(HashMap<Alumno, Float> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void agregarNota(Float nota, Alumno alumno){
        this.getListaNotas().put(alumno,nota);
    }
    public Float getMenorNota(){
        Float menorNota=0.00f;
        for(Map.Entry<Alumno,Float>entry:this.getListaNotas().entrySet()){
            if(menorNota==0.00f || entry.getValue()<menorNota){
                menorNota=entry.getValue();
            }
        }
        return menorNota;
    }
    public Float getMayorNota(){
        Float mayorNota=0.00f;
        for(Map.Entry<Alumno,Float>entry:this.getListaNotas().entrySet()){
            if(mayorNota==0.00f || entry.getValue()>mayorNota){
                mayorNota=entry.getValue();
            }
        }
        return mayorNota;
    }

    public Float getPromedioMateria(){
        Float sumaNotas=0.00f;
        for(Map.Entry<Alumno,Float>entry:this.getListaNotas().entrySet()){
            sumaNotas=sumaNotas+entry.getValue();
        }
        Float promedioNotas=sumaNotas/this.getListaNotas().size();
        return promedioNotas;
    }
    public Float promediarAlumno(Alumno alumno){
        Float sumaNotas=0.00f;
        Integer cantNotas=0;
        for(Map.Entry<Alumno,Float>entry:this.getListaNotas().entrySet()){
            if(entry.getKey()==alumno){
                sumaNotas=sumaNotas+entry.getValue();
                cantNotas++;
            }
        }
        Float promedioNotas=sumaNotas/cantNotas;
        return promedioNotas;
    }
}
