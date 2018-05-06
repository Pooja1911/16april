<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="con"%>
    <%@page import="java.util.List" %>
    <%@page import="com.cg.model.Customer" %>
    <%@page import="java.util.ArrayList" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%List<Customer> customerList=(ArrayList<Customer>)request.getAttribute("list");
for(Customer customer : customerList)
{
    out.print("Id: " + customer.getCustomerId());
    out.print("<br/>");
    out.print("Name: " + customer.getCustomerName());
    out.print("<br/>");
    out.print("Address: " + customer.getCustomerAddress());
    out.print("<br/>");
    out.print("paymentMode: " + customer.getPaymentMode());
    out.print("<br/>");
    out.print("Retailer Name: " + customer.getRetailerName());
    out.print("<br/>");
    out.print("<br/>");
}
%>
 
</body>
</html>