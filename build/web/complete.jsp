<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Download Complete</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Thank you for downloading!</h1>
        
        <p>Hello ${user.firstName} ${user.lastName},</p>
        
        <h2>Your selected CD information:</h2>
        
        <c:choose>
            <c:when test="${productCode == '8601'}">
                <div class="product-info">
                    <h3>86 (the band) - True Life Songs and Pictures</h3>
                    <p><strong>Product Code:</strong> 8601</p>
                    <p><strong>File:</strong> 8601.mp3</p>
                </div>
            </c:when>
            
            <c:when test="${productCode == 'pf01'}">
                <div class="product-info">
                    <h3>Paddlefoot - The first CD</h3>
                    <p><strong>Product Code:</strong> pf01</p>
                    <p><strong>File:</strong> pf01.mp3</p>
                </div>
            </c:when>
            
            <c:when test="${productCode == 'pf02'}">
                <div class="product-info">
                    <h3>Paddlefoot - The second CD</h3>
                    <p><strong>Product Code:</strong> pf02</p>
                    <p><strong>File:</strong> pf02.mp3</p>
                </div>
            </c:when>
            
            <c:when test="${productCode == 'jr01'}">
                <div class="product-info">
                    <h3>Joe Rut - Genuine Wood Grained Finish</h3>
                    <p><strong>Product Code:</strong> jr01</p>
                    <p><strong>File:</strong> jr01.mp3</p>
                </div>
            </c:when>
                
            <c:otherwise>
                <p style="color: red;">Error: Product information not found.</p>
            </c:otherwise>
        </c:choose>

        <hr>
        <p>Thank you for using our service!</p>
        <p><a href="index.jsp?action=viewAlbums">Return to album list</a></p>
    </body>
</html>
