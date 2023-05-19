<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
<div class = "container">
    <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <form:form action="/mi-coleccion/agregar" method="POST" modelAttribute="datosLibro">
            <h3 class="form-signin-heading text-center">Agregue un libro</h3>
            <hr class="colorgraph"><br>

            <label for="nombre">Ingrese nombre del libro:</label>
            <form:input path="nombre" type="text" id="nombre" class="form-control" />
            <label for="autor">Ingrese nombre del autor:</label>
            <form:input path="autor" type="text" id="autor" class="form-control"/>
            <label for="ISBN">Ingrese ISBN:</label>
            <form:input path="ISBN" type="text" id="ISBN" class="form-control"/>
            <label for="idioma">Ingrese idioma del libro:</label>
            <form:input path="idioma" type="text" id="idioma" class="form-control"/>
            <label for="editorial">Ingrese editorial del libro:</label>
            <form:input path="editorial" type="text" id="editorial" class="form-control"/>
            <label for="estado">Ingrese el estado en que se encuentra:</label>
            <form:select path="estado" name="estado" id="estado">
                <form:option value="">Seleccione</form:option>
                <form:option value="1">Nuevo</form:option>
                <form:option value="2">Usado</form:option>
            </form:select>


            <button class="btn btn-lg btn-primary btn-block" Type="Submit"/>Agregar Libro</button>
        </form:form>
        <%--Bloque que es visible si el elemento error no esta vacio	--%>
        <c:if test="${not empty error}">
            <h4><span>${error}</span></h4>
            <br>
        </c:if>
        ${msg}
    </div>
</div>

<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
