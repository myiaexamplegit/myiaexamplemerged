package com.myia.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
//import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.myia.example.data.EMF;
import com.myia.example.domain.Product;

public class JpaProductDao 
	//extends SimpleJdbcDaoSupport 
implements ProductDao {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    public List<Product> getProductList() {
        logger.info("Getting products!");
        
	    EntityManager em = EMF.get().createEntityManager();
	    List results;
	    Query q = em.createQuery("SELECT p FROM Product p");
	    
	    try {
	    	results = q.getResultList();
	    	results.size();
	    } 
	    	
	    finally {         em.close();     }
        
        return results;
    }
    
    public void saveProduct(Product prod) {
        logger.info("Saving product: " + prod.getDescription());
        /*
        int count = getSimpleJdbcTemplate().update(
            "update products set description = :description, price = :price where id = :id",
            new MapSqlParameterSource().addValue("description", prod.getDescription())
                .addValue("price", prod.getPrice())
                .addValue("id", prod.getId()));
        logger.info("Rows affected: " + count);*/
    }
    
    /*
    private static class ProductMapper implements ParameterizedRowMapper<Product> {

        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product prod = new Product();
            prod.setId(rs.getInt("id"));
            prod.setDescription(rs.getString("description"));
            prod.setPrice(new Double(rs.getDouble("price")));
            return prod;
        }

    }*/

}