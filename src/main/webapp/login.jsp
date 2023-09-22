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
  <div class="mask d-flex align-items-center h-100 gradient-custom-3">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Player Info</h2>
              <form>
                <div class="form-outline mb-3">
                  <label class="form-label" for="form3Example1cg">Nickname</label>
                  <input type="text" id="form3Example1cg" class="form-control form-control-lg" />
                </div>
                <div class="form-outline mb-3">
                  <label class="form-label" for="form3Example3cg">Email</label>
                  <input type="email" id="form3Example3cg" class="form-control form-control-lg" />
                </div>
                <div class="mb-3">
                  <label class="form-label">Select an Option</label>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="option1" value="option1">
                    <label class="form-check-label" for="option1">
                      Player
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="option2" value="option2">
                    <label class="form-check-label" for="option2">
                      Admin
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="option3" value="option3">
                    <label class="form-check-label" for="option3">
                      Quest Writer
                    </label>
                  </div>
                </div>
                <div class="d-flex justify-content-center">
                  <button type="button"
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