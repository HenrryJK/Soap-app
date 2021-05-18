package pe.edu.upeu.soap.ws.publico;

import javax.xml.ws.Endpoint;

import pe.edu.upeu.soap.ws.daoImpl.VentasDaoImpl;

public class VentaPublic {
	public static void main(String[] args) {

Endpoint.publish("http://localhost:3131/soap/ventas/id", new VentasDaoImpl());
		System.out.println("Se esta ejecutando");
	}
}
