<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Login</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- 
        Rectangle Template 
        http://www.templatemo.com/preview/templatemo_439_rectangle
    	-->
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/templatemo-style.css">
        
        <script src="js/vendor/modernizr-2.6.2.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
        
        <div class="site-bg"></div>
        <div class="site-bg-overlay"></div>

        <!-- TOP HEADER -->
        <div class="top-header">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <p class="phone-info"> 우리 학생들의 미래, 우리가 만들어갑니다. </p>
                    </div>                    
                </div>
            </div>
        </div> 
         
        <!-- .top-header -->

		
        <div class="visible-xs visible-sm responsive-menu">
            <a href="#" class="toggle-menu">
                <i class="fa fa-bars"></i> Show Menu
            </a>
            <div class="show-menu">
                <ul class="main-menu">
                    <li>
                        <a class="show-1 active homebutton" href="#"><i class="fa fa-home"></i>Home</a>
                    </li>
                    <li>
                        <a class="show-2 aboutbutton" href="#"><i class="fa fa-user"></i>About Us</a>
                    </li>
                    <li>
                        <a class="show-3 projectbutton" href="#"><i class="fa fa-camera"></i>Gallery</a>
                    </li>
                    <li>
                        <a class="show-5 contactbutton" href="#"><i class="fa fa-envelope"></i>Contact</a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="container" id="page-content">
            <div class="row">


                
                <div class="col-md-9 col-sm-12 content-holder">
                    <!-- CONTENT -->
                    <div id="menu-container">
                        
                        <div class="logo-holder logo-top-margin">
                            <a href="#" class="site-brand"><img src="images/logo.png" alt=""></a>
                        </div>
                        
                        
                        <div id="menu-1" class="homepage home-section text-center">
                            <div class="welcome-text">
                                <h2><strong>Login</strong></h2>                                
                                <form action="certify.do" method="post" class="subscribe-form">
                                	<!-- id 부분 -->
                                    <div class="row">
                                        <fieldset class="col-md-offset-2 col-md-6">
                                            <input name="userId" type="text" class="email" id="subscribe-email" placeholder="Write your Id">
                                        </fieldset>                                            
                                    </div>
                                    <br>
                                    <!-- password 부분 -->
                                    <div class="row">
                                        <fieldset class="col-md-offset-2 col-md-6">
                                            <input name="userPwd" type="password" class="email" id="subscribe-email" placeholder="Write your Password">
                                        </fieldset>
                                        <!-- 확인버튼 -->
                                        <fieldset class="col-md-4 button-holder">
                                            <input name="submit" type="submit" class="button default" id="submit" value="Ok">
                                        </fieldset>                                        
                                    </div>                                                                      	
                                        <!--  회원가입 할 거면 넣어야함 
                                        <fieldset class="col-md-4 button-holder">
                                            <input name="submit" type="submit" class="button default" id="submit" value="Search">
                                        </fieldset>
                                        -->                                  
                                    <!-- <p class="subscribe-text">Please subscribe your email for latest updates!</p> -->
                                </form>
                                
                                <!-- Site Footer 때문에 고의로 띄워줌 -->
                                <br><br><br><br><br><br><br>                       
                            </div>
                        </div>

                        <div id="menu-2" class="content about-section">
                            <div class="row">
                                <div class="col-md-8 col-sm-8">
                                    <div class="box-content profile">
                                        <h3 class="widget-title"> 정 명희</h3><!-- 학생 이름 -->
                                        <div class="profile-thumb">
                                            <img src="images/8.jpg" alt=""> <!-- 학생 사진  -->
                                        </div>
                                        <!-- 프로필  -->
                                        <div class="profile-content">
                                        	<p> Call  <p>
                                        	<span class="profile-role"> 010.1234.5678 </span>
                                        	<p> Address <p>
                                        	<span class="profile-role"> Gunsan, Korea </span>
                                        	<p> Sex </p>
                                        	<span class="profile-role"> Female </span>
                                        	<p> Family </p>
                                        	<span class="profile-role"> Father, Mother, Older-sister </span>
                                        	<p> Spec </p>
                                        	<span class="profile-role"> 교정기 착용 </span>
                                        	<p> Enroll Date </p>
                                        	<span class="profile-role"> 2016.05.16 </span>
                                        	
                                        	<!--
                                            <h5 class="profile-name">Linda Beauty</h5>
                                            <span class="profile-role">Creative Director</span>
                                            <p>Most of the images are from <a rel="nofollow" href="http://unsplash.com">Unsplash.com</a> website. Curabitur auctor justo pretium purus varius sagittis. Aliquam porttitor leo sapien, hendrerit dapibus lorem.<br><br>
											Change icons by <a rel="nofollow" href="http://fontawesome.info/font-awesome-icon-world-map/">Font Awesome</a> (version 4). Example: <span class="blue">&lt;i class=&quot;fa fa-refresh&quot;&gt;&lt;/i&gt;</span></p>
											 -->
                                        </div>                                       
                                    </div>
                                    
                                </div>
                                
                                <!-- 여기부터 프로필 계속해서 추가하면된다. -->
                                <div class="col-md-8 col-sm-8">
                                    <div class="box-content profile">
                                        <h3 class="widget-title"> 주 우성</h3><!-- 학생 이름 -->
                                        <div class="profile-thumb">
                                            <img src="images/8.jpg" alt=""> <!-- 학생 사진  -->
                                        </div>
                                        <div class="profile-content">
                                        	<p> Call  <p>
                                        	<span class="profile-role"> 010.8765.4314 </span>
                                        	<p> Address <p>
                                        	<span class="profile-role"> New York, America </span>
                                        	<p> Sex </p>
                                        	<span class="profile-role"> Male </span>
                                        	<p> Family </p>
                                        	<span class="profile-role"> Father, Mother, Older-brother, Younger-sister </span>
                                        	<p> Spec </p>
                                        	<span class="profile-role"> 1달전 라식수술</span>
                                        	<p> Enroll Date </p>
                                        	<span class="profile-role"> 2016.05.01 </span>                              	
                                        
                                        </div>                                       
                                    </div>                                    
                                </div>
                                <!-- 여기까지 복사 -->
                                <!-- 
                                <div class="col-md-4 col-sm-4">
                                    <div class="box-content">
                                        <h3 class="widget-title">Background</h3>
                                        <p>Vestibulum pellentesque ante sit amet tristique hendrerit. Sed consequat, nunc lobortis faucibus pretium, enim nibh blandit est, nec sollicitudin est quam a neque. Aenean eget malesuada justo.</p>
                                        <div class="about-social">
                                            <ul>
                                                <li><a href="#" class="fa fa-facebook"></a></li>
                                                <li><a href="#" class="fa fa-twitter"></a></li>
                                                <li><a href="#" class="fa fa-linkedin"></a></li>
                                                <li><a href="#" class="fa fa-dribbble"></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                 -->
                            </div>
                            <!-- 
                            <div class="row">
                                <div class="col-md-5 col-sm-5">
                                    <div class="box-content">
                                        <h3 class="widget-title">Our Studio</h3>
                                        <div class="project-item">
                                            <img src="images/7.jpg" alt="">
                                            <div class="project-hover">
                                                <h4>Great Nature Capture</h4>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-7 col-sm-7">
                                    <div class="box-content">
                                        <h3 class="widget-title">Our Technical Skills</h3>
                                        <ul class="progess-bars">
                                            <li>
                                                <span>HTML CSS 80%</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <span>PHOTOSHOP 95%</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" aria-valuenow="95" aria-valuemin="0" aria-valuemax="100" style="width: 95%;"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <span>WORDPRESS 70%</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%;"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <span>PHP mySQL 50%</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%;"></div>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            row를 닫음-->
                        </div>
                         
						<!-- 3번째 메뉴 -->
                        <div id="menu-3" class="content gallery-section">
                        <!--  -->
                        
                            <div class="box-content">
                                <h3 class="widget-title">Past Projects</h3>
                                <div class="row">
                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                    <fieldset class="col-md-4 button-holder">
                                            <input name="submit" type="text" class="button default" id="submit" value="Search">
                                    </fieldset>
                                        <div class="project-item">
                                            <img src="images/1.jpg" alt="">
                                            <div class="project-hover">
                                                <h4>Great Nature Capture</h4>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                        <div class="project-item">
                                            <img src="images/2.jpg" alt="">
                                            <div class="project-hover">
                                                <h4>Another Image Caption</h4>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                        <div class="project-item">
                                            <img src="images/3.jpg" alt="">
                                            <div class="project-hover">
                                                <h4>Great Nature Capture</h4>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                        <div class="project-item">
                                            <img src="images/4.jpg" alt="">
                                            <div class="project-hover">
                                                <h4>Another Image Caption</h4>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                        <div class="project-item">
                                            <img src="images/5.jpg" alt="">
                                            <div class="project-hover">
                                                <h4>Great Nature Capture</h4>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                        <div class="project-item">
                                            <img src="images/6.jpg" alt="">
                                            <div class="project-hover">
                                                <h4>Another Image Caption</h4>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="project-pages">
                                    <ul>
                                        <li><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">...</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div id="menu-4" class="content contact-section">
                            <div class="row">
                                <div class="col-md-8 col-sm-8">
                                    <div class="box-content">
                                        <h3 class="widget-title">Send Us A Message</h3>
                                        <form class="contact-form">
                                            <fieldset>
                                                <input type="text" class="name" id="name" placeholder="Name...">
                                            </fieldset> 
                                            <fieldset>
                                                <input type="email" class="email" id="email" placeholder="Email...">
                                            </fieldset> 
                                            <fieldset>
                                                <input type="text" class="subject" id="subject" placeholder="Subject...">
                                            </fieldset>
                                            <fieldset>
                                                <textarea name="message" id="message" cols="30" rows="4" placeholder="Message.."></textarea>
                                            </fieldset>
                                            <fieldset>
                                                <input type="submit" class="button" id="button" value="Send Message">
                                            </fieldset>
                                        </form>
                                    </div>
                                </div>
                                <div class="col-md-4 col-sm-4">
                                    <div class="box-content">
                                        <h3 class="widget-title">Stay In Touch</h3>
                                        <p>Sed ullamcorper, risus a tincidunt efficitur, massa mauris ultricies leo, eu interdum eros erat non augue. <br><br>
										Suspendisse ornare sollicitudin lectus non egestas. Nam fermentum imperdiet ligula congue venenatis. </p>
                                        <div class="about-social">
                                            <ul>
                                                <li><a href="#" class="fa fa-facebook"></a></li>
                                                <li><a href="#" class="fa fa-twitter"></a></li>
                                                <li><a href="#" class="fa fa-linkedin"></a></li>
                                                <li><a href="#" class="fa fa-dribbble"></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

				<!-- 
                <div class="col-md-3 hidden-sm">
                    
                    <nav id="nav" class="main-navigation hidden-xs hidden-sm">
                        <ul class="main-menu">
                            <li>
                                <a class="show-1 active homebutton" href="#"><i class="fa fa-home"></i>Home</a>
                            </li>
                            <li>
                                <a class="show-2 aboutbutton" href="#"><i class="fa fa-user"></i>Managing Students</a>
                            </li>
                            <li>
                                <a class="show-3 projectbutton" href="#"><i class="fa fa-camera"></i>Managing Grade</a>
                            </li>
                            <li>
                                <a class="show-5 contactbutton" href="#"><i class="fa fa-envelope"></i>Contact</a>
                            </li>
                        </ul>
                    </nav>

                </div>
                 -->
            </div>
        </div>

        <!-- SITE-FOOTER -->
        <div class="site-footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <p>
                        	Copyright &copy; 2016 SeoKyeong Academy
                        
                    <!-- | Design: <a href="http://www.templatemo.com" target="_parent"><span class="green">free templates</span></a> -->
                        </p>
                    </div>
                </div>
            </div>
        </div> <!-- .site-footer -->

        <script src="js/vendor/jquery-1.10.2.min.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>
		<!-- templatemo 439 rectangle -->
    </body>
</html>