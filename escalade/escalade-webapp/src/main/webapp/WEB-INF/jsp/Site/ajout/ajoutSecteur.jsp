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
                <form method="get" action="#">
                    <div class="panel-header">Ajout d'un secteur
                        <div class="col-lg-offset-10 col-lg-2">
                            <a href="#">Ajouter une voie</a>
                        </div>
                    </div>
                </form>
                <form method="post" action="${pageContext.request.contextPath}/ajoutSecteur">
                    <div class="panel-body">
                        <div>
                            <label for="nom"> Nom : </label> <input type="text" name="nom" id="nom"/>
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

<%@ include file="../../_include/footer.jsp" %>

<%@ include file="../../_include/bootstrap-js.jsp" %>

</body>
</html>