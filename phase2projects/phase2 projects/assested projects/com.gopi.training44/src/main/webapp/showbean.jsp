<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Bean properties</title>
</head>
<body>
<hr>
        <h3>Ecommerce Laptop Details..</h3>
<hr>
<jsp:useBean id="ProductBean" class="com.ecommerce.ProductBean" scope="session"></jsp:useBean>

        Product Id:    <jsp:getProperty name="productBean" property="productId" />  <br>
        Product Name:    <jsp:getProperty name="productBean" property="productName" />  <br>
        Product Price:    <jsp:getProperty name="productBean" property="price" />  <br>
<hr>

 <h3>ConsumerGoods Mobile Details..</h3>
<hr>
<jsp:useBean id="Mobiles" class="com.consumerGoods.Mobiles" scope="session"></jsp:useBean>
        Product Id:    <jsp:getProperty name="Mobiles" property="productId" />  <br>
        Product Name:    <jsp:getProperty name="Mobiles" property="productName" />  <br>
        Product Price:    <jsp:getProperty name="Mobiles" property="price" />  <br>
        <hr>
</body>
</html>