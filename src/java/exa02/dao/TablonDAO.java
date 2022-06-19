package exa02.dao;

import java.util.List;
import exa02.entity.Tablon;

public interface TablonDAO {
     int create(Tablon tablon);

    int update(Tablon tablon);

    int delete(int idventa);

    Tablon read(int idventa);

    List<Tablon> readAll();
}
