
<%@ page import="com.psl.dao.LoginDaoImpl" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign-in Page</title>
</head>
<body>
<%
    String user = request.getParameter("uname");    
    String pwd = request.getParameter("pwd");
  System.out.println("username " +user);
  System.out.println("username " +pwd);
    LoginDaoImpl obj=new LoginDaoImpl();
    
    System.out.println("here");
    //boolean result= ;
 /* if(obj.verifyLogin(user, pwd)){ 
	 
	 System.out.println("Success");
	 %>
	 <script type="text/javascript">
	 alert("You successfully read this important alert message.");
	 </script>
	 
      
	 <% 
 }else{
	 System.out.println("fail");
	
	 response.sendRedirect("Invalidlogin.html");
 }*/
    
    
   
   
%>



</body>
</html>
