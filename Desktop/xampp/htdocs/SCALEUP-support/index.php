<?php include ("sendemail.php");


?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>SCALEUP support</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLE CSS -->
    <script src="https://kit.fontawesome.com/8d6b8d0e75.js" crossorigin="anonymous"></script>
    <!-- VEGAS STYLE CSS -->
    <link href="assets/scripts/vegas/jquery.vegas.min.css" rel="stylesheet" />
    <!-- CUSTOM STYLE CSS -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- GOOGLE FONT -->
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;500;700&amp;display=swap" rel="stylesheet">
</head>

<body>

<?php echo $alert; ?>
    <!-- Navigation section -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">SCALEUP.</a>
            </div>
            <!-- Collect the nav links for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#home">HOME</a>
                    </li>
                    <li><a href="#about">ABOUT US</a> </li>

                    <li><a href="#solutions">SOLUTIONS</a>
                    </li>
                    <li><a href="#contact-section">CONTACT</a>
                    </li>
                    <li><a href="#login-section">LOG IN</a>
                    </li>


                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!--End Navigation -->

    <!--Header section  -->
    <div class="container" id="home">
        <div class="row text-center">
            <div class="col-md-12">
                <h1 class="text-white">Call center solution</h1>
                <h4 class="text-white">Everything SME needs from a call center to deliver exeptional customer service</h4>
                <a class="btn btn-danger btn-lg " href="#about">Read More </a>
                <div class="head-last"></div>

            </div>


        </div>
    </div>
    <!--End Header section  -->

    <!--About Section-->
    <section class="for-full-back color-white" id="about">
        <div class="container">
            <div class="row text-center space-pad"> 

              <div class="col-md-4 ">                
                <div class="about-div">
                  <h3>About us</h3>
                  <p> We are a global corporation offering solutions in IT, Business Consulting and Outsourcing Services. Founded in 2014 with the single-minded purpose of using technology to equip and enable businesses build efficiency, negate global distances, save time and increase bottom lines worldwide, we have earned our stripes with a decade of satisfying experiences. </p>
                </div>
            </div>

                <div class="col-md-4 ">                  
                    <div class="about-div">
                      <h3>Our mission</h3>
                      <p>Scaleup will be a partner of choice by providing value to enable our customer's long-term sustainable growth.</p>
                    </div>
                </div>

                <div class="col-md-4 ">                  
                    <div class="about-div">
                      <h3>Our vision</h3>
                     <p> Scaleup is committed to providing ongoing value to our customers. We leverage technology and implement best practices, to provide a range of high quality and cost-efficient Information Technology Solutions, from global locations enabling customers achieve their business goals.</p>
                    </div>
                </div>
            </div>          
        </div>
    </section>

      <!-- Solutions Section -->

    <section class="for-full-back color-white " id="solutions">
        <div class="container">
            <div class="row text-center">  
              
              <div class="col-md-3 ">                  
                <div class="about-div">
                  <img src="https://img.icons8.com/fluent/48/000000/search.png"/>                 
                  <h3>Research</h3>
                  <p>We provide on-demand market researches and business analysis within various industries, based on specific needs of the customer.</p>
                </div>
            </div>
              
              <div class="col-md-3 ">                  
                <div class="about-div">
                  <img src="https://img.icons8.com/fluent/48/000000/check-all.png"/>
                  <h3>Quick Wins</h3>
                  <p>Immediate fix, shaping an idea or just improvement for your day-to-day operations. A delivery won't take more than 1-30 days. </p>
                </div>
            </div>

            <div class="col-md-3 ">                  
              <div class="about-div">
                <img src="https://img.icons8.com/material-rounded/48/26e07f/speech-bubble-with-dots.png"/>
                <h3>Consulting</h3>
                <p>Advisory on the business transformation, digitalization and strategic planning in various areas. Projects are 1-6 months long.</p>
              </div>
          </div>

          <div class="col-md-3 ">                  
            <div class="about-div">
              <img src="https://img.icons8.com/android/40/26e07f/expand.png"/>
              <h3>Outsourcing</h3>
              <p>Delivering results and outputs via outsourced process in HR, Sales,Data and Project Management. All on long-term contracts.</p>
            </div>
        </div>

            </div>
        </div>
    </section>
    <!--End Solutions Section -->

    

  

    <!--contact section start-->
    <section class="for-full-back color-white " id="contact-section">
        <div class="contact-form">
          
          <form class="contact" action="" method="post">
            <h4>Contact us</h4>
            <input type="email" name="email" class="text-box" placeholder="Your Email" required>
            <textarea name="message" rows="5" placeholder="Your Message" required></textarea><br>
            <input type="submit" name="submit" class="send-btn" value="Send">
          </form>
        </div>
      </section>
      <!--contact section end-->

      <!--login section start-->
  
      <section class="for-full-back color-white " id="login-section">
        <div class="contact-form">
          
          <form class="contact" action="/login.php" method="post">
            <h4>Log in to your account</h4>
            <input type="text" name="uname" class="text-box" placeholder="Your username" required><br>
            <input type="password" name="password" class="text-box" placeholder="Your password" required><br>
            <button type="submit" class="send-btn">Login</button>
          </form>
        </div>
  </section>
   

    <footer class="footer bg-dark">
        <div class="container">
          <div class="row justify-content-between">
  
            <div class="footer-col col-md-6">
              <h3 class="text-white">ABOUT SCALEUP.</h3>
              <p class="text-white text-justify">SCALEUP. brings digital transformation and solutions to fast-growing companies as well as family businesses. We do scale-up advisory and can help to accelerate your growth in the areas of Market Research, Sales, HR, Data Analytics, Productivity and Automation. We are an international team, fluent in 10+ languages, specialists in more than 100 cloud-based tools, with strong local knowledge and presence. Let’s scale-up together!</p>
            </div>
  
            <div class="footer-col col-6 col-md-3 col-xl-2">
              <h3 class="text-white">OUR LOCATIONS</h3>
              <ul class="list-unstyled footer-links mb-0">
                <li>
                  <a href="https://www.google.com/maps/place/29+Boulevard+Grande-Duchesse+Charlotte,+1331+Luxembourg/@49.6082674,6.1170895,17z/data=!3m1!4b1!4m5!3m4!1s0x4795492a51687487:0x346e7f6e5a0bd70b!8m2!3d49.6082639!4d6.1192782" target="_blank" rel="noreferrer">
                    <div class="rounded-rect text-transparent d-inline-block mr-1">LUX</div>
                  </a>
                  <a href="https://www.google.com/maps/place/Drtinova+557%2F10,+150+00+Praha+5,+Czechia/@50.0763942,14.4000848,17z/data=!3m1!4b1!4m5!3m4!1s0x470b94fecbdced4b:0x6a60d8e2418cf55f!8m2!3d50.0763908!4d14.4022735" target="_blank" rel="noreferrer">
                    <div class="rounded-rect text-transparent d-inline-block mr-1">PRG</div>
                  </a>
                </li>
                <li>
                  <a href="https://www.google.com/maps/place/Plac+Konesera+10,+03-736+Warszawa,+Poland/@52.2561467,21.0431318,17z/data=!3m1!4b1!4m5!3m4!1s0x471ecc382c99e04b:0x3e88640b5694ab88!8m2!3d52.2561467!4d21.0453205" target="_blank" rel="noreferrer">
                    <div class="rounded-rect text-transparent d-inline-block mr-1">WAW</div>
                  </a>
                  <a href="https://www.google.com/maps/place/SCALEUP+agency/@48.7330086,21.2935266,17z/data=!3m1!4b1!4m5!3m4!1s0x473edf8577714613:0x4f490dd9b7e474eb!8m2!3d48.7330051!4d21.2957153" target="_blank" rel="noreferrer">
                    <div class="rounded-rect text-transparent d-inline-block mr-1">KSC</div>
                  </a>
                </li>
              </ul>
            </div>
            
            <div class="footer-col col-6 col-md-3 col-lg-2">
              <h3 class="text-white">GET IN TOUCH</h3>
              <ul class="list-unstyled mb-0">
                <li class="social-icons">
                  <a href="https://www.facebook.com/scaleupagency/" class="footer-link" target="_blank" rel="noreferrer">
                    <i class="fab fa-facebook-square mr-2" aria-hidden="true"></i>
                  </a>
                  <a href="https://www.instagram.com/scaleupagency/" class="footer-link" target="_blank" rel="noreferrer">
                    <i class="fab fa-instagram mr-2" aria-hidden="true"></i>
                  </a>
                  <a href="https://www.linkedin.com/company/scaleupagency/" class="footer-link" target="_blank" rel="noreferrer">
                    <i class="fab fa-linkedin mr-2" aria-hidden="true"></i>
                  </a>
                  <a href="https://api.whatsapp.com/send?phone=421903104202" class="footer-link" rel="noreferrer">
                    <i class="fab fa-whatsapp" aria-hidden="true"></i>
                  </a>
                </li>
                <li><i class="fas fa-envelope mr-1" aria-hidden="true"></i><a href="mailto:info@scaleup.agency" class="footer-link" target="_blank">info@scaleup.agency</a></li>
                <li>
                  #scaleup #scaleupagency
                </li>
              </ul>
            </div>
          </div>
  
          <div class="mt-2 text-center text-white">
            <p class="text-white">
              SCALEUP. group © 2021 | <a href="/privacy-policy" target="_blank" class="footer-link">Privacy Policy</a> | <a href="https://www.cookiesandyou.com/" target="_blank" class="footer-link">Cookies Policy</a> 
          
            </p>
  
          </div>
        </div>
        
      </footer>


    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY  -->
    <script src="assets/plugins/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP CORE SCRIPT   -->
    <script src="assets/plugins/bootstrap.js"></script>
    <!-- VEGAS SLIDESHOW SCRIPTS -->
    <script src="assets/plugins/vegas/jquery.vegas.min.js"></script>
    <script src="assets/plugins/jquery.parallax-1.1.3.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>


    <script type="text/javascript">
    if(window.history.replaceState){
      window.history.replaceState(null, null, window.location.href);
    }
    </script>

  </body>
</html>