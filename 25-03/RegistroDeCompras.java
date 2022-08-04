package clases;
import java.util.ArrayList;
import java.util.Scanner;
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

    public float PrecioTotalCompra(RegistroDeCompras compra1){
        float precio=(compra1.getPrecioObjeto()*compra1.getUnidadesObjeto());
        return precio;
    }

    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        ArrayList<RegistroDeCompras> Usuarios=new ArrayList<>();
        RegistroDeCompras compra1=new RegistroDeCompras();

        System.out.println("Ingrese precio por unidad");
        float PrecioIngresado=ingreso.nextFloat();
        System.out.println(PrecioIngresado);

        System.out.println("Ingrese nombre de objeto");
        String NombreObjetoIngresado=ingreso.nextLine();
        System.out.println(NombreObjetoIngresado);

        
        System.out.println("Ingrese Marca");
        String MarcaIngresada=ingreso.nextLine();
        System.out.println(MarcaIngresada);

        System.out.println("Ingrese cant unidades");
        int UnidadesIngresadas=ingreso.nextInt();
        System.out.println(UnidadesIngresadas);

        compra1.setPrecioObjeto(PrecioIngresado);
        compra1.setNombreObjeto(NombreObjetoIngresado);
        compra1.setMarcaObjeto(MarcaIngresada);
        compra1.setUnidadesObjeto(UnidadesIngresadas);

        Usuarios.add(compra1);

        System.out.println("Valor total de la compra: "+compra1.PrecioTotalCompra(compra1));
    }
}
