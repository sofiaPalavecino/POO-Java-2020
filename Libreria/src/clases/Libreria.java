package clases;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
public class Libreria {
    private HashMap<String,Integer> cantidadVendidosEditorial;
    private HashSet<Libro>librosVendidosDia;
    private HashSet<String>editorialesConDesuento;
    private HashMap<Compra,Integer>comprasTotales;

    public Libreria(){
        this.cantidadVendidosEditorial=new HashMap<>();
        this.librosVendidosDia=new HashSet<>();
        this.editorialesConDesuento=new HashSet<>();
        this.comprasTotales=new HashMap<>();
    }
    public Libreria(HashMap<String,Integer>cantidadVendidosEditorial,HashSet<Libro>librosVendidosDia,HashSet<String>editorialesConDesuento,HashMap<Compra,Integer>comprasTotales){
        this.cantidadVendidosEditorial=cantidadVendidosEditorial;
        this.librosVendidosDia=librosVendidosDia;
        this.editorialesConDesuento=editorialesConDesuento;
        this.comprasTotales=comprasTotales;
    }

    public HashMap<String, Integer> getCantidadVendidosEditorial() {
        return cantidadVendidosEditorial;
    }

    public HashSet<Libro> getLibrosVendidosDia() {
        return librosVendidosDia;
    }

    public HashSet<String> getEditorialesConDesuento() {
        return editorialesConDesuento;
    }

    public HashMap<Compra,Integer>getComprasTotales(){
        return comprasTotales;
    }

    public void setCantidadVendidosEditorial(HashMap<String, Integer> cantidadVendidosEditorial) {
        this.cantidadVendidosEditorial = cantidadVendidosEditorial;
    }

    public void setLibrosVendidosDia(HashSet<Libro> librosVendidosDia) {
        this.librosVendidosDia = librosVendidosDia;
    }

    public void setEditorialesConDesuento(HashSet<String> editorialesConDesuento) {
        this.editorialesConDesuento = editorialesConDesuento;
    }

    public void setComprasTotales(HashMap<Compra,Integer> comprasTotales) {
        this.comprasTotales = comprasTotales;
    }

    public void venderLibro(Libro libro, Usuario usuario){
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Ingrese la cantidad a comprar");
        Integer cantidadProducto=ingreso.nextInt();
        float precioPorLibro=libro.getPrecio();
        float precioFinal=0.0f;
        boolean conDescuento=false;
        for(String editorial:this.getEditorialesConDesuento()){
            if(libro.getEditorial()==editorial){
                conDescuento=true;
            }
        }
        if(conDescuento==true){
            precioPorLibro=(precioPorLibro*50)/100;
            precioFinal=precioPorLibro*cantidadProducto;
            Compra nuevaCompra=new Compra(usuario.getNombreUsuario(),usuario.getApellidoUsuario(),usuario.getEdadUsuario(),precioPorLibro,precioFinal,cantidadProducto);
            this.getComprasTotales().put(nuevaCompra,cantidadProducto);
        }
        else {
            precioFinal=precioPorLibro*cantidadProducto;
            Compra nuevaCompra=new Compra(usuario.getNombreUsuario(),usuario.getApellidoUsuario(),usuario.getEdadUsuario(),precioPorLibro,precioFinal,cantidadProducto);
            this.getComprasTotales().put(nuevaCompra,cantidadProducto);
        }
        this.getLibrosVendidosDia().add(libro);
    }

    public void actualizarCantidadVendidosEditorial(){
        for(Libro libro:this.getLibrosVendidosDia()){
            Integer valor=0;
            switch(libro.getEditorial()) {
                case "Kapelusz":
                    valor=(this.getCantidadVendidosEditorial().get("Kapelusz"))+1;
                    this.getCantidadVendidosEditorial().replace("Kapelusz",valor);
                    break;
                case "Sudamericana":
                    valor=(this.getCantidadVendidosEditorial().get("Sudamericana"))+1;
                    this.getCantidadVendidosEditorial().replace("Sudamericana",valor);
                    break;
                case "Atlántida":
                    valor=(this.getCantidadVendidosEditorial().get("Atlántida"))+1;
                    this.getCantidadVendidosEditorial().replace("Atlántida",valor);
                    break;
                case "ElAteneo":
                    valor=(this.getCantidadVendidosEditorial().get("ElAteneo"))+1;
                    this.getCantidadVendidosEditorial().replace("ElAteneo",valor);
                    break;
                case "Interzona":
                    valor=(this.getCantidadVendidosEditorial().get("Interzona"))+1;
                    this.getCantidadVendidosEditorial().replace("Interzona",valor);
                    break;
                case "Sur":
                    valor=(this.getCantidadVendidosEditorial().get("Sur"))+1;
                    this.getCantidadVendidosEditorial().replace("Sur",valor);
                    break;
                default:
                    valor=(this.getCantidadVendidosEditorial().get("Alianza"))+1;
                    this.getCantidadVendidosEditorial().replace("Alianza",valor);
                    break;
            }
        }
    }
    public void getEditorialQueMasVende(){
        Integer mayor=0;
        HashSet<Integer>valores=new HashSet<>();
        valores= (HashSet<Integer>) this.getCantidadVendidosEditorial().values();

        for(Integer valor:valores){
            if(valor>mayor){
                mayor=valor;
            }
        }

        for ( Map.Entry<String,Integer> elemento : this.getCantidadVendidosEditorial().entrySet() ) {
            if(elemento.getValue()==mayor){
                System.out.println(elemento.getKey());
            }
        }
    }

    public void agregarEditorialConDescuento(String editorial){
        this.getEditorialesConDesuento().add(editorial);
    }
}
