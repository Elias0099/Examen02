
package exa02.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import exa02.config.Conexion;
import exa02.dao.VentasDAO;
import exa02.entity.Ventas;

public class VentasDaoImpl implements VentasDAO {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Ventas ventas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Ventas ventas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int idventas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ventas read(int idventas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Ventas> readAll() {
        String SQL = "Select *from ventas";
        List<Ventas> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ventas v = new Ventas();
                v.setIdventas(rs.getInt("idventa"));
                v.setFecha(rs.getString("fecha"));
                v.setIdusuario(rs.getInt("idusuario"));
                v.setIdcliente(rs.getInt("idcliente"));
                v.setIdsucursal(rs.getInt("idsucursal"));

                lista.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

}
