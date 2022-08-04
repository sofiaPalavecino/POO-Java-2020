package clases;

public class Persona {
    private String nombre;
    private int edad;
    private int telefono;
    private String direccion;
    private int dni;

    public Persona(){
        nombre="Sofia";
        edad=28;
        telefono=45470623;
        direccion="Av Carlos 3456";
        dni=44567876;
    }
    public Persona(String nombreN, int edadN, int telefonoN, String direccionN, int dniN) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono= telefono;
        this.direccion= direccion;
        this.dni= dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }

    public int getDni(){
        return dni;
    }

    public void setEdad(int edadN) {
        this.edad = edadN;
    }

    public void setNombre(String nombreN) {
        this.nombre = nombreN;
    }

    public void setTelefono(int telefonoN){
        this.telefono= telefonoN;
    }

    public void setDireccion(String direccionN){
        this.direccion=direccionN;
    }
    public void setDni(int dniN){
        this.dni=dniN;
    }



    }
