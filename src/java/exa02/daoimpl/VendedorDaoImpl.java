package exa02.daoimpl;

/**
 *
 * @author elias
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import exa02.config.Conexion;
import exa02.dao.VendedorDAO;
import exa02.entity.Vendedor;

public class VendedorDaoImpl implements exa02.dao.VendedorDAO{
private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public int update(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int idvendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vendedor read(int idvendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


@Override
    public List<Vendedor> readAll() {String SQL = "SELECT vendedor.idvendedor, vendedor.nombre, vendedor.idpersona FROM vendedor";
        List<Vendedor> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedor s = new Vendedor();
                s.setIdvendedor(rs.getInt("idvendedor"));
                s.setIdpersona(rs.getInt("idpersona"));
                s.setNombre(rs.getString("nombre"));
               
           
                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

  
    
}
 