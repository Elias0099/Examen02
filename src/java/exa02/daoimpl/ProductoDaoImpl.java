package exa02.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exa02.config.Conexion;
import exa02.dao.ProductoDao;
import exa02.entity.Productos;

public class ProductoDaoImpl implements ProductoDao {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Productos p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Productos p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Productos read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public List<Productos> readAll() {
        String SQL = "Select * from productos";
        List<Productos> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos d = new Productos();
                d.setIdproducto(rs.getInt("idproducto"));
                d.setNombre(rs.getString("nombre"));
                d.setPrecio(rs.getInt("precio"));
                d.setStock(rs.getDouble("stock"));


                lista.add(d);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    }

   
    
