<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/_include/head.jsp" %>
    <style type="text/css">
        <%@include file="../css/escalade.css" %>
    </style>
</head>

<body>

<%@ include file="/WEB-INF/jsp/_include/header.jsp" %>

<%--Corps de la page --%>
<div class="container">
    <div class="row">
        <div class="col-lg-offset-2 col-lg-8">
            <div class="panel panel-default">
                <form method="get" action="#">
                    <div class="panel-header">Ajout d'un site d'escalade
                        <div class="col-lg-offset-10 col-lg-2">
                            <a href="#">Ajouter un Secteur</a>
                        </div>
                    </div>
                </form>
                <form method="post" action="${pageContext.request.contextPath}/ajoutSite">
                    <div class="panel-body">
                        <div>
                            <label for="nom"> Nom du Site : </label> <input type="text" name="nom" id="nom"/>
                        </div>
                        <div>
                            <label for="numero"> Numéro :</label> <input type="text" name="numero" id="numero"/>
                        </div>
                        <div>
                            <label for="rue"> Rue : </label> <input type="text" name="rue" id="rue"/>
                        </div>
                        <div>
                            <label for="codePostal"> Code Postal : </label> <input type="text" name="codePostal" id="codePostal"/>
                        </div>
                        <div>
                            <label for="ville"> Ville : </label> <input type="text" name="ville" id="ville"/>
                        </div>
                        <div>
                            <input type="submit" name="ajouter" id="ajouter" value="Ajouter">
                        </div>
                    </div>
                </form>
            </div>

        </div>
    </div>
</div>

<%@ include file="/WEB-INF/jsp/_include/footer.jsp" %>

<%@ include file="/WEB-INF/jsp/_include/bootstrap-js.jsp" %>

</body>
</html>
