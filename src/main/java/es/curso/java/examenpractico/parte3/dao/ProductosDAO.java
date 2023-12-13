package main.java.es.curso.java.examenpractico.parte3.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.java.es.curso.java.examenpractico.parte3.entities.Productos;



public class ProductosDAO extends ConexionDAO {
	private static final Logger logger = LogManager.getLogger(ProductosDAO.class);
	
	public ProductosDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Creamos método para insertar productos en la tabla de productos
	public int insertarProductos(Productos producto) throws SQLException {
		logger.debug("insertarProductos "+producto);

		String query = "INSERT "
				+ "INTO TB_PRODUCTOS (id,nombre,tipo,precio,cantidadStock) "
				+ "VALUES (?,?,?,?,?)";
		
		logger.debug("query: "+query);
		PreparedStatement ps = this.getConexion().prepareStatement(query);
		ps.setInt(1, producto.getId());
		ps.setString(2, producto.getNombreProducto());
		ps.setString(3, producto.getTipo());
		ps.setDouble(4, producto.getPrecio());
		ps.setInt(5, producto.getCantidadStock());
		
		int insertados = ps.executeUpdate();
		logger.debug("Productos insertados "+insertados);
		
		return insertados;
	}
	
	//Creamos método para consulotar todos los productos
public List<Productos> getProductos () throws SQLException {
		
		List<Productos> productos = new ArrayList<Productos>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT id, nombre, tipo, precio, cantidadStock\r\n"
				+ "FROM TB_PRODUCTOS";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String nombreProducto = rs.getString("nombre");
			String tipo = rs.getString("tipo");
			double precio = rs.getDouble("precio");
			int cantidadStock = rs.getInt("cantidadStock");
		
			Productos producto = new Productos (id, nombreProducto, tipo, precio, cantidadStock);
			productos.add(producto);
		}
		
		return productos;
	}

}
