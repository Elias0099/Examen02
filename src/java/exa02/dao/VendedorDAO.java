package exa02.dao;

/**
 *
 * @author elias
 */

import java.util.List;
import exa02.entity.Vendedor;

public interface VendedorDAO {

    int create(Vendedor vendedor);

    int update(Vendedor vendedor);

    int delete(int idvendedor);

    Vendedor read(int idvendedor);

    List<Vendedor> readAll();
}
