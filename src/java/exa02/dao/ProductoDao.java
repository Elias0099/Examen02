package exa02.dao;

import java.util.List;
import java.util.Map;
import exa02.entity.Productos;

public interface ProductoDao {
    int create(Productos p);
    int update(Productos p);
    int delete(int id);
    Productos read(int id);
    List<Productos> readAll();
  
}
