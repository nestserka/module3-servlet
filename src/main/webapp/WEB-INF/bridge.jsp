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
  <h2>Question 2</h2>
  <% String s = (String) session.getAttribute("place");
    System.out.println("test" + s); %>
  <p>You left <%= s %>  and arrived at a bridge, where the officer asks for your name. Will you: </p>
  <form action="/quest-servlet" method="post">
    <input type="hidden" name="action" value="qs2">
    <label>
      <input type="radio" name="qs2" value="lie"/> Lie
    </label>
    <label>
      <input type="radio" name="qs2" value="truth" /> Tell the truth
    </label>
    <button id="submit" name="submit" class="submit0btn">Continue</button>
  </form>
</main>
</body>
</html>
