<%--
  Created by IntelliJ IDEA.
  User: ASUS-PRO
  Date: 11/14/2022
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/common/tablib.jsp"%>
<html>
<head>
    <title>Contact</title>
</head>
<body>
<div id="container">
  <!-- header -->
  <%@ include file="/common/web/header.jsp"%>
<%--  /header--%>

  <div id="home-background">
    <!-- home -->
    <div class="background">
      <!-- home background-->
    </div>
    <div class="title">
      <!-- home title-->
      <h1 style="color: #fff">Contact</h1>
    </div>
  </div>
  <div class="contact">
    <div class="contact_layout">
      <div class="form_container">
        <div class="title_form">
          <span>contact to me</span>
        </div>
        <div class="form_layout">
          <input type="text" class="contact_name" placeholder="Name">
          <input type="text" class="contact_email" placeholder="E-Mail">
          <input type="text" class="contact_subject" placeholder="Subject">
          <input type="text" class="contact_message" placeholder="Message">
        </div>
        <div class="btn_send_contact">
          <a href="#">Send Message</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Footer -->
  <%@ include file="/common/web/footer.jsp"%>
  <!-- Footer Section Begin -->
</div>
</body>
</html>
