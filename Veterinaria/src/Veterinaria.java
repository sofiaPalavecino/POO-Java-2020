import java.util.*;

public class Veterinaria {
    private HashSet<Mascota> listaMascotas;

    public Veterinaria(){
        this.listaMascotas=new HashSet<>();
    }

    public HashSet<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(HashSet<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public ArrayList<String> razasPerroAsistPerfecta(){
        ArrayList<String>razasAsistPerfecta=new ArrayList<>();
        ArrayList<String>razasRecorridas=new ArrayList<>();
        for(Mascota mascota:this.getListaMascotas()){
            if(mascota.getTipo().equals("Perro")){
                if(!razasRecorridas.contains(mascota.getRaza())){
                    razasRecorridas.add(mascota.getRaza());
                    Boolean agregarRaza=true;
                    for(Mascota mascota1:this.getListaMascotas()){
                        if(mascota1.getTipo().equals("Perro") && mascota1.getRaza().equals(mascota.getRaza())){
                            if(!mascota1.asistenciaPerfecta()){
                               agregarRaza=false;
                            }
                        }
                    }
                    if(agregarRaza){
                        razasAsistPerfecta.add(mascota.getRaza());
                    }
                }
            }
        }
        return razasAsistPerfecta;
    }

    public String animalMejorAsistencia(){
        String animal;
        int cantPerro=0;
        int cantGato=0;
        int cantTortuga=0;
        for(Mascota mascota:this.getListaMascotas()){
            if(mascota.cumpleVisitas()){
                switch (mascota.getTipo()){
                    case "Tortuga":
                        cantTortuga++;
                        break;
                    case "Perro":
                        cantPerro++;
                        break;
                    case "Gato":
                        cantGato++;
                        break;
                }
            }
        }
        if(cantPerro>cantGato && cantPerro>cantTortuga){
            animal="Perro";
        }
        else if(cantGato>cantPerro && cantGato>cantTortuga){
            animal="Gato";
        }
        else{
            animal="Tortuga";
        }
        return animal;
    }

}
