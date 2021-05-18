package pe.edu.upeu.soap.ws.publico;

import javax.xml.ws.Endpoint;

import pe.edu.upeu.soap.ws.daoImpl.ClienteDaoImpl;

public class ClientePublic {
	public static void main(String[] args) {

Endpoint.publish("http://localhost:3030/soap/cliente/id", new ClienteDaoImpl());
		System.out.println("Se esta ejecutando.. Ahora!");
	}
}
