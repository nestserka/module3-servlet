<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" href="<c:url value="/icon/favicon-32x32.png" />">
    <link href="<c:url value="/css/styles.css" />" rel="stylesheet">
  <title>Memory Quest</title>
</head>

<body class="d-flex flex-column min-vh-100">
<header class="text-white text-center py-4"><h1 style="text-transform: uppercase;">The Quest of Forgotten Memories</h1></header>
<main class="container custom-mt d-flex align-items-center justify-content-center">
    <div class="mask d-flex align-items-center h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-11 col-md-11 col-lg-7 col-xl-8">
                <div class="card" style="border-radius: 15px;">
                    <div class="card-body p-5">
                        <h2 class="text-uppercase text-center mb-5">Question 1</h2>
                        <div class="form-outline mb-3" style="font-size: 25px;">
                            <p>You awaken disoriented and with no memory of who you are or how you got here. As your eyes adjust to the faint light, you notice an open journal on the table beside you. Where did you wake up with no memory?</p>
                        </div>
                        <div class="form-outline mb-3" style="font-size: 24px;">
                            <form action="/quest" method="post">
                                <input type="hidden" name="action" value="qs1">
                                <label for="place"></label>
                                <div class="custom-width-input">
                                    <input class="form-control form-control-lg" id="place" name="place" type="text" pattern="[A-Za-z]+" placeholder="Type the place here" required>
                                </div>
                                <div class="d-flex justify-content-center mt-4">
                                    <button id="submit" name="submit" class="submit0btn">Continue</button>
                                </div>
                            </form>
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
            <a href="https://www.instagram.com/mercy_codes/?igshid=NGVhN2U2NjQ0Yg%3D%3D"><img src="<c:url value="/icon/instagram.png"/>" alt="Medium"/></a>
    </div>
    </div>
</footer>
</body>
</html>
