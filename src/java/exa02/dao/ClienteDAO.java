/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exa02.dao;

import java.util.List;
import exa02.entity.Clientes;

public interface ClienteDAO {

    int create(Clientes clientes);

    int update(Clientes clientes);

    int delete(int idcliente);

    Clientes read(int idcliente);

    List<Clientes> readAll();
}
