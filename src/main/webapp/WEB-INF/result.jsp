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
  <h2>FINAL RESULTS</h2>
  <% String s = (String) request.getAttribute("resultVal");%>
  <div id="message"></div>
</main>

<script>
  let result = "<%= s %>";
  showResults(result);
  function showResults(result){
    let messageDiv = document.getElementById("message");
    if (result == "uncertain") {
      messageDiv.innerHTML = "You suddenly find yourself questioning the reality of the mermaid-like creature and your entire journey. Just as you say this, you wake up in a hospital bed, surrounded by medical equipment. It turns out that your entire adventure was a vivid dream. You've regained consciousness, and your memory slowly starts returning as the fog lifts. You are: white-collar worker"
    }
  }
</script>
</body>
</html>
