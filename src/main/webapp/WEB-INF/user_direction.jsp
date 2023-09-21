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
  <h2>Question 3</h2>
  <p>Contemplating a deceptive response, you briefly consider providing a false name. Eventually, you decide to fabricate an identity, and the officer, unaware of the ruse, permits you to proceed.
    Later you come across a fork in the road. One path leads into a dark forest, and the other leads to a bustling town. Which path will you choose?</p>
  <form action="/quest-servlet" method="post">
    <input type="hidden" name="action" value="qs3">
    <label>
      <input type="radio" name="qs3" value="forest" required/> Dark forest
    </label>
    <label>
      <input type="radio" name="qs3" value="village" required/> Bustling village
    </label>
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
