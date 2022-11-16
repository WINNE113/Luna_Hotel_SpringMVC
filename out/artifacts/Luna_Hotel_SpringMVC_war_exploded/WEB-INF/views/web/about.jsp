<%--
  Created by IntelliJ IDEA.
  User: ASUS-PRO
  Date: 11/14/2022
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/tablib.jsp"%>
<html>
<head>
    <title>About Us</title>
</head>
<body>
<div id="container">
    <!-- header -->
    <%@ include file="/common/web/header.jsp"%>
    <!-- header -->
    <!-- background -->
    <div id="home-background">
        <div class="background">
        </div>
        <div class="title">
            <h1>About us</h1>
        </div>
    </div>
    <!-- background -->
    <!-- into us -->
    <div class="into-layout">
        <div class="image-us">
            <img src="template/web/assets/img/home/ninh-van-bay-vietnam-rock_villa_bedroom25574.jpg" alt="">
        </div>
        <div class="content-us">
            <div class="title-content">
                <h1>We have the best hotel</h1>
            </div>
            <div class="description-content">
                <p>We bring you the most advanced and modern resort services. With us, you will have interesting and
                    attractive experiences with three resort locations across the country. We look forward to
                    accompanying you on your travels.</p>
            </div>
        </div>
    </div>
    <!-- into us -->
    <div class="into-layout into-layout-2">
        <div class="image-us image-us-2">
            <img src="template/web/assets/img/home/ninh-van-bay-vietnam-water-pool-villa-bathroom.jpg" alt="">
        </div>
        <div class="content-us content-us-2">
            <div class="title-content">
                <h1>We have the best service</h1>
            </div>
            <div class="description-content">
                <p>We bring you the most advanced and modern resort services. With us, you will have interesting and
                    attractive experiences with three resort locations across the country. We look forward to
                    accompanying you on your travels.</p>
            </div>
        </div>
    </div>

    <!-- Footer Section Begin -->
    <%@ include file="/common/web/footer.jsp"%>
    <!-- Footer Section End -->
</div>
</body>
</html>
