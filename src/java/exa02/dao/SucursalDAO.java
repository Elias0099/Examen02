package exa02.dao;

import java.util.List;
import exa02.entity.Sucursales;

public interface SucursalDAO  {
      int create(Sucursales sucursales);
    int update(Sucursales sucursales);
    int delete(int idsucursal);
    Sucursales read(int idsucursales);
    List<Sucursales> readAll();
}
