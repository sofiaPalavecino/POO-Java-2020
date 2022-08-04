package clases;
import clases.Fecha;
import java.util.ArrayList;
import java.util.Scanner;

public class Habitacion {
    private int numero;
    private int cantidadDeHuespedes;
    private ArrayList<Pasajero> huespedes;
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    private float precio;

    public Habitacion(int numero, int cantidadDeHuespedes) {
        this.numero = numero;
        this.cantidadDeHuespedes = cantidadDeHuespedes;
        this.huespedes = new ArrayList();
        this.fechaEntrada = new Fecha();
        this.fechaSalida = new Fecha();
        if (cantidadDeHuespedes == 1) {
            this.precio = 545.0F;
        } else {
            this.precio = 785.0F;
        }

    }

    public Habitacion(int numero, int cantidadDeHuespedes, ArrayList<Pasajero> huespedes, Fecha fechaEntrada, Fecha fechaSalida) {
        this.numero = numero;
        this.cantidadDeHuespedes = cantidadDeHuespedes;
        this.huespedes = huespedes;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        if (cantidadDeHuespedes == 1) {
            this.precio = 545.0F;
        } else {
            this.precio = 785.0F;
        }

    }


    public int getNumero(){return numero;}
    public int getCantidadDeHuespedes(){return cantidadDeHuespedes;}
    public ArrayList getHuespedes(){return huespedes;}
    public Fecha getFechaEntrada() {return fechaEntrada;}
    public Fecha getFechaSalida() {return fechaSalida;}
    public float getPrecio() {return precio;}

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setHuespedes(ArrayList<Pasajero> huespedes) {
        this.huespedes = huespedes;
    }

    public void setCantidadDeHuespedes(int cantidadDeHuespedes) {
        this.cantidadDeHuespedes = cantidadDeHuespedes;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }



    public void pedidoFechaEntrada(Habitacion habitacionSeleccionada){
        Scanner ingresoFechaEntradaDia = new Scanner(System.in);
        Scanner ingresoFechaEntradaMes = new Scanner(System.in);
        Scanner ingresoFechaEntradaAnio = new Scanner(System.in);
        System.out.println("Ingrese dia Entrada: ");
        int diaEntrada = ingresoFechaEntradaDia.nextInt();
        System.out.println("Ingrese mes Entrada: ");
        int mesEntrada = ingresoFechaEntradaMes.nextInt();
        System.out.println("Ingrese anio Entrada: ");
        int anioEntrada = ingresoFechaEntradaAnio.nextInt();

        habitacionSeleccionada.getFechaEntrada().setDia(diaEntrada);
        habitacionSeleccionada.getFechaEntrada().setMes(mesEntrada);
        habitacionSeleccionada.getFechaEntrada().setAnio(anioEntrada);
    }

    public void pedidoFechaSalida(Habitacion habitacionSeleccionada){
        Scanner ingresoFechaSalidaDia = new Scanner(System.in);
        Scanner ingresoFechaSalidaMes = new Scanner(System.in);
        Scanner ingresoFechaSalidaAnio = new Scanner(System.in);
        System.out.println("Ingrese dia Salida: ");
        int diaSalida = ingresoFechaSalidaDia.nextInt();
        System.out.println("Ingrese mes Salida: ");
        int mesSalida = ingresoFechaSalidaMes.nextInt();
        System.out.println("Ingrese anio Salida: ");
        int anioSalida = ingresoFechaSalidaAnio.nextInt();

        habitacionSeleccionada.getFechaSalida().setDia(diaSalida);
        habitacionSeleccionada.getFechaSalida().setMes(mesSalida);
        habitacionSeleccionada.getFechaSalida().setAnio(anioSalida);
    }

    public void sumaIngresoHotel(float precioFinal, Hotel hotel1){
        float ingresoActual=hotel1.getIngresoTotal();
        ingresoActual=ingresoActual+precioFinal;
        hotel1.setIngresoTotal(ingresoActual);
    }

    public void guardarIngreso(Hotel hotel1, Habitacion habitacionSeleccionada,float precioFinal){
        Ingresos ingresoNuevo=new Ingresos(habitacionSeleccionada.getNumero());
        ingresoNuevo.setHuespedes(habitacionSeleccionada.getHuespedes());
        ingresoNuevo.setFechaEntrada(habitacionSeleccionada.getFechaEntrada());
        ingresoNuevo.setFechaSalida(habitacionSeleccionada.getFechaSalida());
        ingresoNuevo.setPrecioTotal(precioFinal);
        hotel1.getTotalIngresos().add(ingresoNuevo);
    }

    public float calculoPromocion(Habitacion habitacionSeleccionada,Hotel hotel1){
        float precioFinal=0.0f;
        if(habitacionSeleccionada.getFechaSalida().getCantidadDeDiasDeDiferenciaCon(habitacionSeleccionada.getFechaEntrada())>30){
            precioFinal=habitacionSeleccionada.getPrecio()-((habitacionSeleccionada.getPrecio()*25)/100);
        }
        else{
            precioFinal=habitacionSeleccionada.getPrecio();
        }
        sumaIngresoHotel(precioFinal,hotel1);
        guardarIngreso(hotel1,habitacionSeleccionada,precioFinal);
        return precioFinal;
    }

    public void registroHospedaje(Hotel hotel1,Habitacion habitacionSeleccionada, ArrayList<Pasajero>pasajerosNuevos){
        for(Pasajero pasajeroNuevo: pasajerosNuevos){
            habitacionSeleccionada.getHuespedes().add(pasajeroNuevo);
        }
        pedidoFechaEntrada(habitacionSeleccionada);
        pedidoFechaSalida(habitacionSeleccionada);
        System.out.print("Precio a pagar: "+calculoPromocion(habitacionSeleccionada,hotel1));
    }

    public void entradaYSalida(Habitacion habitacionSeleccionada){
        System.out.println("Fecha entrada para habitación "+habitacionSeleccionada.getNumero()+" : "+habitacionSeleccionada.getFechaEntrada());
        System.out.println("Fecha salida para habitación "+habitacionSeleccionada.getNumero()+" : "+habitacionSeleccionada.getFechaSalida());
    }

    public void agregarDiasEstadía(Habitacion habitacionSeleccionada){
        pedidoFechaSalida(habitacionSeleccionada);
    }
}
