<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Quotes</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>My Quotes</h1>

    <c:choose>
        <c:when test="${empty quotes}">
            <p>You have no quotes yet.</p>
        </c:when>
        <c:otherwise>
            <table>
                <thead>
                <tr>
                    <th>Insurance Type</th>
                    <th>Quote Amount</th>
                    <th>Quote Date</th>
                    <th>Status</th>
                    <th>Actions</th> <!- - Add a column for actions - ->
                </tr>
                </thead>
                <tbody>
                <c:forEach var="quote" items="${quotes}">
                    <tr>
                        <td>${quote.insuranceType}</td>
                        <td>${quote.quoteAmount}</td>
                        <td>${quote.quoteDate}</td>
                        <td>${quote.quoteStatus}</td>
                        <td> <!- - Add buttons or links for actions - ->
                            <c:if test="${quote.quoteStatus == 'PENDING'}"> <!- - Only show buttons if quote is pending - ->
                                <a href="/insurance/quotes/${quote.id}/accept" class="button accept">Accept</a>
                                <a href="/insurance/quotes/${quote.id}/reject" class="button reject">Reject</a>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>