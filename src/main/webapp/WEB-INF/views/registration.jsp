<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">--%>
    <style>
        body {
            font-family: sans-serif;
            background-color: #f4f4f4;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
            padding: 40px;
            width: 350px;
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
            color: #333;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #555;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
            outline: none;
        }

        input[type="submit"] {
            background-color: #5cb85c;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }

        input[type="submit"]:hover {
            background-color: #4cae4c;
        }

        .error-message {
            color: red;
            margin-bottom: 10px;
        }

    </style>
</head>
<body>
<div class="container">
    <h1>User Registration</h1>
    <c:if test="${not empty error}">
        <div class="error-message">${error}</div>
    </c:if>
    <form:form method="post" action="/insurance/register" modelAttribute="user">
        <div class="form-group">
            <label for="name">Name:</label>
            <form:input path="name" id="name" required="true"/>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <form:input path="email" id="email" type="email" required="true"/>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <form:password path="password" id="password" required="true"/>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <form:input path="address" id="address" />
        </div>
        <div class="form-group">
            <label for="phone">Phone:</label>
            <form:input path="phone" id="phone" />
        </div>
        <div class="form-group">
            <label for="birthDate">Birth Date:</label>
            <form:input path="birthDate" id="birthDate" type="date" required="true"/>
        </div>
        <div class="form-group">
            <input type="submit" value="Register">
        </div>
    </form:form>
</div>
</body>
</html>