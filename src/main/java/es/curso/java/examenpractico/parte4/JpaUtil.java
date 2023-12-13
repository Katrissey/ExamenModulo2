package main.java.es.curso.java.examenpractico.parte4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil { 
//    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();
//
//    private static EntityManagerFactory buildEntityManagerFactory(){
//        return Persistence.createEntityManagerFactory("ejemploHibernate");
//    }
//
//    public static EntityManager getEntityManager() { 
//        return entityManagerFactory.createEntityManager();
//    }
//    
    public static EntityManager getEM (String persistenceUnit) { //Con este método ya no es necesario todo lo anterior ya que éste es dinñamico, sirve para conectar con cualquier BD
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
    	EntityManager em = emf.createEntityManager(); 
    	
    	return em;
    }
} 
