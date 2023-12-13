package main.java.es.curso.java.examenpractico.parte3.dao;

import java.sql.Connection;
import java.sql.SQLException;

import main.java.es.curso.java.examenpractico.parte3.UtilsDataBase;

public abstract class ConexionDAO {
	private Connection conexion;

	public ConexionDAO() throws SQLException {
		super();
		this.conexion = UtilsDataBase.getInstance();
	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}
	
	
	
}
