package exa02.dao;

import java.util.List;
import exa02.entity.Detalles;

public interface DetallesDAO {
     int create(Detalles detalles);
    int update(Detalles detalles);
    int delete(int iddetalles);
    Detalles read(int iddetalles);
    List<Detalles> readAll();
}
