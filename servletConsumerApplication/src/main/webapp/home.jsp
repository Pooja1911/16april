<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="java.util.List" %>
    <%@page import="com.cg.model.Customer" %>
    <%@page import="java.util.ArrayList" %>
    <%@ page isELIgnored="false" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
            <h1>Customer List</h1>
            <table border="1">
             <th>Id</th>
                <th>Name</th>
                <th>Address</th>
                <th>paymentMode</th>
                <th>Retailer name</th>
                 <th>Action</th>
            
               
               <c:forEach items="${list8}" var="list">    
  				  <tr>
                    <td>${list.customerId}</td>
                    <td>${list.customerName}</td>
                    <td>${list.customerAddress}</td>
                    <td>${list.paymentMode}</td>
                    <td>${list.retailerName}</td>
                    <td>
                        <a href="/editCustomer?id=${list.customerId}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/deleteCustomert?id=${list.customerId}">Delete</a>
                    </td></tr>
				</c:forEach>
            </table>
        </div>
</body>
</html>