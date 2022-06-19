package exa02.dao;

import java.util.List;
import exa02.entity.Ventas;

public interface VentasDAO {
     int create(Ventas ventas);
    int update(Ventas ventas);
    int delete(int idventas);
    Ventas read(int idventas);
    List<Ventas> readAll();
}
