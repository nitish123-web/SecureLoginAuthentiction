<%@page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>


    <style>
        *{
            margin: 0;
            padding: 0;
        }
        nav{
            background: linear-gradient(to right, #08d13ac4, #153dc3);
        }
        body {
            background: linear-gradient(to right, #08d13ac4, #153dc3);

                        font-size: large;
        }
        .login-container {
            max-width: 500px; /* Compact width */
            margin: 80px auto;
        }

    </style>
    
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand text-light" href="#">Home</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link active text-light" aria-current="page" href="/login">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link text-light " href="/register">Signup</a>
              </li>
              <li class="nav-item">
                <a class="nav-link text-light" href="#">Feedback</a>
              </li>
            </ul>

            

          </div>


        </div>
      </nav>

      <div class="body d-flex justify-content-center">      

    <div class="container">
        <div class="login-container">    
            <div class="card shadow-lg">
                <div class="card-body">
                    <form action="Auth" method="POST">
                        <div class="mb-2 mt-1">
                            <label for="empid" class="form-label">Employee id</label>
                            <input type="text" class="form-control" id="empid" name="empid" placeholder="Enter Emp Id" required>
                        </div>
                        <div class="mb-2">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password" name="pass" placeholder="Enter password" required>
                        </div>
                        
                         <div class="mb-2 form-check">
                             <img src="/captcha" alt="CAPTCHA Image">
                              <input type="text" name="captchaInput" placeholder="Enter CAPTCHA" required>
                        </div>
                        <br><br>
    
                        <div class="mb-2 form-check">
                            <input type="checkbox" class="form-check-input" id="rememberMe" name="checkbox">
                            <label class="form-check-label" for="rememberMe">Remember me</label>
                        </div>
                        <button type="submit" class="btn btn-primary w-100">Login</button>
                    </form>
                    <div class="text-center mt-2">
                        <a href="#">Forgot password?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>