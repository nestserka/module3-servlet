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
    <h2>Welcome to "The Quest of Forgotten Memories"</h2>
    <p>In this adventure, you wake up with no recollection of your past.
    As you explore this enigmatic world, you'll face challenges, solve riddles, and make decisions that
    shape your quest to recover your lost memories. Are you ready to begin your journey and uncover the secrets within?
    </p>
    <div class="wrapper">
   <a class="button-choice" href="/quest-servlet">Yes</a>
    <a class="button-choice" href="javascript:void(0);" onclick="showMessage()">No</a>
    </div>
    <div id="message"></div>
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
    function showMessage() {
        const messageContainer = document.getElementById('message');
        messageContainer.innerHTML = 'Sorry, you have no choice. You have to press "Yes"';
        setTimeout(function() {
            messageContainer.innerHTML = '';
        }, 2500);
    }
</script>
</body>
</html>
