package pe.edu.upeu.soap.ws.dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Cliente;

@WebService
public interface ClienteDao {
@WebMethod

public Cliente readCliente(int id) ;
}
