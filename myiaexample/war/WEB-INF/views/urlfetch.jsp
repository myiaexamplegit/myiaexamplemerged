<?xml version="1.0" encoding="ISO-8859-1" ?>   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ page isELIgnored="false"%>   
  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">   

<html>
<%@ include file="/WEB-INF/common/head.jsp" %>  
<body>
<%@ include file="/WEB-INF/common/header.jsp" %>
hello <br/>
<c:out value="${message}"/>
<c:out value="${bourso}"/>
        
  </body>
</html>
