package com.myia.example;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

import com.google.appengine.api.utils.SystemProperty;

public class MyiaPrintEnvController extends ParameterizableViewController  {
	
	public ModelAndView handleRequestInternal(
	        HttpServletRequest request,
	        HttpServletResponse response) throws Exception {

	        ModelAndView mav = new ModelAndView(getViewName());
	        mav.addObject("message", "Hello World!");
	        String[] nameArray; 
	        
	        
	        //serverInfo
	        mav.addObject("serverInfo", this.getServletContext().getServerInfo());
	        
	        //serverEnvironment
	        if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {  
		        mav.addObject("serverEnvironment", SystemProperty.Environment.Value.Production);  		
          
	        	} 
	        		else {
	    		        mav.addObject("serverEnvironment", SystemProperty.Environment.Value.Development);  		
	        		}  
	        
	        //serverVersion
	        mav.addObject("serverVersion", SystemProperty.version);
	        
	        
	        //environment variables
	        
	        Map<String, String> environment = System.getenv();          
	        nameArray = environment.keySet().toArray(new String[] {});          
	        Arrays.sort(nameArray);  
	        
	        mav.addObject("environment", environment);
	        mav.addObject("nameArray", nameArray);
	        
	        //environment properties
	        
	        Properties systemProperties = System.getProperties(); 
	        mav.addObject("systemProperties", systemProperties);

	        //file system
	        String filesystem = new String();
            //PrintWriter out = new PrintWriter(filesystem);
	        filesystem = printDirectoryListing(new File("."), "");          
	        mav.addObject("filesystem", filesystem);

	        //needs to set the view - should be done in xml declaration I guess
	        return mav;  
	        
	    }
	
	
	public static String escapeHtmlChars(String inStr) {          
		return inStr.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");      
	}  
	
	public static String printDirectoryListing(File dir, String indent) {    
		
		StringBuffer sb = new StringBuffer();
		
		if (dir.isDirectory()) {   
			sb.append(indent + escapeHtmlChars(dir.getName()) + "/");

			String[] contents = dir.list();              
			for (int i = 0; i < contents.length; i++) {                  
				sb.append(printDirectoryListing(	new File(dir, contents[i]),indent + "  "));    
				
				}          
			} else {
				sb.append(indent + escapeHtmlChars(dir.getName()));    

		}  
		return sb.toString();
	}	
			
}
