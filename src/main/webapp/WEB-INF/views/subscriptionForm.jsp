<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insurance Subscription</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>Insurance Subscription</h1>

    <c:if test="${not empty error}">
        <div class="error-message">${error}</div>
    </c:if>

    <p>You have accepted the quote. Please provide the following documents to complete your subscription:</p>

    <form method="post" action="/insurance/subscribe" enctype="multipart/form-data">
        <input type="hidden" name="quoteId" value="${quote.id}" /> <!- - Pass the accepted quote ID - ->

        <!- - File Upload Fields - ->
        <div class="form-group">
            <label for="driverLicense">Driver's License:</label>
            <input type="file" id="driverLicense" name="driverLicense" accept=".pdf,.jpg,.jpeg,.png" required />
        </div>

        <div class="form-group">
            <label for="residenceProof">Proof of Residence:</label>
            <input type="file" id="residenceProof" name="residenceProof" accept=".pdf,.jpg,.jpeg,.png" required />
        </div>

        <!- - Add other file upload fields as needed based on policy type - ->

        <button type="submit">Subscribe</button>
    </form>
</div>
</body>
</html>