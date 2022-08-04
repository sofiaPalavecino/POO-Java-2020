package clases;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

        RegistroDeDatos registroDeDatos1=new RegistroDeDatos();
        ArrayList<RegistroDeDatos>usuarios=new ArrayList<>();

        JFrame ventana=new JFrame();
        ventana.setLayout(null);
        ventana.setSize(555,355);
        ventana.setVisible(true);

        JLabel mensaje1=new JLabel();
        mensaje1.setText("Nombre:");
        mensaje1.setLocation(125,25);
        mensaje1.setSize(225,25);
        ventana.add(mensaje1);

        JTextField campoNombre= new JTextField();
        campoNombre.setLocation(125,55);
        campoNombre.setSize(225,25);
        ventana.add(campoNombre);

        JLabel mensaje2 = new JLabel();
        mensaje2.setText("Apellido:");
        mensaje2.setLocation(125,85);
        mensaje2.setSize(225,25);
        ventana.add(mensaje2);

        JTextField campoApellido= new JTextField();
        campoApellido.setLocation(125,115);
        campoApellido.setSize(225,25);
        ventana.add(campoApellido);

        JLabel mensaje3 = new JLabel();
        mensaje3.setText("Edad:");
        mensaje3.setLocation(125,145);
        mensaje3.setSize(225,25);
        ventana.add(mensaje3);

        JTextField campoEdad= new JTextField();
        campoEdad.setLocation(125,175);
        campoEdad.setSize(225,25);
        ventana.add(campoEdad);

        JLabel mensaje4 = new JLabel();
        mensaje4.setText("Ocupación:");
        mensaje4.setLocation(125,205);
        mensaje4.setSize(225,25);
        ventana.add(mensaje4);

        JTextField campoOcupacion= new JTextField();
        campoOcupacion.setLocation(125,235);
        campoOcupacion.setSize(225,25);
        ventana.add(campoOcupacion);

        JButton boton = new JButton("Obtener datos");
        boton.setLocation(125,265);
        boton.setSize(225,25);
        ventana.add(boton);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                String nombreIngresado= campoNombre.getText();
                String apellidoIngresado=campoApellido.getText();
                String edadIngresada=campoEdad.getText();
                String ocupacionIngresada=campoOcupacion.getText();

                int edad=Integer.parseInt(edadIngresada);

                registroDeDatos1.setNombreUsuario(nombreIngresado);
                registroDeDatos1.setApellidoUsuario(apellidoIngresado);
                registroDeDatos1.setEdadUsuario(edad);
                registroDeDatos1.setOcupaciónUsuario(ocupacionIngresada);

                usuarios.add(registroDeDatos1);
            }
        });
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){

            }
        });
    }
}
