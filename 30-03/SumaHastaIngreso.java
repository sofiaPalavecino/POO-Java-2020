package clases;
import java.util.Scanner;
public class SumaHastaIngreso {
    public static void main(String[] args) {
        Scanner ingreso= new Scanner(System.in);
        System.out.println("ingrese primer num");
        float Num1=ingreso.nextFloat();
        System.out.println(Num1);
        System.out.println("ingrese segundo num");
        float Num2=ingreso.nextFloat();
        System.out.println(Num2);
        int NumIngresar=ingreso.nextInt();
        float SumaFinal=0.0f;
        while(NumIngresar!=(-1)){
            SumaFinal=(Num1)+(Num2);
            NumIngresar=ingreso.nextInt();
        }
        System.out.println("Suma final: "+SumaFinal);
    }
}
