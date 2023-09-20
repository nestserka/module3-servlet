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
 <h2>Question 1 </h2>
    <p>You awaken disoriented and with no memory of who you are or how you got here. As your eyes adjust to the faint light, you notice an open journal on the table beside you. Where did you wake up with no memory?</p>
    <form class="description" action="/quest-servlet" method="post">
        <input type="hidden" name="action" value="qs1">
        <input class="text-desc" id="place" name="place" type="text" placeholder="Type the place here">
        <button id="submit" name="submit" class="submit0btn">Continue</button>
    </form>
</main>
</body>
</html>
