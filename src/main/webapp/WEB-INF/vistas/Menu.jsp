<%--
  Created by IntelliJ IDEA.
  User: pcfab
  Date: 11/6/2023
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-bar-block w3-black w3-collapse w3-top" style="z-index:3;width:250px" id="mySidebar">
    <div class="w3-container w3-display-container w3-padding-16">
        <i onclick="w3_close()" class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i>
        <div style="text-align: center;">
            <img  class="col-sm-12 col-md-12" src="imgs/LogoWebPage.png" alt="Swapmeet Things">
        </div>
    </div>
    <div class="w3-padding-64 w3-large w3-text-grey" style="font-weight:bold">
        <a href="listarLibros" class="w3-bar-item w3-button">Mi Coleccion</a>
        <a href="#" class="w3-bar-item w3-button">Intercambios</a>
        <a href="#" class="w3-bar-item w3-button">Reportes</a>
        <a href="#" class="w3-bar-item w3-button">Intercambios</a>
        <a href="#" class="w3-bar-item w3-button">Resultados</a>
        <a href="#" class="w3-bar-item w3-button">Notificaciones</a>
        <a href="#" class="w3-bar-item w3-button">Settings</a>

    </div>
    <a href="#footer" class="w3-bar-item w3-button w3-padding">Contact</a>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding" onclick="document.getElementById('newsletter').style.display='block'">Newsletter</a>
    <a href="#footer"  class="w3-bar-item w3-button w3-padding">Subscribe</a>
</nav>

<!-- Top menu on small screens -->
<header class="w3-bar w3-top w3-hide-large w3-black w3-xlarge">
    <div class="w3-bar-item w3-padding-24 w3-wide" ><img style="width: 50px; height:50px;" src="imgs/LogoWebPage.png" alt="Swapmeet Things"></div>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding-24 w3-right" onclick="w3_open()"><i class="fa fa-bars"></i></a>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:250px">

    <!-- Push down content on small screens -->
    <div class="w3-hide-large" style="margin-top:83px"></div>

    <!-- Top header -->
    <header class="w3-black w3-container w3-xlarge">
        <p class="w3-left w3-text-white">User</p>
        <p class="w3-right w3-text-white">
            <i class="fa fa-shopping-cart w3-margin-right"></i>
            <i class="fa fa-search"></i>
        </p>
    </header>
</div>