<%-- 
    Document   : show
    Created on : 05-11-2023, 16:06:32
    Author     : phanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="helpers.Helpers" id="helpers" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="" method="POST">
            <input type="hidden" name="type" value="search">
            <input type="hidden" name="searchBy" value="name">
            Supplier Name: <input type="text" name="key">
            <button>Filter By Name</button>
        </form>
        <br>

        <form action="" method="POST">
            <input type="hidden" name="type" value="search">
            <input type="hidden" name="searchBy" value="year">
            Year of Birth: <input type="text" name="key">
            <button>Filter By Year</button>
        </form>
        <br>
        <br>

        List of Suppliers:
        <table border>
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Date of Birth</th>
                    <th>Gende</th>
                    <th>Address</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${list}" var="item">
                    <tr>
                        <td>${item.code}</td>
                        <td>${item.name}</td>
                        <td>${item.birthDate}</td>
                        <td>${helpers.convertBooleanToStringJSP(item.gender, "Male", "Female")}</td>
                        <td>${item.address}</td>
                        <td>
                            <form action="" method="POST">
                                <input type="hidden" name="type" value="delete">
                                <input type="hidden" name="code" value="${item.code}">
                                <button>Delete</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>
        <form action="" method="POST">

        </form>
    </body>
</html>
