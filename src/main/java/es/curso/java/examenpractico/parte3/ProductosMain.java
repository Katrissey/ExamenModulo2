package main.java.es.curso.java.examenpractico.parte3;

import java.sql.SQLException;

import main.java.es.curso.java.examenpractico.parte3.dao.ProductosDAO;
import main.java.es.curso.java.examenpractico.parte3.entities.Productos;

public class ProductosMain {

	public static void main(String[] args) {
		ProductosMain pm = new ProductosMain ();
		pm.iniciarProductos ();

	}
	
	public void iniciarProductos () {
		//Creaamos 6 productos nuevos, 2 de cada tipo
		Productos producto1 = new Productos (1, "producto1", "Alimentación", 2.77, 3);
		Productos producto2 = new Productos (2, "producto2", "Alimentación", 3.75, 5);
		Productos producto3 = new Productos (3, "producto3", "Electrónica", 2.57, 4);
		Productos producto4 = new Productos (4, "producto4", "Electrónica", 4.77, 6);
		Productos producto5 = new Productos (5, "producto5", "Ropa", 2.87, 2);
		Productos producto6 = new Productos (6, "producto6", "Ropa", 8.79, 7);
		
		//Insertamos los 6 productos en la tabla TB_PRODUCTOS
		ProductosDAO pd = null;
		try {
			pd = new ProductosDAO ();
			pd.insertarProductos(producto1);
			pd.insertarProductos(producto2);
			pd.insertarProductos(producto3);
			pd.insertarProductos(producto4);
			pd.insertarProductos(producto5);
			pd.insertarProductos(producto6);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Consultamos todos los productos de la tabla
		try {
			pd.getProductos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
