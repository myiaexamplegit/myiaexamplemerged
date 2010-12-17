package com.myia.example;
import org.springframework.stereotype.Controller;   


import org.springframework.ui.Model;   
import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.RequestMethod;  

import com.google.appengine.api.users.User; 
import com.google.appengine.api.users.UserService; 
import com.google.appengine.api.users.UserServiceFactory;

@Controller  
public class MyiaTestController {

	@RequestMapping(value = "/test.do", method = RequestMethod.POST)   
    public String get(String name, Model model) {   
        model.addAttribute("name", name);   
        return "test";   
    }   
	
	@RequestMapping(value = "/gusersonly.do", method = RequestMethod.GET)   
    public String islogged(String name, Model model) {  

        UserService userService = UserServiceFactory.getUserService();         
        User user = userService.getCurrentUser();
        
        if (user != null) {             
            model.addAttribute("name", user.getNickname());   
            return "gusersonly";
            } 
        else {      
        	
        	return "redirect:" + userService.createLoginURL("/gusersonly.do");

    }   
	}
	/*
	@RequestMapping(value = "/printenvironment.do", method = RequestMethod.POST)   
    public String printenvironment(String name, Model model) {   
        model.addAttribute("name", name);   
        
        
        return "printenvironment";   
    }*/
	
}
