<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Download Page</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Downloads</h1>
        
        <%-- Lấy thông tin User từ Session (nếu có) --%>
        <p>Here is the download you requested, ${user.firstName}:</p>

        <%-- Kiểm tra productCode để hiển thị nội dung tương ứng --%>
        <c:choose>
            <c:when test="${productCode == '8601'}">
                <h3>86 (the band) - True Life Songs and Pictures</h3>
                <p>
                    <a href="sound/8601.mp3">Download (8601.mp3)</a>
                </p>
            </c:when>
            
            <c:when test="${productCode == 'pf01'}">
                <h3>Paddlefoot - The first CD</h3>
                <p>
                    <a href="sound/pf01.mp3">Download (pf01.mp3)</a>
                </p>
            </c:when>
            
            <c:when test="${productCode == 'pf02'}">
                <h3>Paddlefoot - The second CD</h3>
                <p>
                    <a href="sound/pf02.mp3">Download (pf02.mp3)</a>
                </p>
            </c:when>
            
            <c:when test="${productCode == 'jr01'}">
                <h3>Joe Rut - Genuine Wood Grained Finish</h3>
                <p>
                    <a href="sound/jr01.mp3">Download (jr01.mp3)</a>
                </p>
            </c:when>
                
            <c:otherwise>
                <p style="color: red;">Error: Product not found or no product selected.</p>
            </c:otherwise>
        </c:choose>

        <hr>
        <p><a href="index.jsp?action=viewAlbums">View list of albums</a></p>
    </body>
</html>