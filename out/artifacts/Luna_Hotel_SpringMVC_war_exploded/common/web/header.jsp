<%--
  Created by IntelliJ IDEA.
  User: ASUS-PRO
  Date: 11/13/2022
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/common/tablib.jsp"%>
<header class="header-section">
  <div class="top-nav">
    <div class="container">
      <div class="row">
        <div class="col-lg-6">
          <ul class="tn-left">
            <li>
              <i class="fa fa-phone"></i>
              (+84) 345678910
            </li>
            <li>
              <i class="fa fa-envelope"></i>
              Luna Hotel.com.vn
            </li>
          </ul>
        </div>
        <div class="col-lg-6">
          <div class="tn-right">
            <div class="top-social">
              <a href="#"><i class="fa fa-facebook-f"></i></a>
              <a href="#"><i class="fa fa-twitter"></i></a>
              <a href="#"><i class="fa fa-tripadvisor"></i></a>
              <a href="#"><i class="fa fa-instagram"></i></a>
            </div>
            <a href="#" class="bk-btn">Booking Now</a>
            <div class="language-option">
              <img src="<c:url value='/template/web/assets/img/flag.png'/>" alt="">
              <span>VN <i class="fa fa-angle-down"></i></span>
              <div class="flag-dropdown">
                <ul>
                  <li><a href="#">VN</a></li>
                  <li><a href="#">EN</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="menu-item">
    <div class="container">
      <div class="row">
        <div class="col-lg-2">
          <div class="logo">
            <a class="navbar-brand" href="#">
              <img src="<c:url value='/template/web/assets/img/logo.png'/>" width="50%" height="10%" class="img-thumbnail" alt="logo">
            </a>
          </div>
        </div>
        <div class="col-lg-10">
          <div class="nav-menu">
            <nav class="mainmenu">
              <ul>
                <li class="active"><a href="trang-chu">Home</a></li>
                <li><a href="room">Rooms</a></li>
                <li><a href="about-us">About Us</a></li>
                <li><a href="#">Pages</a>
                  <ul class="dropdown">
                    <li><a href="#">Room Details</a></li>
                    <li><a href="#">Blog Details</a></li>
                    <li><a href="#">Family Room</a></li>
                    <li><a href="#">Premium Room</a></li>
                  </ul>
                </li>
                <li><a href="blog">News</a></li>
                <li><a href="contact">Contact</a></li>
              </ul>
            </nav>
            <div class="nav-right search-switch">
              <i class="fa fa-search"></i>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</header>