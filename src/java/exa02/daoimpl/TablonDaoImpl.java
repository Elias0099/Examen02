package exa02.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import exa02.config.Conexion;
import exa02.dao.TablonDAO;
import exa02.entity.Tablon;

public class TablonDaoImpl implements TablonDAO{
private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Tablon tablon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Tablon tablon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int idventa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tablon read(int idventa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tablon> readAll() {
        
        String SQL = "SELECT ventas.idventa AS \"id\", sucursales.direccion AS \"sucursal\",vendedor.nombre AS \"vendedor\",personas.nombres AS \"cliente\",ventas.fecha AS \"fecha\" FROM ventas,sucursales,personas,vendedor ORDER BY 1";
        List<Tablon> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Tablon v = new Tablon();
                v.setIdventa(rs.getInt("id"));
                v.setSucursal(rs.getString("sucursal"));
                v.setVendedor(rs.getString("vendedor")); 
                v.setCliente(rs.getString("cliente"));
                v.setFecha(rs.getString("fecha"));

                lista.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    }
    

