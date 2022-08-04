import java.time.Year;
import java.util.*;

public class Mascota {
    private String nombreMascota;
    private Fecha fechaNacimiento;
    private String nombreDuenio;
    private HashSet<Fecha>visitas;
    private Integer vecesAnuales;
    private String tipo;

    public Mascota(){
        this.nombreMascota="Conejo pepito";
        this.fechaNacimiento=new Fecha();
        this.nombreDuenio="Bort";
        this.visitas= new HashSet<Fecha>();
        this.vecesAnuales=1;
        this.tipo="tortuga";
    }

    public Mascota(String nombreMascota, Fecha fechaNacimiento, String nombreDuenio, Integer vecesAnuales, String tipo){
        this.nombreMascota=nombreMascota;
        this.fechaNacimiento=fechaNacimiento;
        this.nombreDuenio=nombreDuenio;
        this.visitas=new HashSet<>();
        this.vecesAnuales=1;
        this.tipo="tortuga";
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public HashSet<Fecha> getVisitas() {
        return visitas;
    }

    public void setVisitas(HashSet<Fecha> visitas) {
        this.visitas = visitas;
    }

    public Integer getVecesAnuales() {
        return vecesAnuales;
    }

    public void setVecesAnuales(Integer vecesAnuales) {
        this.vecesAnuales = vecesAnuales;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean cumpleVisitas(){
        int year = Year.now().getValue();
        Integer cantVisitas=0;
        for(Fecha fecha:this.getVisitas()){
            if(fecha.getAnio()==year){
                cantVisitas++;
            }
        }
        if(cantVisitas<this.getVecesAnuales()){
            return false;
        }
        return true;
    }

    public boolean asistenciaPerfecta(){
        ArrayList<int>anios=new ArrayList<int>();
        Integer anioMenor=0;
        for(Fecha fecha:this.getVisitas()){
            if(!anios.contains(fecha.getAnio())){
                anios.add(fecha.getAnio());
                if(anioMenor==0 || fecha.getAnio()<0){
                    anioMenor=fecha.getAnio();
                }
                Integer cantVeces=0;
                for(Fecha fecha1:this.getVisitas()){
                    if(fecha1.getAnio()==fecha.getAnio()){
                        cantVeces++;
                    }
                }
                if(cantVeces<this.getVecesAnuales()){
                    return false;
                }
            }
        }
        if(anioMenor!=this.getFechaNacimiento().getAnio()+1){
            return false;
        }
        return true;
    }


    public String getRaza() {
        return "raza";
    }
    public void setRaza(String raza){

    }
}
