package org.example.persistencia;

import org.example.modelo.Bandas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BandasDAO implements InterfazDAO{
    public BandasDAO(){
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO grupos(genero,banda,cancionConocida,paisOrigen,url) VALUES (?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("rockDB.db").getConnection().prepareStatement(sqlInsert);
        //pstm.setInt(1,(((Bandas)obj).getId()));
        pstm.setString(1,(((Bandas)obj).getGenero()));
        pstm.setString(2,(((Bandas)obj).getBanda()));
        pstm.setString(3,(((Bandas)obj).getCancionConocida()));
        pstm.setString(4,(((Bandas)obj).getPaisOrigen()));
        pstm.setString(5,(((Bandas)obj).getImagenUrl()));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;

    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE grupos SET genero = ?,banda = ?,cancionConocida = ?,paisOrigen = ?,url = ? WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("rockDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Bandas)obj).getGenero());
        pstm.setString(2,((Bandas)obj).getBanda());
        pstm.setString(3,((Bandas)obj).getCancionConocida());
        pstm.setString(4,((Bandas)obj).getPaisOrigen());
        pstm.setString(5,((Bandas)obj).getImagenUrl());
        pstm.setInt(6,((Bandas)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM grupos WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("rockDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sqlObtenerTodo = "SELECT * FROM grupos";
        ArrayList<Bandas> res = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("rockDB.db").getConnection().createStatement();
        ResultSet reSet = stm.executeQuery(sqlObtenerTodo);
        while (reSet.next()){
            res.add(new Bandas(reSet.getInt(1),reSet.getString(2),reSet.getString(3),
                    reSet.getString(4),reSet.getString(5),reSet.getString(6)));
        }
        return res;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sqlBuscarPorId = "SELECT * FROM grupos WHERE id = ?;";
        Bandas bandas = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("rockDB.db").getConnection().prepareStatement(sqlBuscarPorId);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet reSet = pstm.executeQuery();
        if (reSet.next()){
            bandas = new Bandas(reSet.getInt(1),reSet.getString(2),reSet.getString(3),
                    reSet.getString(4),reSet.getString(5),reSet.getString(6));
            return bandas;
        }
        return null;
    }
}
