package com.company;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner ingresoPalabra = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String palabra = ingresoPalabra.nextLine();

        JFrame ventana=new JFrame();
        ventana.setLayout(null);
        ventana.setSize(500,500);
        ventana.setVisible(true);

        JLabel texto1=new JLabel();
        texto1.setText(palabra);
        texto1.setSize(500,25);
        texto1.setLocation(25,25);

        JButton boton=new JButton("Triplicar");
        boton.setSize(500,33);
        boton.setLocation(25,85);

        ventana.add(texto1);
        ventana.add(boton);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 1; i <= 2; i++) {
                    String texto = texto1.getText();
                    texto = texto + texto;
                    texto1.setText(texto);
                }
            }
        });

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
    }
}
