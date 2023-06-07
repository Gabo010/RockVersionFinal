package org.example.controlador;

import org.example.modelo.Bandas;
import org.example.modelo.ModeloTabla;
import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorBandas extends MouseAdapter {
    private Ventana view;
    private ModeloTabla modelo;

    public ControladorBandas(Ventana view) {
        this.view = view;
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTabla().addMouseListener(this);
        this.view.getBtnModificar().addMouseListener(this);
        this.view.getBtnBorrar().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        modelo = new ModeloTabla();
        this.view.getTabla().setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnAgregar()) {
            Bandas bandas = new Bandas();
            try {
                bandas.setId(Integer.valueOf(this.view.getTxtId().getText()));
                bandas.setGenero(this.view.getTxtGenero().getText());
                bandas.setBanda(this.view.getTxtBanda().getText());
                bandas.setCancionConocida(this.view.getTxtCancionConocida().getText());
                bandas.setPaisOrigen(this.view.getTxtPaisOrigen().getText());
                bandas.setImagenUrl(this.view.getTxtUrl().getText());
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Datos invalidos");
            }
            if (modelo.agregarBandas(bandas)){
                JOptionPane.showMessageDialog(view,"Se agrego","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(view,"Algo paso.....","Error",JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpieza();

            /*this.view.getTabla().updateUI();
            this.view.getTxtId().setText("");
            this.view.getTxtGenero().setText("");
            this.view.getTxtBanda().setText("");
            this.view.getTxtCancionConocida().setText("");
            this.view.getTxtPaisOrigen().setText("");
            this.view.getTxtUrl().setText("");*/
        }
        if (e.getSource() == view.getBtnCargar()){
            System.out.println("Cargar");
            modelo = new ModeloTabla();
            modelo.cargarInfo();
            this.view.getTabla().setModel(modelo);
            this.view.getTabla().updateUI();
        }
        if (e.getSource() == view.getTabla()){
            int index = this.view.getTabla().getSelectedRow();
            Bandas bandas = modelo.getBandaIndex(index);
            try {
                this.view.getImagenBandas().setIcon(bandas.getImagen());
            }catch (MalformedURLException murle){
                JOptionPane.showMessageDialog(null,"La imagen no se puede mostrar");
            }
            view.getTxtGenero2().setText(bandas.getGenero());
            view.getTxtBanda2().setText(bandas.getBanda());
            view.getTxtCancionConocida2().setText(bandas.getCancionConocida());
            view.getTxtPaisOrige2n().setText(bandas.getPaisOrigen());
            view.getTxtUrl2().setText(bandas.getImagenUrl());
        }
        if (e.getSource() == view.getBtnModificar()){
            int renglon = view.getTabla().getSelectedRow();
            Bandas bandasMod = modelo.getBandaIndex(renglon);

            bandasMod.setGenero(this.view.getTxtGenero2().getText());
            bandasMod.setBanda(this.view.getTxtBanda2().getText());
            bandasMod.setCancionConocida(this.view.getTxtCancionConocida2().getText());
            bandasMod.setPaisOrigen(this.view.getTxtPaisOrige2n().getText());
            bandasMod.setImagenUrl(this.view.getTxtUrl2().getText());

            if (modelo.modificarBanda(bandasMod)){
                JOptionPane.showMessageDialog(view,"Se modifico correctamente","Actualizacion",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTabla().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"Ocurrio un error","Error",JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpieza();

            /*this.view.getTxtGenero2().setText("");
            this.view.getTxtBanda2().setText("");
            this.view.getTxtCancionConocida2().setText("");
            this.view.getTxtPaisOrige2n().setText("");
            this.view.getTxtUrl2().setText("");*/

        }
        if (e.getSource() == view.getBtnBorrar()){
            ModeloTabla tabla = new ModeloTabla();
            int index = this.view.getTabla().getSelectedRow();
            Bandas bandas = modelo.getBandaIndex(index);
            if (tabla.deleteBanda(Integer.toString(bandas.getId()))){
                JOptionPane.showMessageDialog(view,"Se elimino correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTabla().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"Ocurrio un error al tratar de eliminarlo","Aviso",JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpieza();
            /*this.view.getTxtGenero2().setText("");
            this.view.getTxtBanda2().setText("");
            this.view.getTxtCancionConocida2().setText("");
            this.view.getTxtPaisOrige2n().setText("");
            this.view.getTxtUrl2().setText("");*/

        }


    }
}

