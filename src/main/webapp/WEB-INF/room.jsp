<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <link href="<c:url value="/css/styles.css" />" rel="stylesheet">
  <link rel="icon" href="<c:url value="/icon/favicon-32x32.png" />">
  <title>Memory Quest</title>
</head>
<body>
<header><h1>The Quest of Forgotten Memories</h1></header>
<main>
 <h2>Question 1 </h2>
    <p>You awaken disoriented and with no memory of who you are or how you got here. As your eyes adjust to the faint light, you notice an open journal on the table beside you. Where did you wake up with no memory?</p>
    <form class="description" action="/quest-servlet" method="post">
        <input type="hidden" name="action" value="qs1">
        <input class="text-desc" id="place" name="place" type="text" pattern="[A-Za-z]+" placeholder="Type the place here" required>
        <button id="submit" name="submit" class="submit0btn">Continue</button>
    </form>
</main>
<footer class="footer">
    <div class="footer-item">
        <a href="https://github.com/nestserka"
        ><img src="<c:url value="/icon/git.png"/>" alt="Git"
        /></a>
    </div>
    <div class="footer-item">
        <a href="https://www.instagram.com/mercy_codes/?igshid=NGVhN2U2NjQ0Yg%3D%3D"
        ><img src="<c:url value="/icon/instagram.png"/>" alt="Instagram"
        /></a>
    </div>
    <div class="footer-item">
        <a href="https://medium.com/@nestserka"
        ><img src="<c:url value="/icon/medium.png"/>" alt="Medium"
        /></a>
    </div>
</footer>
</body>
</html>
