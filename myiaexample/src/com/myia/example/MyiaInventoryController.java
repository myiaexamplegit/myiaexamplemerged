package com.myia.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;   
import org.springframework.ui.Model;   
import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.RequestMethod;  

import com.myia.example.data.SBJPAtry;
import com.myia.example.domain.Product;
import com.myia.example.repository.ProductDao;
import com.myia.example.service.ProductManager;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@Controller  
public class MyiaInventoryController {
	
    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private ProductManager productManager;
    
    //productDao
    @Autowired
    private ProductDao productDao;

	@RequestMapping(value = "/producttest.do", method = RequestMethod.POST)
    public String get(String name, Model model) {

        String now = (new java.util.Date()).toString();
        logger.info("returning hello view with " + now);

        model.addAttribute("now", now);
        model.addAttribute("products", this.productManager.getProducts());
        model.addAttribute("name", name);   
        return "producttest";   
    }   
	
	
	@RequestMapping(value = "/producttest.do", method = RequestMethod.GET)
    public String doGet(String name, Model model) {
		return get(name, model);
	}
	
	@RequestMapping(value = "/productsamplecreate.do", method = RequestMethod.GET)
    public String doSampleCreate(String name, Model model) {		
		
		Product product = this.productManager.getProducts().get(1);
		SBJPAtry sBJPAtry = new SBJPAtry();
		sBJPAtry.letscreatesomething(product);
		
		
		return doProductList(name, model);
	}
	
	@RequestMapping(value = "/productlist.do", method = RequestMethod.GET)
    public String doProductList(String name, Model model) {		
		
		//SBJPAtry sBJPAtry = new SBJPAtry();
        //model.addAttribute("products", sBJPAtry.getAll());
		
		model.addAttribute("products", productDao.getProductList());
		return "producttest";
	}
	
	

	
	
	 //public void setProductManager(ProductManager productManager) {
	 //       this.productManager = productManager;
	 //   }


}
