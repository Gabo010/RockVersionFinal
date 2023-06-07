package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Bandas {
    private int id;
    private String genero;
    private String banda;
    private String cancionConocida;
    private String paisOrigen;
    private String imagenUrl;

    public Bandas() {
    }

    public Bandas(int id, String genero, String banda, String cancionConocida, String paisOrigen, String imagenUrl) {
        this.id = id;
        this.genero = genero;
        this.banda = banda;
        this.cancionConocida = cancionConocida;
        this.paisOrigen = paisOrigen;
        this.imagenUrl = imagenUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCancionConocida() {
        return cancionConocida;
    }

    public void setCancionConocida(String cancionConocida) {
        this.cancionConocida = cancionConocida;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Override
    public String toString() {
        return "Bandas{" +
                "id=" + id +
                ", genero='" + genero + '\'' +
                ", banda='" + banda + '\'' +
                ", cancionConocida='" + cancionConocida + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException{
        URL imaUrl = new URL(this.imagenUrl);
        return new ImageIcon(imaUrl);
    }
}
