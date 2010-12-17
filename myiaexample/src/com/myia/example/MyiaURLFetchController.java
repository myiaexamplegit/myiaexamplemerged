package com.myia.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

import com.google.appengine.api.urlfetch.FetchOptions;
import com.google.appengine.api.urlfetch.HTTPMethod;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.ResponseTooLargeException;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;
import com.google.appengine.api.utils.SystemProperty;

public class MyiaURLFetchController extends ParameterizableViewController  {
	
	public ModelAndView handleRequestInternal(
	        HttpServletRequest request,
	        HttpServletResponse response) throws Exception {

	        ModelAndView mav = new ModelAndView(getViewName());
	        mav.addObject("message", "Hello World!");
	        String[] nameArray; 
	        
	        try { 
	        	
	            URL url = new URL("http://www.boursorama.com"); 
	            
	            FetchOptions options = FetchOptions.Builder.doNotFollowRedirects().disallowTruncate();              
	            HTTPRequest req = new HTTPRequest(url, HTTPMethod.GET, options);   
	            //chunked and hanging not supported, all content as single block
	            URLFetchService service = URLFetchServiceFactory.getURLFetchService();              
	            HTTPResponse rep = service.fetch(req);  
	            
	            byte[] content = rep.getContent(); 
	            
	            mav.addObject("bourso", new String(content));
	            
	            // alternative method
	            
	            URL url2 = new URL("http://ae-book.appspot.com/blog/atom.xml/");              
	            InputStream inStream = url2.openStream();                
	            InputStreamReader inStreamReader = new InputStreamReader(inStream);              
	            BufferedReader reader = new BufferedReader(inStreamReader);                
	            // A useless use of the data just to prove it was read.              
	            int length = 0;              
	            while (reader.read() != -1) {                  length++;              }              
	            //out.println("<p>Read PGAE blog feed (" + length + " characters).</p>");                
	            reader.close();  
	            
	            

	        } catch (ResponseTooLargeException e) {              
	        	//out.println("<p>ResponseTooLargeException: " + e + "</p>");            
	        	} catch (MalformedURLException e) {              
	        		//out.println("<p>MalformedURLException: " + e + "</p>");            
	        		} catch (IOException e) {              
	        			//out.println("<p>IOException: " + e + "</p>");          
	        			}  
	        
	        

	        
	        //needs to set the view - should be done in xml declaration I guess
	        return mav;  
	        
	    }
			
}
