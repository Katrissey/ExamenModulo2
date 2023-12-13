package main.java.es.curso.java.examenpractico.parte2;

public class MainParte2 {

	public static void main(String[] args) {
		MainParte2 mp2 = new MainParte2 ();
		mp2.iniciarParte2 ();

	}
	
	public void iniciarParte2 () {
		
		//Leer todas las líneas del fichero proporcionado
		String nombreArchivo = "D:\\WorkSpace\\ProyectoExamenModulo2\\src\\main\\java\\es\\curso\\java\\examenpractico\\parte2\\FicheroEjercicio2.txt";
		ArchivoServicio servicio = new ArchivoServicio ();
		
		//Hacemos un "try-catch" para controlar la IOException del método "leerArchivo3"
		try {
			System.out.println (servicio.leerArchivo3(nombreArchivo));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		
	}

}
