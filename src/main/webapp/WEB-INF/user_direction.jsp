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
  <h2>Question 3</h2>
  <p>You come across a fork in the road. One path leads into a dark forest, and the other leads to a bustling town. Which path will you choose?</p>
  <form action="/quiz-servlet" method="post">
    <input type="hidden" name="action" value="qs3">
    <input type="radio" name="qs3" value="forest"/>Dark forest
    <input type="radio" name="qs3" value="village" />Bustling village
    <button id="submit" name="submit" class="submit0btn">Continue</button>
  </form>
</main>
</body>
</html>
