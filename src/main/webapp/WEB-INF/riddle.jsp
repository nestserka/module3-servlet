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
  <h2>Question 5 </h2>
  <p>You continue your journey. In the heart of the forest, you find a magical pool with a mermaid-like creature. She beckons you closer and poses her riddle: "I'm always hungry, I must always be fed. The finger I touch will soon turn red. What am I?"</p>
  <div class="description">
  <input type="hidden" name="action" value="qs5">
    <input id="answer" class="text-desc" name="answer" type="text" placeholder="Type your answer here here">
    <button id="submit" name="submit" class="submit0btn" onclick="checkCorrectAnswer()">Continue</button>
  </div>
  <div id="message"></div>
</main>

<script>
  let count = 0;
  function checkCorrectAnswer() {
    let userInput = document.getElementById("answer").value;
    let correctAnswer = "fire";
    let messageDiv = document.getElementById("message");
    if (userInput === correctAnswer) {
      messageDiv.innerHTML = "Correct answer. You may continue.";
      messageDiv.style.color = "green";
      setTimeout(function() {
        messageDiv.innerHTML = '';
        window.location.href = "/riddle-servlet";
      },2000);
    } else {
      messageDiv.innerHTML = "Incorrect answer. Please try again.";
      messageDiv.style.color = "red";
      count++;
      setTimeout(function() {
        messageDiv.innerHTML = '';
      }, 2500);
    }
    if(count === 3) {
      messageDiv.innerHTML = "You tried 3 times. Game is over for you";
      setTimeout(function() {
        messageDiv.innerHTML = '';
        window.location.href = "/index.jsp";
      }, 3500);
    }
  }
</script>
</body>
</html>
