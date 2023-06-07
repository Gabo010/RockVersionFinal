package org.example;

import org.example.controlador.ControladorBandas;
import org.example.vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Grupos de Rock");
        ControladorBandas controller = new ControladorBandas(ventana);
    }
}