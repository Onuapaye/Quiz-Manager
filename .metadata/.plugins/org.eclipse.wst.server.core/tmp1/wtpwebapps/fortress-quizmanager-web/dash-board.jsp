<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Fortress QuizManager - Dash-board</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Favicons -->
<link href="resources/img/favicon.png" rel="icon">
<!-- <link href="resources/img/apple-touch-icon.png" rel="apple-touch-icon"> -->

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700"
	rel="stylesheet">



<!-- Libraries CSS Files -->
<!-- <link href="resources/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet"> -->
<link href="webjars/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link href="resources/lib/animate/animate.min.css" rel="stylesheet">
<link href="resources/lib/ionicons/css/ionicons.min.css"
	rel="stylesheet">
<link href="resources/lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="resources/lib/lightbox/css/lightbox.min.css"
	rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="resources/css/style.css" rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="webjars/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>

	<!--==========================
    Header
  ============================-->
	<header id="header" style="background-color: #111;">
		<div class="container-fluid">

			<div id="logo" class="pull-left">
				<h1>
					<a href="#intro" class="scrollto">QuizManager</a>
				</h1>
				<!-- Uncomment below if you prefer to use an image logo -->
				<!-- <a href="#intro"><img src="img/logo.png" alt="" title="" /></a>-->
			</div>

			<nav id="nav-menu-container">
				<ul class="nav-menu">
					<li class="menu-active"><a href="#intro">Dash-Board</a></li>
					<li class="menu-has-children"><a href="">${userName}</a>
						<ul>
							<li><a href="#">Settings</a></li>
							<li><a href="#">Change Password</a></li>
							<li><a href="#">Logout</a></li>
						</ul></li>
					<li><a href="#contact">Contact</a></li>
				</ul>
			</nav>
			<!-- #nav-menu-container -->
		</div>
	</header>
	<!-- #header -->

	<main id="main"> <!--==========================

      About Us Section
    ============================-->
	<section id="services"></section>

	<section id="about">
		<div class="container">

			<div class="row about-cols">

				<div class="col-md-3 wow fadeInUp">
					<div class="about-col">
						<div class="img">
							<img src="resources/img/apps.png" alt="" class="img-fluid">
							<div class="icon">
								<i class="ion-ios-speedometer-outline"></i>
							</div>
						</div>
						<h2 class="title">
							<a href="users">User Management</a>
						</h2>
						<!-- <p>The module to manage all the application Users by performing a
							simple CRUD (Create, Update, Delete and Read) operations.</p> -->
							<p>&nbsp;</p>
					</div>
				</div>

				<div class="col-md-3 wow fadeInUp" data-wow-delay="0.1s">
					<div class="about-col">
						<div class="img">
							<img src="resources/img/apps.png" alt="" class="img-fluid">
							<div class="icon">
								<i class="ion-ios-list-outline"></i>
							</div>
						</div>
						<h2 class="title">
							<a href="#">Student Management</a>
						</h2>
						<!-- <p>The module to manage the Students who comes to take Exams by performing a
							CRUD (Create, Update, Delete and Read) operations.</p> -->
							<p>&nbsp;</p>
					</div>
				</div>

				<div class="col-md-3 wow fadeInUp" data-wow-delay="0.2s">
					<div class="about-col">
						<div class="img">
							<img src="resources/img/apps.png" alt="" class="img-fluid">
							<div class="icon">
								<i class="ion-ios-eye-outline"></i>
							</div>
						</div>
						<h2 class="title">
							<a href="#">Exam Management</a>
						</h2>
						<!-- <p>The module to manage the Exams which Students take by performing a
							CRUD (Create, Update, Delete and Read) operations.</p> -->
							<p>&nbsp;</p>
					</div>
				</div>

				<div class="col-md-3 wow fadeInUp" data-wow-delay="0.2s">
					<div class="about-col">
						<div class="img">
							<img src="resources/img/apps.png" alt="" class="img-fluid">
							<div class="icon">
								<i class="ion-ios-eye-outline"></i>
							</div>
						</div>
						<h2 class="title">
							<a href="#">Question Management</a>
						</h2>
						<!-- <p>The module to manage the Questions to be taken during Exams by performing a
							CRUD (Create, Update, Delete and Read) operations.</p> -->
							<p>&nbsp;</p>
					</div>
				</div>

			</div>

		</div>
	</section>
	<!-- #about --> </main>
	<!--==========================
    Footer
  ============================-->
	<footer id="footer">

		<div class="container">
			<div class="copyright">
				&copy; Copyright <strong>Fortess QuizManager</strong>. All Rights
				Reserved
			</div>
			<div class="credits">
				Designed by <a href="#"><strong>Bismark and Mihika</strong></a>
			</div>
		</div>
	</footer>
	<!-- #footer -->

	<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>


	<!-- JavaScript Libraries -->
	<script src="resources/lib/jquery/jquery.min.js"></script>
	<script src="resources/lib/jquery/jquery-migrate.min.js"></script>
	<script src="resources/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="resources/lib/easing/easing.min.js"></script>
	<script src="resources/lib/superfish/hoverIntent.js"></script>
	<script src="resources/lib/superfish/superfish.min.js"></script>
	<script src="resources/lib/wow/wow.min.js"></script>
	<script src="resources/lib/waypoints/waypoints.min.js"></script>
	<script src="resources/lib/counterup/counterup.min.js"></script>
	<script src="resources/lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="resources/lib/isotope/isotope.pkgd.min.js"></script>
	<script src="resources/lib/lightbox/js/lightbox.min.js"></script>
	<script src="resources/lib/touchSwipe/jquery.touchSwipe.min.js"></script>
	<!-- Contact Form JavaScript File -->
	<script src="resources/contactform/contactform.js"></script>

	<!-- JavaScript plugins -->
	<script src="resources/js/main.js" type="text/javascript"></script>
	<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.1.1/js/bootstrap.min.js"></script>

</body>
</html>