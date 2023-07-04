<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"><meta charset="ISO-8859-1">
	<title>Online Pharmacy  request</title>

	<link rel="shortcut icon" href="assets/images/fav.jpg">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/fontawsom-all.min.css">
    <link rel="stylesheet" href="assets/css/animate.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css" />
    <link rel="stylesheet" href="assets/css/form.css"/>
</head>

<body>

       <header>
        <div class="header-top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7 col-md-12 left-item">
                        <ul>
                            <li><i class="fas fa-envelope-square"></i> AsiaHospitals@gmail.com</li>
                            <li><i class="fas fa-phone-square"></i> +94 115 212 213</li>
                        </ul>
                    </div>
                    <div class="col-lg-5 d-none d-lg-block right-item">
                        <ul>
                            
                            <li><a><i class="fab fa-google-plus-g"></i></a></li>
                            <li> <a><i class="fab fa-pinterest-p"></i></a></li>
                            <li><a><i class="fab fa-twitter"></i></a></li>
                            <li> <a><i class="fab fa-facebook-f"></i></a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
        <div id="nav-head" class="header-nav">
            <div class="container">
                <div class="row">
                    <div class="col-lg-2 col-md-3 no-padding col-sm-12 nav-img">
                        <img src="assets/images/logo.jpg" alt="">
                       <a data-toggle="collapse" data-target="#menu" href="#menu" ><i class="fas d-block d-md-none small-menu fa-bars"></i></a>
                    </div>
                    <div id="menu" class="col-lg-8 col-md-9 d-none d-md-block nav-item">
                        <ul>
                            <li><a href="index.html">Home</a></li>
                            <li><a href="about_us.html">About Us</a></li>
                            <li><a href="#">Lab Reports</a></li> 
                            <li><a href="gallery.html">Contact Us</a></li>
                            <li><a href="PharmacyReq.jsp">Online Pharmacy</a></li>
                            <li><a href="login.jsp">LogIn</a></li>
                        </ul>
                    </div>
                    <div class="col-sm-2 d-none d-lg-block appoint">
                        <button class="btn btn-info">Book an Appointment</button>
                    </div>
                </div>

            </div>
        </div>

    </header> 
    
    <div class="container2">
    
    	<div class="container1">	
    	<div class="title">Online Pharmacy Service</div>

		<form action = "submit" method = "post">
		<div class="user-details">
		
		<div class="input-box">
		<span class="details" >Title : </span>
				<select name="titles" id="titles">
                <option value="Rev">Rev</option>
                <option value="Mr" selected>Mr</option>
                <option value="Mrs">Mrs</option>
                <option value="Miss">Miss</option>
                <option value="Prof">Prof</option>
                <option value="Dr">Dr</option>
          	    </select><br><br> 
		</div>
		
		<div class="input-box">
		<span class="details">Name :</span> 
		<input type="text" name = "name" placeholder="Patient name" required><br><br>
		</div>
	
		<div class="input-box">
		<span class= "details">NIC :</span>  
		<input type="text" name="nic" placeholder="Patient NIC number" maxlength="12" required/><br/><br/>
        </div>
        
        <div class="input-box">    
	    <span class= "details">Permanent Address : </span><br/>
	    <textarea name="address" rows="5" cols="60" placeholder="Address" required></textarea><br/><br/>
		</div>	
		
		<div class="input-box">
		<span class= "details">Age : </span>
		<input type="text" name="age" placeholder="Patient age" required> <br><br>
		</div>
		
		<div class="radio-gen">
		Gender : 
				 <input type="radio" name="gender" id="male" value="male">
        	     <label for="male">Male</label>&nbsp
        	     <input type="radio" name="gender"id="female" value="female">
            	 <label for="female">Female</label><br/><br/>   
		</div>
		
		<div class="input-box">
		<span class= "details">Contact Number : </span>
		<input type="text" name="mobile" placeholder="07XXXXXXXX" pattern="[0-9]{10}" required><br/><br/> 
		</div>    
    	
    	<div class="input-box">
    	<span class= "details">Email : </span>
    	<input type="email" placeholder="abc@gmail.com" name="email" 
    	pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}" required/><br/><br/> 
		</div>	     
		
		<div class="input-box">
    	<span class= "details">Comment :</span><br>
    	<textarea name = "comment" rows="5" cols="60"></textarea><br><br>
    	</div>
    	</div>
    	
    	<div class="button">
    	<center><input type="submit" name = "submit" value="submit"></center> 
    	</div>
    	
    </form>
	</div>
   </div>
    
    
     <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-12">
                    <h2>About Us</h2>
                    <p>
                    	The entry of ASIA Hospitals into the state dominated healthcare sector in 1985, saw the private health care system take root in Sri Lanka. The launch of the hospital and the overwhelming response it received from the people demonstrated a long felt need for superior healthcare in a pleasant environment.
                </div>
                <div class="col-md-4 col-sm-12">
                    <h2>Useful Links</h2>
                    <ul class="list-unstyled link-list">
                        <li><a ui-sref="about" href="#/about">About us</a><i class="fa fa-angle-right"></i></li>
                        <li><a ui-sref="portfolio" href="#/portfolio">Lab Reports</a><i class="fa fa-angle-right"></i></li>
                        <li><a ui-sref="products" href="#/products">Online Pharmacy</a><i class="fa fa-angle-right"></i></li>
                        <li><a ui-sref="gallery" href="#/gallery">Gallery</a><i class="fa fa-angle-right"></i></li>
                        <li><a ui-sref="contact" href="#/contact">Contact us</a><i class="fa fa-angle-right"></i></li>
                    </ul>
                </div>
                <div class="col-md-4 col-sm-12 map-img">
                    <h2>Contact Us</h2>
                    <address class="md-margin-bottom-40">
                        ASIA Hospitals <br>
                        Narahenpita <br>
                        Colombo 03, SL <br>
                        Phone: +94 115 212 213 <br>
                        Email: <a href="mailto:info@anybiz.com" class=""> AsiaHospitals@gmail.com</a><br>
                        Web: <a href="smart-eye.html" class="">www.AsiaHospitals.lk</a>
                    </address>

                </div>
            </div>
        </div>
        

    </footer>
    <div class="copy">
            <div class="container">
                <a href="">2021 &copy; All Rights Reserved | Designed and Developed by alpha Solutions</a>
                
                <span>
                <a><i class="fab fa-google-plus-g"></i></a>
                <a><i class="fab fa-pinterest-p"></i></a>
                <a><i class="fab fa-twitter"></i></a>
                <a><i class="fab fa-facebook-f"></i></a>
        </span>
            </div>

        </div>

</body>

	<script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/plugins/scroll-fixed/jquery-scrolltofixed-min.js"></script>
	<script src="assets/js/script.js"></script>
</html>