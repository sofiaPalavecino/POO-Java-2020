package clases;
import java.util.ArrayList;
public class Hospitales {
    private ArrayList<Persona>Paciente_por_Atender;
    private ArrayList<Persona>Pacientes_siendo_Atendidos;
    private String Nombre_Hospital;
    private ArrayList<Persona>Pacientes_Atendidos;
    private ArrayList<Persona>Doctores_Atendiendo;
    private int Camas_Disponibles;

    public  Hospitales(){
        this.Nombre_Hospital="Hospital Otamendi";
        this.Camas_Disponibles=1800;
        this.Paciente_por_Atender= new ArrayList<>();
        this.Pacientes_siendo_Atendidos=new ArrayList<>();
        this.Pacientes_Atendidos=new ArrayList<>();
        this.Doctores_Atendiendo=new ArrayList<>();
    }

    public Hospitales(String nombre_HospitalN, int Camas_DisponiblesN, ArrayList Paciente_por_AtenderN, ArrayList Pacientes_siendo_AtendidosN,ArrayList Pacientes_AtendidosN,ArrayList Doctores_AtendiendoN){
        this.Nombre_Hospital=nombre_HospitalN;
        this.Camas_Disponibles=Camas_DisponiblesN;
        this.Paciente_por_Atender= new ArrayList<>();
        this.Pacientes_siendo_Atendidos=new ArrayList<>();
        this.Pacientes_Atendidos=new ArrayList<>();
        this.Doctores_Atendiendo=new ArrayList<>();
    }

    public String getNombre_Hospital(){
        return Nombre_Hospital;
    }
    public int getCamas_Disponibles(){
        return Camas_Disponibles;
    }
    public ArrayList getPaciente_por_Atender(){return Paciente_por_Atender;}
    public ArrayList getPacientes_siendo_Atendidos(){return Pacientes_siendo_Atendidos;}
    public ArrayList getPacientes_Atendidos(){return Pacientes_Atendidos;}
    public ArrayList getDoctores_Atendiendo(){return Doctores_Atendiendo;}

    public void setNombre_Hospital(String nombre_HospitalN){
        this.Nombre_Hospital=nombre_HospitalN;
    }
    public void setCamas_Disponibles(int Camas_DisponiblesN){
        this.Camas_Disponibles=Camas_DisponiblesN;
    }
    public void setPaciente_por_Atender(ArrayList Paciente_por_AtenderN) {
        this.Paciente_por_Atender=Paciente_por_AtenderN;
    }
    public void setPacientes_siendo_Atendidos(ArrayList Pacientes_siendo_AtendidosN){
        this.Pacientes_siendo_Atendidos=Pacientes_siendo_AtendidosN;
    }
    public void setPacientes_Atendidos(ArrayList Pacientes_AtendidosN){
        this.Pacientes_Atendidos=Pacientes_AtendidosN;
    }
    public void setDoctores_Atendiendo(ArrayList Doctores_AtendiendoN){
        this.Doctores_Atendiendo=Doctores_AtendiendoN;
    }

    public int CantTotalPacientesAtendidos(Hospitales x){
        int Cant_Atendidos=x.getPacientes_Atendidos().size();
        return Cant_Atendidos;
    }
    public boolean PacientesSiendoAtendidos(Hospitales y){
        for(int i=1;i<=y.getPacientes_siendo_Atendidos().size();i++){
            Persona persona= (Persona) y.getPacientes_siendo_Atendidos().get(i);
            String Nombre=persona.getNombre();
            int Edad=persona.getEdad();
            System.out.println("Nombre Paciente "+i+":"+Nombre);
            System.out.println("Edad Paciente "+i+":"+Edad);
        }
        return true;
    }

    public void AgregarPacientesPorAtender(Persona x, Hospitales y){
            y.getPaciente_por_Atender().add(x);
    }

    public void EliminarPacientesPorAtender(Persona x, Hospitales y){
        int indice=0;
        for(int i=1;i<=y.getPaciente_por_Atender().size();i++){
            Persona persona= (Persona) y.getPaciente_por_Atender().get(i);
            if(persona==x){
                indice=i;
            }
        }
        y.getPaciente_por_Atender().remove(indice);
    }

    public int CamasDisponibles(Hospitales x){
        int CamasDisp= x.getCamas_Disponibles();
        return CamasDisp;
    }


}

// - método que retorne la cantidad total de pacientes atendidos
// - método que retorne el nombre, apellido y edad de los pacientes que están siendo atendidos actualmente
// - método que agregue nuevos pacientes por atender
// - método que elimine pacientes atendidos de la lista "pacientes por atender"
//- método para agregar pacientes atendidos a la lista "pacientes atendidos"
//- método que indique el número de camas disponibles en el hospital
