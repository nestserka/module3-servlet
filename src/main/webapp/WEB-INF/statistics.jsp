<%@ page import="com.module3.project3.entity.Statistics" %>
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
  <h2>Statistics</h2>
  <% Statistics stat = (Statistics) request.getAttribute("stat");%>
  <div class="statistics-wrapper">
    <h6 class="stat-item">Your current location: <%=stat.getIpAddress()%> </h6>
  <h6 class="stat-item">The place you chose:  <%=stat.getPlace()%>  </h6>
  <h6 class="stat-item">The place where you decided to go: <%=stat.getDirection()%> </h6>
  <h6 class="stat-item">The item you chose:   <%=stat.getItem()%></h6>
  <h6 class="stat-item">Your time in this quiz:   <%=stat.getGameTime()%> </h6>
  </div>
  <div class="wrapper">
    <a class="submit0btn" onclick="restart()">Main</a>
  </div>

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
<script>
  function restart() {
    fetch('/result', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json;',
      },
    })
            .then(response => {
              if (response.status === 200) {
                window.location.href = "/index.jsp";
              } else {
                console.error('Restart failed.');
              }
            })
            .catch(error => {
              console.error('Error:', error);
            });
  }
</script>
</body>
</html>
