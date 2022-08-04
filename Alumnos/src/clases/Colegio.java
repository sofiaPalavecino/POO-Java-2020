package clases;

import java.util.HashMap;
import java.util.HashSet;

public class Colegio {
    private HashSet<Materia>materias;
    private HashSet<Alumno>alumnos;

    public Colegio(){
        this.materias=new HashSet<>();
        this.alumnos=new HashSet<>();
    }

    public Colegio(HashSet materias,HashSet alumnos){
        this.materias=materias;
        this.alumnos=alumnos;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

    public Float getPromedioFinal(){
        Float sumaPromedios=0.00f;
        for(Materia materia:this.getMaterias()){
            sumaPromedios=sumaPromedios+materia.getPromedioMateria();
        }
        Float promedioFinal=sumaPromedios/this.getMaterias().size();
        return promedioFinal;
    }

    public boolean agregarMateria(String nombreMateria){
        for(Materia materia:this.getMaterias()){
            if(materia.getNombreMateria()==nombreMateria){
                return false;
            }
        }
        Materia nuevaMateria=new Materia(nombreMateria);
        this.getMaterias().add(nuevaMateria);
        return true;
    }

    public Float promedioSegunMateria(String nombreMateria){
        Float promedio=0.00f;
        for(Materia materia:this.getMaterias()){
            if(materia.getNombreMateria()==nombreMateria){
                promedio=materia.getPromedioMateria();
                return promedio;
            }
        }
        System.out.println("No existe la materia");
        return promedio;
    }
    public Float menorPromedio(){
        Float menorPromedio=0.00f;
        for(Alumno alumno:this.getAlumnos()){
            Float sumaPromedios=0.00f;
            Float promedioFinal=0.00f;
            Integer cantPromedios=0;
            for(Materia materia:this.getMaterias()){
                sumaPromedios=sumaPromedios+materia.promediarAlumno(alumno);
                cantPromedios++;
            }
            promedioFinal=sumaPromedios/cantPromedios;
            if(menorPromedio==0.00f||promedioFinal<menorPromedio){
                menorPromedio=promedioFinal;
            }
        }
        return menorPromedio;
    }

    public Float mayorPromedio(){
        Float mayorPromedio=0.00f;
        for(Alumno alumno:this.getAlumnos()){
            Float sumaPromedios=0.00f;
            Float promedioFinal=0.00f;
            Integer cantPromedios=0;
            for(Materia materia:this.getMaterias()){
                sumaPromedios=sumaPromedios+materia.promediarAlumno(alumno);
                cantPromedios++;
            }
            promedioFinal=sumaPromedios/cantPromedios;
            if(mayorPromedio==0.00f||promedioFinal>mayorPromedio){
                mayorPromedio=promedioFinal;
            }
        }
        return mayorPromedio;
    }
}
