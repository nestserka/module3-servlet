<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
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
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Player Info</h2>
              <form action="/login" method="post">
                <div class="form-outline mb-3">
                  <label class="form-label" for="nickname">Nickname</label>
                  <input type="text" id="nickname" class="form-control form-control-lg" />
                </div>
                <div class="form-outline mb-3">
                  <label class="form-label" for="email">Email</label>
                  <input type="email" id="email" class="form-control form-control-lg" name="email" pattern="^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$" required>
                </div>
                <div class="mb-3">
                  <label class="form-label">Select an Option</label>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="role" id="option1" value="PLAYER">
                    <label class="form-check-label" for="option1">
                      Player
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="role" id="option2" value="ADMIN">
                    <label class="form-check-label" for="option2">
                      Admin
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="role" id="option3" value="WRITER">
                    <label class="form-check-label" for="option3">
                      Quest Writer
                    </label>
                  </div>
                </div>
                <div class="d-flex justify-content-center">
                  <button id="submit" name="submit"
                          class="submit0btn">Enter</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>