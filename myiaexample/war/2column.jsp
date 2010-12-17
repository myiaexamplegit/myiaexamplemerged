<?xml version="1.0" encoding="ISO-8859-1" ?>   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<%@ include file="/WEB-INF/common/head.jsp" %>


<body>
    <!-- Begin Header -->
 	<%@ include file="/WEB-INF/common/header.jsp" %>
  <!-- End Header -->  
		 
  <!-- Begin Column One-->
  <div id="one_wide">
       
    <div class="item">
      <h2>First tasks</h2>
      
      First form below is the very first attempt to make SPRINGMVC2.5 work on GAE
			<form action="test.do" method="post">your name: <br />   
<input type="text" name="name" /> <br />   
<input type="submit" value="Submit" /></form>   

     Now practicing a bit more on annotations, and following basic tuto, <a href="http://static.springsource.org/docs/Spring-MVC-step-by-step/part3.html" title="">here</a>

<form action="producttest.do" method="post">your name: <br />   
<input type="text" name="name" /> <br />   
<input type="submit" value="Submit" /></form>

<a href="producttest.do" title="">Essai passage mode GET</a>
<br>
Now , go for a FormController, damn
    <a href="<c:url value="priceincrease.do"/>">Increase Prices</a>

                    
    </div>
  </div>
	<!-- End Column One-->
	 		 
  <!-- Begin Column Three -->
  <div id="three">
    <div class="item">
      <h3>your ad</h3>
      <p>this area is perfect for an content ad (300x250)</p>
      <p><img src="img/image.jpg" width="300" height="250" alt="" /></p>      
    </div>           
     <div id="three_one">
      <div class="item">
        <h3>Categories</h3>
        <ul>        
          <li><a href="#" title="">Home</a></li>
          <li><a href="#" title="">Category 1</a></li>
          <li><a href="#" title="">Category 2</a></li>          
          <li><a href="#" title="">Category 3</a></li>           
        </ul>       
      </div>  
      <div class="item">
        <h3>Articles</h3>
        <ul>        
          <li><a href="#" title="">Article 1</a></li>
          <li><a href="#" title="">Article 2</a></li>
          <li><a href="#" title="">Article 3</a></li>
          <li><a href="#" title="">Article 4</a></li>   
          <li><a href="#" title="">Article 5</a></li>
          <li><a href="#" title="">Article 6</a></li>                              
        </ul>             
      </div>        
    </div>    
    <div id="three_two">
      <div class="item">
        <h3>Comments</h3>
        <ul>        
          <li><a href="#" title="">comment 1</a></li>
          <li><a href="#" title="">comment 2</a></li>
        </ul>       
      </div>  
      <div class="item">
        <h3>What you need</h3>
        <p>Rterritus. Pax necne per, ymo invetero voluptas.</p>   
        <ul>
          <li><a href="#">list point</a></li>
          <li><a href="#">list point</a></li>
        </ul>       
      </div>            
    </div>             
  </div>
  <!-- End Column Three -->
		 
  <!-- Begin Footer -->
  <div id="footer">
    <ul>
      <li><a href="">your copyright note</a></li>
      <li><a href="http://validator.w3.org/check?uri=referer">XHTML 1.0</a></li>      
      <li><a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a></li>            
      <li><a href="http://www.kosikowski.de">design by supa</a> | Provided By <a href="http://www.template4all.com/css/" title="Free CSS Templates">Free CSS Templates</a> | <a href="http://www.freethemes4all.com" title="Free Website Templates">Freethemes4all.com</a></li>      
    </ul>		       
  </div>
	<!-- End Footer -->
		 
</div>
<!-- End Wrapper -->
   
</body>
</html>