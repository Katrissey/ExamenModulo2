package main.java.es.curso.java.examenpractico.parte1;

public class CursoImpl implements Curso {
	
	//Declaramos los atributos
	private String nombre;
	private long codigo;
	private int cupo;

	//Sobreescribimos los métodos de la interfaz Curso
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public long getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public int getCupo() {
		// TODO Auto-generated method stub
		return cupo;
	}

	//Generamos los Getters y Setters
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		nombre = nombre;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		codigo = codigo;
	}

	/**
	 * @param cupo the cupo to set
	 */
	public void setCupo(int cupo) {
		cupo = cupo;
	}

	//Generamos los constructores
	/**
	 * @param nombre
	 * @param codigo
	 * @param cupo
	 */
	public CursoImpl(String nombre, long codigo, int cupo) {
		super();
		nombre = nombre;
		codigo = codigo;
		cupo = cupo;
	}

	/**
	 * @param nombre
	 * @param cupo
	 */
	public CursoImpl(String nombre, int cupo) {
		super();
		nombre = nombre;
		cupo = cupo;
	}

	/**
	 * @param nombre
	 */
	public CursoImpl(String nombre) {
		super();
		nombre = nombre;
	}

	//Sobreescribimos el método To String
	@Override
	public String toString() {
		return "CursoImpl [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "codigo=" + codigo + ", cupo=" + cupo
				+ "]";
	}

	
	
}
