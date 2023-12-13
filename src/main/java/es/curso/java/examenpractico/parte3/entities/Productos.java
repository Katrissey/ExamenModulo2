package main.java.es.curso.java.examenpractico.parte3.entities;

public class Productos {
	
	//Declaramos los atributos
	private int id;
	private String nombreProducto;
	private String tipo;
	private double precio;
	private int cantidadStock;
	
	//Generamos los constructores
	/**
	 * @param id
	 * @param nombreProducto
	 * @param tipo
	 * @param precio
	 * @param cantidadStock
	 */
	public Productos(int id, String nombreProducto, String tipo, double precio, int cantidadStock) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.tipo = tipo;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}

	/**
	 * @param nombreProducto
	 * @param tipo
	 * @param precio
	 * @param cantidadStock
	 */
	public Productos(String nombreProducto, String tipo, double precio, int cantidadStock) {
		super();
		this.nombreProducto = nombreProducto;
		this.tipo = tipo;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}

	/**
	 * @param nombreProducto
	 * @param tipo
	 * @param cantidadStock
	 */
	public Productos(String nombreProducto, String tipo, int cantidadStock) {
		super();
		this.nombreProducto = nombreProducto;
		this.tipo = tipo;
		this.cantidadStock = cantidadStock;
	}

	/**
	 * @param nombreProducto
	 * @param cantidadStock
	 */
	public Productos(String nombreProducto, int cantidadStock) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidadStock = cantidadStock;
	}

	//Generamos los Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}

	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * @return the cantidadStock
	 */
	public int getCantidadStock() {
		return cantidadStock;
	}

	/**
	 * @param cantidadStock the cantidadStock to set
	 */
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	//Sobreescribimos el método To String
	@Override
	public String toString() {
		return "Productos [id=" + id + ", " + (nombreProducto != null ? "nombreProducto=" + nombreProducto + ", " : "")
				+ (tipo != null ? "tipo=" + tipo + ", " : "") + "precio=" + precio + ", cantidadStock=" + cantidadStock
				+ "]";
	}
	
	

}
