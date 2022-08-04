package clases;
import java.util.Scanner;
import java.util.ArrayList;
public class RegistroDeDatos {
    private String NombreUsuario;
    private String ApellidoUsuario;
    private int EdadUsuario;
    private String OcupacionUsuario;

    public RegistroDeDatos(String NombreUsuario_N,String ApellidoUsuario_N,int EdadUsuario_N,String OcupacionUsuario_N){
        this.NombreUsuario=NombreUsuario_N;
        this.ApellidoUsuario=ApellidoUsuario_N;
        this.EdadUsuario=EdadUsuario_N;
        this.OcupacionUsuario=OcupacionUsuario_N;
    }
    public RegistroDeDatos(){
        this.NombreUsuario="Juan";
        this.ApellidoUsuario="Martinez";
        this.EdadUsuario=24;
        this.OcupacionUsuario="Vendedor de barbijos";
    }

    public String getNombreUsuario(){
        return NombreUsuario;
    }
    public String getApellidoUsuario(){
        return ApellidoUsuario;
    }
    public int getEdadUsuario(){
        return EdadUsuario;
    }
    public String getOcupaciónUsuario(){
        return OcupacionUsuario;
    }
    public void setNombreUsuario(String NombreUsuario_N){
        this.NombreUsuario=NombreUsuario_N;
    }
    public void setApellidoUsuario(String ApellidoUsuario_N){
        this.ApellidoUsuario=ApellidoUsuario_N;
    }
    public void setEdadUsuario(int EdadUsuario_N){
        this.EdadUsuario=EdadUsuario_N;
    }
    public void  setOcupaciónUsuario(String OcupacionUsuario_N){
        this.OcupacionUsuario=OcupacionUsuario_N;
    }

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<RegistroDeDatos>Usuarios=new ArrayList<>();
        RegistroDeDatos registroDeDatos1=new RegistroDeDatos();
        System.out.println("Ingrese nombre");
        String NombreIngresado=ingreso.nextLine();
        System.out.println("valor ingresado: "+NombreIngresado);
        System.out.println("Ingrese apellido");
        String ApellidoIngresado=ingreso.nextLine();
        System.out.println("valor ingresado: "+ApellidoIngresado);
        System.out.println("Ingrese edad");
        int EdadIngresada=ingreso.nextInt();
        System.out.println("valor ingresado: "+EdadIngresada);
        System.out.println("Ingrese ocupación");
        String OcupaIngresada=ingreso.nextLine();
        System.out.println("valor ingresado: "+OcupaIngresada);

        registroDeDatos1.setNombreUsuario(NombreIngresado);
        registroDeDatos1.setApellidoUsuario(ApellidoIngresado);
        registroDeDatos1.setEdadUsuario(EdadIngresada);
        registroDeDatos1.setOcupaciónUsuario(OcupaIngresada);
        Usuarios.add(registroDeDatos1);
    }
}
