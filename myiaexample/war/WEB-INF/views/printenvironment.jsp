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


    <ul>
		<li><a href="#env">Environment Variables</a></li>
		<li><a href="#props">System Properties</a></li>
		<li><a href="#filesystem">File System</a></li>
		<li><a href="#request">Request Data</a></li>
	</ul> 
    
    <hr noshade><h2 id="serverInfo">Server Info </h2><table>
    <tr><td valign="top"><c:out value="${serverInfo}"/></td><td valign="top"></td></tr>
    <tr><td valign="top"><c:out value="${serverEnvironment}"/></td><td valign="top"></td></tr>
    <tr><td valign="top"><c:out value="${serverVersion}"/></td><td valign="top"></td></tr>
    
    </table>
    
    <hr noshade><h2 id="env">Environment Variables</h2><table>
    
    </table>
    
    <c:forEach items="${environment}" var="entry">
      <c:out value="${entry.key}"/>:<c:out value="${entry.value}"/><br>
    </c:forEach>
    
        <c:forEach items="${systemProperties}" var="prop">
      <c:out value="${prop.key}"/>:<c:out value="${prop.value}"/><br>
    </c:forEach>
    
    <hr noshade><h2 id="filesystem">File System</h2><pre>
    <c:out value="${filesystem}"/>
    </pre>
    
    

    
  </body>
</html>
