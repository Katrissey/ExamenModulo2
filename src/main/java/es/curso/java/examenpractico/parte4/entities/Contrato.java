package main.java.es.curso.java.examenpractico.parte4.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Generamos las anotaciones de configuración y los atributos que corresponden con las columnas de las tablas
@Entity
@Table
public class Contrato {
	//Establecemos la id como la primary key
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE) //Es la PK, obligatoria en hibernate
	private Long id;	
	
	@Column (length = 20, name = "NOMBRE_CLIENTE")
	private String nombreCliente;
	
	@Column (name = "FECHA_INICIO")
	private Date fechaInicio;
	@Column (name = "FECHA_FIN")
	private Date fechaFin;
	@Column (name = "IMPORTE")
	private int importe;
	
	/**
	 * Generamos el constructor vacío para que hibernate pueda operar a través de él
	 */
	public Contrato() {
		super();
	}

}
