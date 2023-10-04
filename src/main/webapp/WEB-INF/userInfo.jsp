<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Member Page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <link href="<c:url value="/css/styles.css" />" rel="stylesheet">
</head>
<body>
<section class="vh-100 bg-image"
         style="background-image: url('https://images.unsplash.com/photo-1694376015496-140430f9bf88?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2128&q=80');">
  <div class="mask d-flex align-items-center h-100">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-4">
              <h2 class="text-uppercase text-center mb-2">Member Page</h2>
            </div>
            <div class="form-outline mb-3 mx-5">
              <p> <b>ID:</b> ${user.id}</p>
            </div>
            <div class="form-outline mb-3 mx-5">
              <p><b>EMAIL:</b> ${user.email}</p>
            </div>
            <div class="form-outline mb-3 mx-5">
              <p><b>NICKNAME:</b> ${user.nickname}</p>
            </div>
            <div class="form-outline mb-3 mx-5">
              <p><b>ROLE:</b> ${user.role}</p>
            </div>
            <div class="form-outline mb-3 mx-5">
              <p><b>IP ADDRESS:</b> ${user.ipAddress}</p>
            </div>
            <div class="d-flex mx-5 mb-3 justify-content-evenly">
              <a class="submit0btn" href="/quest">Quests</a>
              <a class="submit0btn" href="/login?logout=true">Log out</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  </div>
</section>
<footer class="bg-dark text-white d-flex justify-content-center align-items-center py-2 fixed-bottom">
  <div class="d-flex flex-row gap-3">
    <div class="footer-item">
      <a href="https://github.com/nestserka"><img src="<c:url value="/icon/github.png"/>" alt="Git"/></a>
    </div>
    <div class="footer-item">
      <a href="https://www.linkedin.com/in/katsiaryna-nestserava-4b6320266/"><img src="<c:url value="/icon/linkedin.png"/>" alt="Instagram"/></a>
    </div>
    <div class="footer-item">
      <a href="https://www.instagram.com/mercy_codes/?igshid=NGVhN2U2NjQ0Yg%3D%3D"><img src="<c:url value="/icon/instagram.png"/>" alt="Medium"/></a>
    </div>
  </div>
</footer>
</body>
</html>