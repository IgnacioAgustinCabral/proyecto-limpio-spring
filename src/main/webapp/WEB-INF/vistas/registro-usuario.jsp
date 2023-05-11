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
        <form:form action="registrarme" method="POST" modelAttribute="datosRegistro">
            <h1 class="form-signin-heading text-center">Cre&aacute; tu cuenta</h1>
            <hr class="colorgraph"><br>

            <div>
                <h3 class="text-center">Datos de Ingreso</h3>
                <label for="usuario">Usuario</label>
                <form:input path="usuario" type="text" id="usuario" class="form-control"/>

                <label for="correo">Email</label>
                <form:input path="correo" type="email" id="correo" class="form-control"/>

                <label for="clave">Contrase&ntilde;a</label>
                <form:input path="clave" type="password" id="clave" class="form-control"/>
            </div>

            <div>
                <h3 class="text-center">Datos de tu cuenta</h3>

                <label for="nombre">Nombre</label>
                <form:input path="nombre" type="text" id="nombre" class="form-control"/>

                <label for="apellido">Apellido</label>
                <form:input path="apellido" type="text" id="apellido" class="form-control"/>

                <label for="telefono">Telefono de contacto</label>
                <form:input path="telefono" type="text" id="telefono" class="form-control"/>

                <label for="ubicacion">Ubicacion</label>
                <form:input path="ubicacion" type="text" id="ubicacion" class="form-control"/>
            </div>

            <button id="btn-registrarme" class="btn btn-lg btn-primary btn-block" Type="Submit"/>Registrarme</button>
        </form:form>

        <c:if test="${not empty error}">
            <h4><span>${error}</span></h4>
            <br>
        </c:if>
    </div>
</div>

<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>