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
  <h2>Final</h2>
  <p>You decide to take the treasure directly from the creature, ignoring any potential risks. As you reach for the chest, the mermaid-like creature's demeanor quickly changes. It becomes hostile and lunges toward you, revealing its true nature. With incredible agility, the creature attempts to attack you, its sharp claws poised to strike.
  </p>
  <form action="/riddle-servlet" method="post">
    <label>
      <input type="radio" name="qs6" value="run"/> Run
    </label>
    <label>
      <input type="radio" name="qs6" value="hit" /> Fight
    </label>
    <button id="submit" name="submit" class="submit0btn">Continue</button>
  </form>
</main>
</body>
</html>