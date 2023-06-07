package org.example.modelo;

import org.example.persistencia.BandasDAO;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Bandas> datos;
    private BandasDAO banDAO = new BandasDAO();
    public ModeloTabla(){
        datos = new ArrayList<>();
        banDAO = new BandasDAO();
    }
    public ModeloTabla(ArrayList<Bandas> datos){
        this.datos = datos;
        banDAO = new BandasDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String NomColums = "";
        switch (columnIndex){
            case 0:
                NomColums = "ID";
                break;
            case 1:
                NomColums = "Genero";
                break;
            case 2:
                NomColums = "Banda";
                break;
            case 3:
                NomColums = "Cancion mas Conocida";
                break;
            case 4:
                NomColums = "Pais de Origen";
                break;
            case 5:
                NomColums = "Imagen";
                break;
        }
        return NomColums;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

            default:
                return String.class;

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bandas bandas = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return bandas.getId();
            case 1:
                return bandas.getGenero();
            case 2:
                return bandas.getBanda();
            case 3:
                return bandas.getCancionConocida();
            case 4:
                return bandas.getPaisOrigen();
            case 5:
                return bandas.getImagenUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
               datos.get(rowIndex).setId((int) aValue);
                break;
            case 1:
                datos.get(rowIndex).setGenero((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setBanda((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setCancionConocida((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setPaisOrigen((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setImagenUrl((String) aValue);
                break;

        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public boolean agregarBandas(Bandas bandas){
        boolean res = false;
        try {
            if (banDAO.insertar(bandas)){
                datos.add(bandas);
                res = true;
            }else {
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public boolean modificarBanda(Bandas bandas){
        boolean res = false;
        try {
            if (banDAO.update(bandas)){
                res = true;
            }else {
                res = true;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public boolean deleteBanda(String id){
        boolean res = false;
        try {
            if (banDAO.delete(id)){
                res = true;
            }else {
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public Bandas getBandaIndex(int index){
        if (index >= 0 && index < datos.size()){
            return datos.get(index);
        }else {
            return null;
        }
    }
    public void cargarInfo(){
        try {
            datos = banDAO.obtenerTodo();
        }catch (SQLException sqle){
            JOptionPane.showMessageDialog(null,"No se pudo obtener los datos");
        }
    }
}
