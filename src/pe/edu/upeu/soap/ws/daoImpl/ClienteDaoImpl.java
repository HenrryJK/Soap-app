package pe.edu.upeu.soap.ws.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.jws.WebService;

import pe.edu.upeu.soap.ws.dao.ClienteDao;
import pe.edu.upeu.soap.ws.entity.Cliente;
import pe.edu.upeu.soap.ws.util.Conexion;
@WebService(endpointInterface = "pe.edu.upeu.soap.ws.dao.ClienteDao")	
public class ClienteDaoImpl implements ClienteDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	@Override
	public Cliente readCliente(int id) {
		Cliente cli = new Cliente();
		try {
			cx = Conexion.getConexion();
			ps =cx.prepareStatement("select *from cliente where idcliente=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {				
				cli.setIdcliente(rs.getInt("idcliente"));
				cli.setNombres(rs.getString("nombres"));
				cli.setApellidos(rs.getString("apellidos"));
				cli.setDni(rs.getString("dni"));
				cli.setDireccion(rs.getString("direccion"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return cli;
	}
}
