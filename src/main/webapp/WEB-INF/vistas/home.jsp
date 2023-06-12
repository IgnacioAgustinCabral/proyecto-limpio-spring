<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>
	<jsp:include page="Menu.jsp"/>
	<!-- Contenido principal -->
	<div class="col-sm-12 col-md-12 marginpage">
		<!-- Aquí va el contenido principal de tu página -->
		<div class="card">
			<c:forEach items="${libros}" var="libro">
				<tr class="list-group">
					<td class="list-group-item">${libro.ISBN}</td>
					<td class="list-group-item">${libro.autor}</td>
					<td class="list-group-item">${libro.editorial}</td>
					<td class="list-group-item">${libro.idioma}</td>
					<td class="list-group-item">${libro.nombre}</td>
				</tr>
			</c:forEach>
		</div>

	</div>
<jsp:include page="footer.jsp"/>