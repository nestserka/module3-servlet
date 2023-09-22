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
  <h2>Question 4</h2>
  <p>Contemplating a deceptive response, you briefly consider providing a false name. Eventually, you decide to fabricate an identity, and the officer, unaware of the ruse, permits you to proceed.
    You venture into the dark forest, hoping to find clues about your past. You stumble upon an old journal with your name in it, providing some hints about your identity. Under the stone you found</p>
  <form action="/quest-servlet" method="post">
    <input type="hidden" name="action" value="qs4">
    <label>
      <input type="radio" name="qs4" value="neckless" required/> Wolf necklace
    </label>
    <label>
      <input type="radio" name="qs4" value="computer" required/> Old computer
    </label>
    <label>
      <input type="radio" name="qs4" value="money" required/> Suitcase with money
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
