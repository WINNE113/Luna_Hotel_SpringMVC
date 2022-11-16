<%--
  Created by IntelliJ IDEA.
  User: ASUS-PRO
  Date: 11/14/2022
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/common/tablib.jsp"%>
<html>
<head>
    <title>Blog</title>
</head>
<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="100">
<!-- header -->
    <%@ include file="/common/web/header.jsp"%>
<!-- header -->

<div class="blog">
  <div class="news">
    <a class="newslink" href="https://www.ivivu.com/blog/2013/09/du-lich-da-nang-cam-nang-tu-a-den-z/">
      <img src="template/web/assets/img/link/12.jpg" alt="image "/>
      <div class="newsgenre">Tip</div>
      <div class="newscontent">Visiting Da Nang & Quang Nam</div>
    </a>
  </div>

  <div class="news">
    <a href="https://vinpearl.com/vi/top-15-cho-da-nang-noi-tieng-hap-dan-nhat-dinh-phai-ghe-tham">
      <img src="template/web/assets/img/link/2.jpg" alt="image "/> />
      <div class="newsgenre">Tip</div>
      <div class="newscontent">Favorite Markets in Da Nang</div>
    </a>
  </div>

  <div class="news">
    <a class="newslink"
       href="https://vinpearl.com/vi/moi-nhat-2022-kinh-nghiem-du-lich-da-nang-choi-gi-an-gi-o-dau">
      <img src="template/web/assets/img/link/3.jpg" alt="image "/> />
      <div class="newsgenre">Tip</div>
      <div class="newscontent">Experience to Danang</div>
    </a>
  </div>

  <div class="news">
    <a href="https://globetrottergirls.com/tips-for-packing-a-stylish-travel-wardrobe/">
      <img src="template/web/assets/img/link/4.jpg" alt="image "/> />
      <div class="newsgenre">Tip</div>
      <div class="newscontent">8 Tips for Packing a Stylish Travel Wardrobe</div>
    </a>
  </div>

  <div class="news">
    <a class="newslink" href="https://www.adventureinyou.com/vietnam/vietnam-by-motorbike-route/">
      <img src="template/web/assets/img/link/5.jpg" alt="image "/> />
      <div class="newsgenre">Tip</div>
      <div class="newscontent">Travelling by motobike is the BEST</div>
    </a>
  </div>

  <div class="news">
    <a href="https://localvietnam.com/blog/lakes-in-vietnam/">
      <img src="template/web/assets/img/link/6.jpg" alt="image "/> />
      iv class="newsgenre">Tip</iv>
      <div class="newscontent">10 most beautiful lakes in Vietnam</div>
    </a>
  </div>
</div>

<div class="loadmore">
  <ul class="pagination">
    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</div>
<%--Footer--%>
<%@ include file="/common/web/footer.jsp"%>
<%--/Footer--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
</script>
</body>
</html>
