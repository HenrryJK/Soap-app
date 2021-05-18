package pe.edu.upeu.soap.ws.dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Ventas;

@WebService
public interface VentasDao {
	@WebMethod
	public Ventas readVenta(int id) ;
}
