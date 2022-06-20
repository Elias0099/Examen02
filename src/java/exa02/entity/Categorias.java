package exa02.entity;

/**
 *
 * @author elias
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Categorias {
    private int idcategoria;
    private String nombre;
    private String estado;
}
