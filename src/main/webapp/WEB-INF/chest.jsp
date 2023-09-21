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
  <h2>Question 6</h2>
  <p>Your answer was correct. The mermaid-like creature smiles and grants you access to a hidden treasure chest. Would you take it directly from her?</p>
  <form action="/quest-servlet" method="post">
    <input type="hidden" name="action" value="qs6">
    <label>
      <input type="radio" name="qs6" value="no" required/> No, you won't take the treasure directly; you acknowledge the creature's kindness.
    </label>
    <label>
      <input type="radio" name="qs6" value="yes" required/> Yes, you decide to take the treasure directly from the creature.
    </label>
    <label>
      <input type="radio" name="qs6" value="uncertain" required /> What mermaid? Am I still sleeping?
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
