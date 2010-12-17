package com.myia.example.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;


import com.myia.example.domain.Product;

public class SBJPAtry {
	
	public boolean letscreatesomething (Product aProduct) {
		
		EntityManagerFactory emf= EMF.get();
		
		
	    EntityManager em = emf.createEntityManager();	
	    
	    try {         // ... do stuff with em ... 
	    	em.persist(aProduct);
	    	
	    } 
	    	
	    finally {         em.close();     }

	    
	    
	    return true;
	}

	public List getAll()  {
		
	    EntityManager em = EMF.get().createEntityManager();
	    List results;
	    Query q = em.createQuery("SELECT p FROM Product p");

	    try {         // ... do stuff with em ... 
	    	results = q.getResultList();
	    	results.size();
	    } 
	    	
	    finally {         em.close();     }
	
	    return results;
	   
	}
	
	//throw new UnsupportedOperationException()

}
