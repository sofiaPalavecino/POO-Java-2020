
import clases.Persona;
import clases.Hospitales;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> Pacientes_siendo_Atendidos = new ArrayList<>();
        ArrayList<Persona> Pacientes_por_Atender = new ArrayList<>();
        ArrayList<Persona> Pacientes_Atendidos = new ArrayList<>();
        ArrayList<Persona> Doctores_Atendiendo = new ArrayList<>();
        Hospitales hospital1 = new Hospitales();
        Hospitales hospital2 = new Hospitales();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();
        Persona p7 = new Persona();
        Persona p8 = new Persona();
        hospital1.getPacientes_siendo_Atendidos().add(p1);
        hospital1.getPacientes_siendo_Atendidos().add(p2);
        hospital1.getPacientes_Atendidos().add(p3);
        hospital1.getPacientes_Atendidos().add(p4);
        hospital1.getPaciente_por_Atender().add(p5);
        hospital1.getPaciente_por_Atender().add(p6);
        hospital1.getDoctores_Atendiendo().add(p7);
        hospital1.getDoctores_Atendiendo().add(p8);
        Persona p01 = new Persona();
        Persona p02 = new Persona();
        Persona p03 = new Persona();
        Persona p04 = new Persona();
        Persona p05 = new Persona();
        Persona p06 = new Persona();
        Persona p07 = new Persona();
        Persona p08 = new Persona();
        hospital2.getPacientes_siendo_Atendidos().add(p01);
        hospital2.getPacientes_siendo_Atendidos().add(p02);
        hospital2.getPacientes_Atendidos().add(p03);
        hospital2.getPacientes_Atendidos().add(p04);
        hospital2.getPaciente_por_Atender().add(p05);
        hospital2.getPaciente_por_Atender().add(p06);
        hospital2.getDoctores_Atendiendo().add(p07);
        hospital2.getDoctores_Atendiendo().add(p08);
    }
}
