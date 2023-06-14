<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>
	<jsp:include page="Menu.jsp"/>
	<!-- Contenido principal -->
<!--cuerpo de la pagina-->
<div class="w3-row" style="margin-left:250px" >
        <c:forEach items="${libros}" var="libro">
			<div class="w3-col l3 s6 w3-margin-left">
			<div class="w3-container w3-card ">
			<img src="imgs/LogoWebPage.png" style="width:100%">
			<p>${libro.ISBN}<br></p>
			<p>${libro.autor}<br></p>
			<p>${libro.editorial}<br></p>
			<p>${libro.idioma}<br></p>
			<p>${libro.nombre}<br></p>
			</div>
			</div>
		</c:forEach>
<jsp:include page="footer.jsp"/>