package main.java.es.curso.java.examenpractico.parte1;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MainParte1 {
	private static final Logger logger = LogManager.getLogger(MainParte1.class);

	public static void main(String[] args) {
		
		MainParte1 mainParte1 = new MainParte1 ();
		mainParte1.iniciarParte1 ();

	}
	
	public void iniciarParte1 () {
		//Creamos un nuevo mapa
		Map<Long,String> mapa1 = new HashMap<Long,String>();
		
		//Creamos 3 másters nuevos
		Master master1 = new Master ("Máster1", 1111111, 5, true);
		Master master2 = new Master ("Máster2", 2222222, 4, false);
		Master master3 = new Master ("Máster3", 3333333, 6, true);
		
		//Insertamos en el mapa los 3 másters
		mapa1.put ((long)1111111, "Máster1");
		mapa1.put ((long)2222222, "Máster2");
		mapa1.put ((long)3333333, "Máster3");
		
		logger.error(mapa1);
		
		//Eliminamos un máster por su código. Como el código es la clave del mapa, se puede eliminar directamente así:
		mapa1.remove(2222222);
		
	}
	
	

}
