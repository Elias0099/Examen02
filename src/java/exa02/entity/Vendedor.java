
package exa02.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vendedor {
 private int idvendedor;
 private String nombre;
 private int idpersona;
}
