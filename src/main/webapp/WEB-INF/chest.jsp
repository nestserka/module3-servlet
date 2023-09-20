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
  <h2>Question 6</h2>
  <p>Your answer was correct. The mermaid-like creature smiles and grants you access to a hidden treasure chest. Would you take it directly from her?</p>
  <form action="/semiResult-servlet" method="get">
    <input type="radio" name="qs6" value="no"/>No, you won't take the treasure directly; you acknowledge the creature's kindness.
    <input type="radio" name="qs6" value="yes" />Yes, you decide to take the treasure directly from the creature.
    <input type="radio" name="qs6" value="uncertain" />What mermaid? Am I still sleeping?
    <button id="submit" name="submit" class="submit0btn">Continue</button>
  </form>
</main>
</body>
</html>
