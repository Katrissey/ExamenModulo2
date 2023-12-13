package main.java.es.curso.java.examenpractico.parte4.DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.persistence.EntityManager;
import main.java.es.curso.java.examenpractico.parte4.JpaUtil;

public class ContratoDAO {
	
	private static final Logger logger = LogManager.getLogger(ContratoDAO.class);
	private static EntityManager em =JpaUtil.getEM("ConexionOracleHibernate");

}
