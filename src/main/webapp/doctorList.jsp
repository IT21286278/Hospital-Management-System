<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link rel = "stylesheet" href = "formsCSS2.css">
    <link rel = "stylesheet" href = "formsCSS1.css">
    
    <link rel="shortcut icon" href="assets/images/fav.jpg">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/fontawsom-all.min.css">
    <link rel="stylesheet" href="assets/css/animate.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/form.css" />

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
                            <li><a href="services.html">Lab Reports</a></li> 
                            <li><a href="gallery.html">Contact Us</a></li>
                            <li><a href="contact_us.html">Online Pharmacy</a></li>
                            <li><a href="news.html">LogIn</a></li>
                        </ul>
                    </div>
                    <div class="col-sm-2 d-none d-lg-block appoint">
                        <button class="btn btn-info">Book an Appointment</button>
                    </div>
                </div>

            </div>
        </div>

    </header>



	
    
    
    <form action = "display" method = "post">
        <div>
            <fieldset id = fieldsetDList>
                
                <img src = "healthcare-technology-doctor-using-digital-tablet-icon-medical-network-hospital-background-162019727">
                <h2>Doctor List</h2>
                <h3>Enter any of below ID to find more about your doctor</h3>
                
                <table id ="tble" border="1">
                    <tr>
                        <th>Doctor ID</th>
                        <th>Doctor Name</th>
                    </tr>
                    
                    <tr>
                        <td>1</td>
                        <td>Mr.R.M.Ranathunga</td>
                    </tr>
                    
                    <tr>
                        <td>2</td>
                        <td>MrA.G.Kulathunga</td>
                    </tr>
                    
                    
                    <tr>
                        <td>3</td>
                        <td>Mr.W.A.Pathirana</td>
                    </tr>
                    
                    
                    <tr>
                        <td>4</td>
                        <td>Ms.A.Kulasooriya</td>
                    </tr>
                    
                    
                    <tr>
                        <td>5</td>
                        <td>Ms.T.E.Punchihewa</td>
                    </tr>
                
                </table>
                
                <br><br>
                
                Doctor ID : <input type = "text" name = "docID">
                <input id = "sbmtDID" type = "submit" name = "submit" value = "SUBMIT">
            
            </fieldset> 
        </div>
    </form>
    
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
    
    
</body>
</html>
