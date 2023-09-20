<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <link href="<c:url value="/css/styles.css" />" rel="stylesheet">
  <link rel="icon" href="<c:url value="/icon/favicon-32x32.png" />">
  <title>Module 3: final project</title>
</head>
<body>
<header><h1>The Quest of Forgotten Memories</h1></header>
<main>
  <h2>Question 4</h2>
  <p>You venture into the dark forest, hoping to find clues about your past. You stumble upon an old journal with your name in it, providing some hints about your identity. Under the stone you found</p>
  <form action="/quiz-servlet" method="post">
    <input type="hidden" name="action" value="qs4">
    <label>
      <input type="radio" name="qs4" value="neckless"/> Wolf necklace
    </label>
    <label>
      <input type="radio" name="qs4" value="computer" /> Old computer
    </label>
    <label>
      <input type="radio" name="qs4" value="money" /> Suitcase with money
    </label>
    <button id="submit" name="submit" class="submit0btn">Continue</button>
  </form>
</main>
</body>
</html>
