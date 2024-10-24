<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Insurance Quote</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>Home Insurance Quote</h1>
    <c:if test="${not empty error}">
        <div class="error-message">${error}</div>
    </c:if>

    <form:form method="post" action="/insurance/quotes/home" modelAttribute="homeInsurancePolicy">
        <input type="hidden" name="user.email" value="${userEmail}" />

        <!- - Form fields for home insurance policy details: - ->
        <div class="form-group">
            <label for="policyNumber">Policy Number:</label>
            <form:input path="policyNumber" id="policyNumber" required="true"/>
        </div>
        <div class="form-group">
            <label for="effectiveDate">Effective Date:</label>
            <form:input path="effectiveDate" id="effectiveDate" type="date" required="true"/>
        </div>

        <div class="form-group">
            <label for="assetType">Property Type:</label>
            <form:select path="assetType" id="assetType">
                <form:option value="Apartment">Apartment</form:option>
                <form:option value="House">House</form:option>
                <!- - Add other property types as needed - ->
            </form:select>
        </div>

        <div class="form-group">
            <label for="riskFactor">High-Risk Location:</label>
            <form:checkbox path="riskFactor" id="riskFactor" />
        </div>

        <div class="form-group">
            <label for="propertyValue">Property Value (MAD):</label>
            <form:input path="propertyValue" id="propertyValue" type="number" required="true"/>
        </div>

        <div class="form-group">
            <label for="securitySystem">Security System:</label>
            <form:checkbox path="securitySystem" id="securitySystem" />
        </div>

        <button type="submit">Get Quote</button>
    </form:form>
</div>
</body>
</html>