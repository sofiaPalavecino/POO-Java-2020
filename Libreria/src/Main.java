
import clases.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        HashMap<String,Integer> cantidadVendidosEditorial = new HashMap<String,Integer>();
        HashSet<Libro>librosVendidosDia=new HashSet<>();
        HashSet<String>editorialesConDesuento=new HashSet<>();
        HashMap<Compra,Integer>comprasTotales=new HashMap<>();

        Libro libro1=new Libro();
        Libro libro2=new Libro();
        Libro libro3=new Libro();
        Libro libro4=new Libro();
        Libro libro5=new Libro();
        Libro libro6=new Libro();
        Libro libro7=new Libro();

        Usuario usuario1=new Usuario();

        cantidadVendidosEditorial.put("Kapelusz", 0);
        cantidadVendidosEditorial.put("Sudamericana", 0);
        cantidadVendidosEditorial.put("Atlántida", 0);
        cantidadVendidosEditorial.put("ElAteneo", 0);
        cantidadVendidosEditorial.put("Interzona", 0);
        cantidadVendidosEditorial.put("Sur", 0);
        cantidadVendidosEditorial.put("Alianza", 0);


        Libreria libreria=new Libreria(cantidadVendidosEditorial,librosVendidosDia,editorialesConDesuento,comprasTotales);

        System.out.println(cantidadVendidosEditorial);
        //imprime: {nombreClaveTres=34, nombreClaveDos=123, nombreClaveUno=2}


        cantidadVendidosEditorial.isEmpty();

        cantidadVendidosEditorial.size();

        cantidadVendidosEditorial.keySet();
        System.out.println(cantidadVendidosEditorial.keySet());
        //imprime: [nombreClaveTres, nombreClaveDos, nombreClaveUno]

        cantidadVendidosEditorial.values();
        System.out.println(cantidadVendidosEditorial.values());
        //imprime todos los valores del map: [34, 123, 2]

        cantidadVendidosEditorial.containsKey("nombreClaveUno");
        cantidadVendidosEditorial.containsKey("casa");
        cantidadVendidosEditorial.containsValue(123);
        cantidadVendidosEditorial.containsValue(15);

        System.out.println(cantidadVendidosEditorial.entrySet());

        cantidadVendidosEditorial.get("nombreClaveUno");

        System.out.println(cantidadVendidosEditorial.get("nombreClaveUno"));
        //retorna el valor asociado a la clave "nombreClaveUno"


        for ( Map.Entry<String,Integer> elemento : cantidadVendidosEditorial.entrySet() ) {
            System.out.println(elemento);
            if(elemento.getKey() == "nombreClaveUno"){
                System.out.println("el valor de nombreClaveUno es: " + elemento.getValue());
            }
        }

        cantidadVendidosEditorial.put("cuaderno", 2);
        cantidadVendidosEditorial.put("cuaderno", 3);


        System.out.println(cantidadVendidosEditorial);

        cantidadVendidosEditorial.replace("cuaderno", 19);


        cantidadVendidosEditorial.remove("nombreClaveUno");


        cantidadVendidosEditorial.clear();

        //nota: los elementos del map no estarán ordenados

	/*
	fuente(api de java SE):
	https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
	 */

    }

}