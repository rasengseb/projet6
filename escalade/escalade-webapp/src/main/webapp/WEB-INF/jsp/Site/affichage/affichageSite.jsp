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
    <div class="row">
        <div class="col-lg-offset-2 col-lg-8">
            <div class="panel panel-default">
                <div class="panel-header"><c:out value="${ site.getNom() }"></div>
            </div>
            <div class="panel-body">
                <div>
                    <label for="adresse"> Adresse :</label> <input type="text" name="adresse" id="adresse"
                                                                   value="${ site.getAdresse() }" readonly/>
                </div>
            </div>
        </div>
    </div>

    <form method="post" action="${pageContext.request.contextPath}/ajoutSecteur">
        <div class="row">
            <button class="btn btn-primary" id="envoyer" name="envoyer">Ajouter Secteur</button>
        </div>
    </form>
</div>

<%@ include file="../../_include/footer.jsp" %>

<%@ include file="../../_include/bootstrap-js.jsp" %>

</body>
</html>