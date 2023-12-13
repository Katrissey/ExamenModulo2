package main.java.es.curso.java.examenpractico.parte1;

public class Master extends CursoImpl {
	
	//Declaramos los atributos
	private boolean oficial;
	
	
	//Generamos los constructores
	/**
	 * @param nombre
	 * @param codigo
	 * @param cupo
	 * @param oficial
	 */
	public Master(String nombre, long codigo, int cupo, boolean oficial) {
		super(nombre, codigo, cupo);
		this.oficial = oficial;
	}

	/**
	 * Constructor heredado de clase Curso
	 * @param nombre
	 * @param codigo
	 * @param cupo
	 */
	public Master(String nombre, long codigo, int cupo) {
		super(nombre, codigo, cupo);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor heredado de clase Curso
	 * @param nombre
	 * @param cupo
	 */
	public Master(String nombre, int cupo) {
		super(nombre, cupo);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor heredado de clase Curso
	 * @param nombre
	 */
	public Master(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	//Generamos Getter y Setter de esta clase
	/**
	 * @return the oficial
	 */
	public boolean isOficial() {
		return oficial;
	}

	/**
	 * @param oficial the oficial to set
	 */
	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}

	//Sobreescribimos método To String
	@Override
	public String toString() {
		return "Master [oficial=" + oficial + "]";
	}


}
