<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link href="<c:url value="/css/styles.css" />" rel="stylesheet">
    <link rel="icon" href="<c:url value="/icon/favicon-32x32.png" />">
    <title>Memory Quest</title>
</head>
<body class="d-flex flex-column min-vh-100">
<header class="custom-header text-white text-center py-4">
    <div class="main-title">
        <h1><c:out value="${questName}" /></h1>
    </div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <ul class="navbar-nav mx-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/quest">Quest Menu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/login?user=${userId}">Member Menu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/login?logout=true">Log out</a>
                </li>
            </ul>
        </div>
    </nav>
</header>
<main class="container custom-mt d-flex align-items-center justify-content-center">
    <div class="mask d-flex align-items-center h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-11 col-md-11 col-lg-7 col-xl-8">
                <div class="card" style="border-radius: 15px;">
                    <div class="card-body p-5">
                        <div class="form-outline mb-3" style="font-size: 25px;">
                            <p><c:out value="${description}" /></p>
                            <div class="d-flex justify-content-center mt-4">
                                <a class="button-choice" href="/quest?id=${id}&qs=${firstQuestion.qsNo}">Yes</a>
                                <a class="button-choice" href="javascript:void(0);" onclick="showMessage()">No</a>
                            </div>
                            <div class="d-flex justify-content-center mt-2">
                                <p id="message"></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<footer class="bg-dark text-white d-flex justify-content-center align-items-center py-2 fixed-bottom">
    <div class="d-flex flex-row gap-3">
        <div class="footer-item">
            <a href="https://github.com/nestserka"><img src="<c:url value="/icon/github.png"/>" alt="Git"/></a>
        </div>
        <div class="footer-item">
            <a href="https://www.linkedin.com/in/katsiaryna-nestserava-4b6320266/"><img src="<c:url value="/icon/linkedin.png"/>" alt="Instagram"/></a>
        </div>
        <div class="footer-item">
            <a href="https://www.instagram.com/nestserka_codes/?igshid=NGVhN2U2NjQ0Yg%3D%3D"><img src="<c:url value="/icon/instagram.png"/>" alt="Medium"/></a>
        </div>
    </div>
</footer>
<script>
    function showMessage() {
        const messageContainer = document.getElementById('message');
        messageContainer.innerHTML = 'Sorry, you have no choice. You have to press "Yes"';
        setTimeout(function() {
            messageContainer.innerHTML = '';
        }, 2500);
    }
</script>
</body>
</html>
