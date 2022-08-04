package clases;
import java.util.Scanner;
public class NumMayorOIgual {
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);

        System.out.println("Ingrese primer número");
        float NumIngresado=ingreso.nextFloat();

        System.out.println("ingrese segundo número");
        float Num2Ingresado=ingreso.nextFloat();

        if(NumIngresado>Num2Ingresado){
            System.out.println("Num más grande: "+NumIngresado);
        }
        else if(Num2Ingresado>NumIngresado){
            System.out.println("Num más grande: "+Num2Ingresado);
        }
        else{
            System.out.println("son iguales");
        }

    }
}
