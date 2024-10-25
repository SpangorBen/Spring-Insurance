<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>File Manager</title>
</head>
<body>
<h1>File Manager</h1>

<!-- Upload File Section -->
<h2>Upload File</h2>
<form action="${pageContext.request.contextPath}/files/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" required>
    <button type="submit">Upload</button>
</form>

<!-- List Files Section -->
<h2>Available Files</h2>
<ul>
    <%
        // Fetch the list of files from the controller
        List<String> fileNames = (List<String>) request.getAttribute("fileNames");
        if (fileNames == null || fileNames.isEmpty()) {
    %>
    <li>No files found.</li>
    <%
    } else {
        for (String fileName : fileNames) {
    %>
    <li>
        <%= fileName %>
        <a href="${pageContext.request.contextPath}/files/download/<%= fileName %>">Download</a>
        <form action="${pageContext.request.contextPath}/files/delete/<%= fileName %>" method="post" style="display:inline;">
            <input type="hidden" name="_method" value="delete">
            <button type="submit">Delete</button>
        </form>
    </li>
    <%
            }
        }
    %>
</ul>
</body>
</html>
