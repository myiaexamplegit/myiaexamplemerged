package com.myia.example.domain;
import java.io.Serializable;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Entity; 
import com.google.appengine.api.datastore.Key; 

@Entity 
public class Product implements Serializable {
	
	@Id     
	@GeneratedValue(strategy = GenerationType.IDENTITY)     
	private Key key; 
	private String description;
    private Double price;
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Price: " + price);
        return buffer.toString();
    }

	public void setKey(Key key) {
		this.key = key;
	}

	public Key getKey() {
		return key;
	}

}
