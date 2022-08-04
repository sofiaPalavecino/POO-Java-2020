import clases.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String>platos=new HashMap<>();

        platos.put(1,"Milanesa con puré de papas");
        platos.put(2,"Ravioles rellenos con carne");
        platos.put(3,"Pizza a la Piedra");
        platos.put(4,"Polenta con salsa Fileto");
        platos.put(5,"Arroz primavera" );

        HashSet<Integer>mesasInternas=new HashSet<>();
        HashSet<Integer>mesasExternas=new HashSet<>();
        HashSet<Integer>mesasDisponibles=new HashSet<>();
    }
}