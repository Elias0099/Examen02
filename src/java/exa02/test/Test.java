package exa02.test;

import com.google.gson.Gson;
import exa02.config.Conexion;
import exa02.dao.VendedorDAO;
import exa02.daoimpl.VendedorDaoImpl;


public class Test {

    static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    static Gson gson = new Gson();
    static VendedorDAO vendedorDAO = new VendedorDaoImpl();

    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println(gson.toJson(vendedorDAO.readAll()));

        if (Conexion.getConexion() != null) {
            System.out.println("si");

        } else {
            System.out.println("no");
        }

    }

}
