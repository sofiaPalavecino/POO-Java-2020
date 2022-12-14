package clases;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel {
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Pasajero> totalHuespedesIngresados;
    private ArrayList<Ingresos>totalIngresos;
    private float ingresoTotal;

    public Hotel() {
        this.habitaciones = new ArrayList();

        int i;
        Habitacion habitacionDeUnHuesped;
        for(i = 1; i <= 8; ++i) {
            habitacionDeUnHuesped = new Habitacion(i, 1);
            this.habitaciones.add(habitacionDeUnHuesped);
        }

        for(i = 9; i <= 13; ++i) {
            habitacionDeUnHuesped = new Habitacion(i, 2);
            this.habitaciones.add(habitacionDeUnHuesped);
        }

        this.totalHuespedesIngresados = new ArrayList();
        this.totalIngresos=new ArrayList<>();
        this.ingresoTotal = 0.0F;
    }

    public Hotel(ArrayList<Habitacion> habitaciones, ArrayList<Pasajero> totalHuespedesIngresados, ArrayList<Ingresos>totalIngresos,float ingresoTotal) {
        this.habitaciones = habitaciones;
        this.totalHuespedesIngresados = totalHuespedesIngresados;
        this.totalIngresos=totalIngresos;
        this.ingresoTotal = ingresoTotal;
    }

    public ArrayList getHabitaciones(){return habitaciones;}
    public ArrayList getTotalHuespedesIngresados(){return totalHuespedesIngresados;}
    public float getIngresoTotal(){return ingresoTotal;}

    public ArrayList<Ingresos> getTotalIngresos() {
        return totalIngresos;
    }

    public void setHabitaciones(ArrayList habitacionesN){this.habitaciones=habitacionesN;}
    public void setTotalHuespedesIngresados(ArrayList totalHuespedesIngresadosN){ this.totalHuespedesIngresados=totalHuespedesIngresadosN;}

    public void setTotalIngresos(ArrayList<Ingresos> totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public void setIngresoTotal(float ingresoTotalN){this.ingresoTotal=ingresoTotalN;}

    public void ocuparHabitacion(Hotel hotel1,ArrayList<Pasajero>pasajerosNuevos){
        int i=0;
        boolean x=false;
        if(pasajerosNuevos.size()==2){
            while(x!=true){
                Habitacion habitacionx= (Habitacion) hotel1.getHabitaciones().get(i);
                if(habitacionx.getCantidadDeHuespedes()==2 && habitacionx.getHuespedes().size()==0){
                    x=true;
                    Habitacion habitacionSeleccionada=habitacionx;
                }
                i++;
            }
        }
        else{
            while(x!=true){
                Habitacion habitacionx= (Habitacion) hotel1.getHabitaciones().get(i);
                if(habitacionx.getCantidadDeHuespedes()==1 && habitacionx.getHuespedes().size()==0){
                    x=true;
                    Habitacion habitacionSeleccionada=habitacionx;
                }
                i++;
            }
        }
    }
    public void guardadoDeHuesped(Hotel hotel1,ArrayList<Pasajero> pasajerosNuevos,String nombre, String apellido,int edad,int dni){
        Pasajero pasajeroNuevo=new Pasajero();
        pasajeroNuevo.setNombrePasajero(nombre);
        pasajeroNuevo.setApellidoPasajero(apellido);
        pasajeroNuevo.setEdadPasajero(edad);
        pasajeroNuevo.setDniPasajero(dni);
        hotel1.getTotalHuespedesIngresados().add(pasajeroNuevo);
        pasajerosNuevos.add(pasajeroNuevo);
    }
    public void registroDeHuesped(Hotel hotel1, ArrayList<Pasajero> pasajerosNuevos) {
        Scanner ingresoNombre = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = ingresoNombre.nextLine();
        Scanner ingresoApellido = new Scanner(System.in);
        System.out.println("Ingrese apellido: ");
        String apellido = ingresoApellido.nextLine();
        Scanner ingresoEdad = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        int edad = ingresoEdad.nextInt();
        Scanner ingresoDni = new Scanner(System.in);
        System.out.println("Ingrese dni: ");
        int dni = ingresoDni.nextInt();
        guardadoDeHuesped(hotel1,pasajerosNuevos,nombre,apellido,edad,dni);
    }
    public boolean getIngresoHotel(Hotel hotel1){
        ArrayList<Pasajero>pasajerosNuevos=new ArrayList<>();
        Scanner ingresoCantidadHuespedes = new Scanner(System.in);
        System.out.println("Ingrese cantidad de hu??spedes");
        int cantidadHuespedes=ingresoCantidadHuespedes.nextInt();
        while(cantidadHuespedes<1 || cantidadHuespedes>2){
            cantidadHuespedes=ingresoCantidadHuespedes.nextInt();
        }
        for(int i=1;i<=cantidadHuespedes;i++){
            registroDeHuesped(hotel1,pasajerosNuevos);
        }
        ocuparHabitacion(hotel1,pasajerosNuevos);
        return true;
    }

    public void retiroHospedaje(Habitacion habitacionSeleccionada){
        habitacionSeleccionada.getHuespedes().clear();
    }

    //Cu??les son las habitaciones ocupadas.
    public ArrayList<Habitacion> getHabitacionesOcupadas(Hotel hotel1){
        ArrayList<Habitacion>ocupadas=new ArrayList<>();
        for(Habitacion habitacion:hotel1.habitaciones){
            if(habitacion.getHuespedes().size()>0){
                ocupadas.add(habitacion);
            }
        }
        return ocupadas;
    }

    //Cu??les son las habitaciones disponiles.
    public ArrayList<Habitacion> getHabitacionesLibres(Hotel hotel1){
        ArrayList<Habitacion>libres=new ArrayList<>();
        for(Habitacion habitacion:hotel1.habitaciones){
            if(habitacion.getHuespedes().size()==0){
                libres.add(habitacion);
            }
        }
        return libres;
    }

    //Qui??nes son los hu??spedes que est??n en
    //una determinada habitaci??n.
    public ArrayList<Pasajero> getHuespedesEnHabitacion(Hotel hotel1, Habitacion habitacion1){
        ArrayList<Pasajero>huespedes=new ArrayList<>();
        huespedes= habitacion1.getHuespedes();
        return  huespedes;
    }

    public float getIngresoTotal(Hotel hotel1){
        float ingresoTotalActual=hotel1.getIngresoTotal();
        return ingresoTotalActual;
    }

    public int getHuespedesEstadiaProlongad(Hotel hotel1){
        int cantidadFinal=0;
        for(Ingresos ingreso:hotel1.totalIngresos){
            if(ingreso.getFechaSalida().getCantidadDeDiasDeDiferenciaCon(ingreso.getFechaEntrada())>30){
                if(ingreso.getHuespedes().size()==1){
                    cantidadFinal++;
                }
                else{
                    cantidadFinal=cantidadFinal+2;
                }
            }
        }
        return cantidadFinal;
    }

    public int getHabitacionMasSolicitada(Hotel hotel1){
        int Mayor=0;
        int numHabitacion=0;
        for(Ingresos ingresox:hotel1.totalIngresos){
            int numeroHabitacion=ingresox.getNumero();
            int cantVeces=0;
            for(Ingresos ingresoy:hotel1.totalIngresos){
                if(ingresoy.getNumero()==numeroHabitacion){
                    cantVeces++;
                }
            }
            if(cantVeces>Mayor){
                numHabitacion=numeroHabitacion;
            }
        }
        return numHabitacion;
    }

    public void getTiempoDeEstadia(Hotel hotel1){
        for(Ingresos ingreso:hotel1.totalIngresos){
            System.out.println("Huespedes:");
            for(int i=1;i<ingreso.getHuespedes().size();i++){
                System.out.println("Apellido: "+ingreso.getHuespedes().get(i).getApellidoPasajero()+"dni: "+ingreso.getHuespedes().get(i).getDniPasajero());
            }
            System.out.println("Dias estad??a: "+ingreso.getFechaSalida().getCantidadDeDiasDeDiferenciaCon(ingreso.getFechaEntrada()));
        }
    }
    
}
