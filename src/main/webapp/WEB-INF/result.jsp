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
    } else if (result == "no") {
      messageDiv.innerHTML = "You choose not to take the treasure directly, acknowledging the creature's kindness. It turns out that the mermaid-like creature was not a foe but a guardian, protecting lost souls from their own greed. As a result of your compassion, you've brought safety to this enchanted place, and the creature expresses its gratitude. However: you still do not know who you are. Game over"
    } else if (result == "run") {
      messageDiv.innerHTML = "Faced with the mermaid-like creature's sudden attack, you swiftly make a choice. Instead of attempting to fight the creature head-on, you choose to run. Your instincts kick in, and you dash away from the hostile creature, leaving the treasure behind. As you sprint through the forest, you realize that running from danger has become a recurring theme in your life. You are, in fact, a skilled prison breaker, always evading trouble and escaping difficult situations. This revelation brings clarity to your" +
              " past. Ending (Prison Breaker): Your quest ends with a sense of familiarity and determination. You've remembered who you are—a prison breaker with a knack for escaping danger. Though your lost memory remains a mystery, you continue to embrace your identity, ready to face any challenges that may lie ahead."
    } else {
      messageDiv.innerHTML = "Faced with the mermaid-like creature's sudden attack, you choose to stand your ground and fight. You draw upon your inner strength and courage, realizing that you possess the skills of a warrior. The creature lunges at you, but you deftly evade its attack, demonstrating your combat prowess. With swift and precise strikes, you fend off the creature, driving it back. Your skills resemble those of a masterful monster " +
              "hunter. Ending (Witcher): As you defeat the mermaid-like creature, a newfound sense of identity washes over you. You are not just anyone; you are a Witcher, a skilled warrior who specializes in combating monsters and protecting the world from supernatural threats. Your lost memory may still hold many secrets, but you now know your true calling."
    }
  }
</script>
</body>
</html>
