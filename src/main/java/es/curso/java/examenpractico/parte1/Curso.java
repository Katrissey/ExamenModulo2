package main.java.es.curso.java.examenpractico.parte1;

public interface Curso {
	
	//Declaramos los atributos
	String NOMBRE = null;
	long CODIGO = 0;
	int CUPO = 0;
	
	
	//Creamos los métodos abstractos para obtener el nombre del curso, su código y el cupo disponible del mismo
	
	String getNombre ();
	
	long getCodigo ();
	
	int getCupo ();

}
