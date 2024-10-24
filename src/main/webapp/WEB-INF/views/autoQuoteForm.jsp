<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Auto Insurance Quote</title>
<%--  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">--%>
  <style>

  </style>
</head>
<body>
<div class="container">
  <h1>Auto Insurance Quote</h1>
  <c:if test="${not empty error}">
    <div class="error-message">${error}</div>
  </c:if>

  <form:form method="post" action="/insurance/quotes/auto" modelAttribute="autoInsurancePolicy">
    <input type="hidden" name="user.email" value="${userEmail}" /> <!- - Pass user's email (or ID) as hidden field - ->

    <div class="form-group">
      <label for="policyNumber">Policy Number:</label>
      <form:input path="policyNumber" id="policyNumber" required="true" />
    </div>

    <div class="form-group">
      <label for="effectiveDate">Effective Date:</label>
      <form:input path="effectiveDate" id="effectiveDate" type="date" required="true" />
    </div>

    <div class="form-group">
      <label for="assetType">Vehicle Type:</label>
      <form:select path="assetType" id="assetType">
        <form:option value="Standard">Standard</form:option>
        <form:option value="Luxury">Luxury</form:option>
        <form:option value="Utility">Utility</form:option>
      </form:select>
    </div>

    <div class="form-group">
      <label for="riskFactor">Professional Use:</label>
      <form:checkbox path="riskFactor" id="riskFactor" />
    </div>

    <div class="form-group">
      <label for="vehicleMake">Vehicle Make:</label>
      <form:input path="vehicleMake" id="vehicleMake" required="true" />
    </div>

    <div class="form-group">
      <label for="vehicleModel">Vehicle Model:</label>
      <form:input path="vehicleModel" id="vehicleModel" required="true" />
    </div>

    <div class="form-group">
      <label for="noClaimsDiscount">No Claims Discount:</label>
      <form:checkbox path="noClaimsDiscount" id="noClaimsDiscount" />
    </div>

    <button type="submit">Get Quote</button>
  </form:form>
</div>
</body>
</html>