import clases.Hotel;
import clases.Pasajero;
import clases.Fecha;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Hotel hotel1=new Hotel();
        hotel1.getIngresoHotel(hotel1);
        System.out.println(hotel1.getHabitacionesOcupadas(hotel1));
    }
}
