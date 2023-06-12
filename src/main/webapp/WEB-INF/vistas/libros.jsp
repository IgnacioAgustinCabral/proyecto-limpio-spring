<%--
  Created by IntelliJ IDEA.
  User: pcfab
  Date: 11/6/2023
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>
<jsp:include page="Menu.jsp"/>
<!-- Contenido principal -->
<div class="col-sm-12 col-md-12">
<form:form action="alta" method="GET" >
    <div style="display: flex; justify-content: flex-end; ">
      <button class="btn-primary " type="submit">+ADD LIBRO</button>
    </div>
</form:form>
</div>

<jsp:include page="footer.jsp"/>
