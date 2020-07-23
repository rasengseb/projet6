<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../../_include/head.jsp" %>
</head>

<body>

<%@ include file="../../_include/header.jsp" %>

<%--Corps de la page web--%>
<div class="container">
    <form metohd="post" action="${pageContext.request.contextPath}/ajoutVoie">
        <div class="row">
            <button class="btn btn-primary" id="envoyer" name="envoyer">Ajouter voie</button>
        </div>
    </form>

</div>

<%@ include file="../../_include/footer.jsp" %>

<%@ include file="../../_include/bootstrap-js.jsp" %>

</body>
</html>