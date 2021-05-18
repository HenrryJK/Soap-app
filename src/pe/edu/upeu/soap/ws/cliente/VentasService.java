package pe.edu.upeu.soap.ws.cliente;


import pe.edu.upeu.soap.ws.daoImpl.ClienteDao;
import pe.edu.upeu.soap.ws.daoImpl.ClienteDaoImplService;
import pe.edu.upeu.soap.ws.daoImpl.VentasDao;
import pe.edu.upeu.soap.ws.daoImpl.VentasDaoImplService;

public class VentasService {
	
	public static void main(String[] args) {
		VentasDaoImplService vents = new VentasDaoImplService();
	VentasDao vd = vents.getVentasDaoImplPort();
	System.out.print("Fecha Inicio: ");
	System.out.println(vd.readVenta(1).getFecha());
	
	System.out.print("Fecha Fin: ");
	System.out.println(vd.readVenta(3).getFecha());
	
		ClienteDaoImplService cli = new ClienteDaoImplService();
		ClienteDao cl = cli.getClienteDaoImplPort();
	System.out.print("Cliente: ");
	System.out.println(cl.readCliente(1).getNombres());
	
	}
	
	
}
