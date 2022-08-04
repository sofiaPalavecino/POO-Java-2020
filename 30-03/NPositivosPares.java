package clases;
import java.util.Scanner;
public class NPositivosPares {
    public static void main(String[] args) {
        Scanner ingreso= new Scanner(System.in);
        System.out.println("Ingrese num");
        int NumIngresado=ingreso.nextInt();
        int nums=0;
        for(int i=1;i<=NumIngresado; i++){
            nums=nums+2;
            System.out.println(nums);
        }
    }
}
