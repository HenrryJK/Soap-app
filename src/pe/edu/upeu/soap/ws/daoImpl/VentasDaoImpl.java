package pe.edu.upeu.soap.ws.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.jws.WebService;

import pe.edu.upeu.soap.ws.dao.VentasDao;
import pe.edu.upeu.soap.ws.entity.Ventas;
import pe.edu.upeu.soap.ws.util.Conexion;
@WebService(endpointInterface = "pe.edu.upeu.soap.ws.dao.VentasDao")	
public class VentasDaoImpl implements VentasDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	@Override
	public Ventas readVenta(int id) {
		Ventas vent = new Ventas();
		try {
			cx = Conexion.getConexion();
			ps =cx.prepareStatement("select *from venta where idventa=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {				
				vent.setIdventa(rs.getInt("idventa"));
				vent.setFecha(rs.getString("fecha"));
				vent.setTipodoc(rs.getString("tipodoc"));
				vent.setNumdoc(rs.getString("numdoc"));
				vent.setIdcliente(rs.getInt("idcliente"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return vent;
	}

}
