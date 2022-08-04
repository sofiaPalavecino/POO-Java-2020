package clases;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class RegistroDeCompras {
    private float PrecioObjeto;
    private String NombreObjeto;
    private String MarcaObjeto;
    private int UnidadesObjeto;

    public RegistroDeCompras(float PrecioOnjeto_N,String NombreObjeto_N,String MarcaObjeto_N,int UnidadesObjeto_N){
        this.PrecioObjeto=PrecioOnjeto_N;
        this.NombreObjeto=NombreObjeto_N;
        this.MarcaObjeto=MarcaObjeto_N;
        this.UnidadesObjeto=UnidadesObjeto_N;
    }

    public  RegistroDeCompras(){
        this.PrecioObjeto=14.5f;
        this.NombreObjeto="Lata Paté";
        this.MarcaObjeto="Patito";
        this.UnidadesObjeto=58;
    }

    public float getPrecioObjeto() {
        return PrecioObjeto;
    }

    public String getNombreObjeto() {
        return NombreObjeto;
    }

    public String getMarcaObjeto() {
        return MarcaObjeto;
    }

    public int getUnidadesObjeto() {
        return UnidadesObjeto;
    }

    public void setPrecioObjeto(float PrecioObjeto_N) {
        this.PrecioObjeto = PrecioObjeto_N;
    }

    public void setNombreObjeto(String NombreObjeto_N) {
        this.NombreObjeto = NombreObjeto_N;
    }

    public void setMarcaObjeto(String MarcaObjeto_N) {
        this.MarcaObjeto = MarcaObjeto_N;
    }

    public void setUnidadesObjeto(int UnidadesObjeto_N) {
        this.UnidadesObjeto = UnidadesObjeto_N;
    }

    //public float PrecioTotalCompra(RegistroDeCompras compra1){
      //  float precio=(compra1.getPrecioObjeto()*compra1.getUnidadesObjeto());
       // return precio;
    //}

    public static void main(String[] args){
        RegistroDeCompras registroDeCompra1=new RegistroDeCompras();
        ArrayList<RegistroDeCompras> compra=new ArrayList<>();

        JFrame ventana=new JFrame();
        ventana.setLayout(null);
        ventana.setSize(555,355);
        ventana.setVisible(true);

        JLabel mensaje1=new JLabel();
        mensaje1.setText("Precio:");
        mensaje1.setLocation(125,25);
        mensaje1.setSize(225,25);
        ventana.add(mensaje1);

        JTextField campoPrecio= new JTextField();
        campoPrecio.setLocation(125,55);
        campoPrecio.setSize(225,25);
        ventana.add(campoPrecio);

        JLabel mensaje2 = new JLabel();
        mensaje2.setText("Nombre:");
        mensaje2.setLocation(125,85);
        mensaje2.setSize(225,25);
        ventana.add(mensaje2);

        JTextField campoNombre= new JTextField();
        campoNombre.setLocation(125,115);
        campoNombre.setSize(225,25);
        ventana.add(campoNombre);

        JLabel mensaje3 = new JLabel();
        mensaje3.setText("Marca:");
        mensaje3.setLocation(125,145);
        mensaje3.setSize(225,25);
        ventana.add(mensaje3);

        JTextField campoMarca= new JTextField();
        campoMarca.setLocation(125,175);
        campoMarca.setSize(225,25);
        ventana.add(campoMarca);

        JLabel mensaje4 = new JLabel();
        mensaje4.setText("Unidades:");
        mensaje4.setLocation(125,205);
        mensaje4.setSize(225,25);
        ventana.add(mensaje4);

        JTextField campoUnidades= new JTextField();
        campoUnidades.setLocation(125,235);
        campoUnidades.setSize(225,25);
        ventana.add(campoUnidades);

        JButton boton = new JButton("Obtener datos");
        boton.setLocation(125,265);
        boton.setSize(225,25);
        ventana.add(boton);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                String nombreIngresado= campoNombre.getText();
                String precioIngresado=campoPrecio.getText();
                String marcaIngresada=campoMarca.getText();
                String unidadesIngresada=campoUnidades.getText();

                float precio=Float.parseFloat(precioIngresado);
                int unidades=Integer.parseInt(unidadesIngresada);

                registroDeCompra1.setNombreObjeto(nombreIngresado);
                registroDeCompra1.setPrecioObjeto(precio);
                registroDeCompra1.setMarcaObjeto(marcaIngresada);
                registroDeCompra1.setUnidadesObjeto(unidades);

                compra.add(registroDeCompra1);
            }
        });
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){

            }
        });
    }
}
