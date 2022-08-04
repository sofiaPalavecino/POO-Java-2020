package clases;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class Usuario{
    private String NombreUsuario;
    private String ApellidoUsuario;
    private int EdadUsuario;

    public Usuario(String NombreUsuario_N, String ApellidoUsuario_N, int EdadUsuario_N) {
        this.NombreUsuario = NombreUsuario_N;
        this.ApellidoUsuario = ApellidoUsuario_N;
        this.EdadUsuario = EdadUsuario_N;
    }

    public Usuario() {
        this.NombreUsuario = "Juan";
        this.ApellidoUsuario = "Martinez";
        this.EdadUsuario = 24;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    public int getEdadUsuario() {
        return EdadUsuario;
    }

    public void setNombreUsuario(String NombreUsuario_N) {
        this.NombreUsuario = NombreUsuario_N;
    }

    public void setApellidoUsuario(String ApellidoUsuario_N) {
        this.ApellidoUsuario = ApellidoUsuario_N;
    }

    public void setEdadUsuario(int EdadUsuario_N) {
        this.EdadUsuario = EdadUsuario_N;
    }
}
