<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="_include/head.jsp" %>
    <style type="text/css">
        <%@include file="../css/escalade.css" %>
    </style>
</head>

<body>

<%@ include file="_include/header.jsp" %>

<%--Corps de la page web--%>
<div class="container">
    <div class="row">
        <div class="col-lg-6">
            <form method="post" action="${pageContext.request.contextPath}/authentification">
                <div class="panel panel-default">
                    <div class="panel-heading">S'inscrire</div>
                    <div class="panel-body">
                        <div>
                            <label for="ipseudo">Pseudo : </label> <input type="text" name="ipseudo" id="ipseudo">
                        </div>
                        <div>
                            <label for="imdp">Mot de passe : </label> <input type="password" name="imdp" id="imdp">
                        </div>
                        <div>
                            <label for="inom">Nom : </label> <input type="text" name="inom" id="inom">
                        </div>
                        <div>
                            <label for="iprenom">Prénom : </label> <input type="text" name="iprenom" id="iprenom">
                        </div>
                        <div>
                            <label for="imail">Mail : </label> <input type="email" name="imail" id="imail">
                        </div>
                        <div>
                            <button data-toggle="modal" href="#info-inscription" class="btn btn-primary" name="inscrire"
                                    id="inscrire">S'inscrire
                            </button>
                        </div>
                    </div>
                </div>
                <div>
                    <c:if test="${ checkInsert }">
                        <div class="alert alert-success" role="alert"><c:out value="${ messageInscription }" /></div>
                    </c:if>
                    <c:if test="${ !checkInsert && !empty messageInscription }">
                        <div class="alert alert-danger" role="alert"><c:out value="${ messageInscription }" /></div>
                    </c:if>
                </div>
            </form>
        </div>
        <div class="col-lg-6">
            <form method="post" action="${pageContext.request.contextPath}/authentification">
                <div class="panel panel-default">
                    <div class="panel-heading">Se Connecter</div>
                    <div class="panel-body">
                        <div>
                            <label for="cpseudo">Pseudo : </label> <input type="text" name="cpseudo" id="cpseudo"/>
                        </div>
                        <div>
                            <label for="cmdp"> Mot de Passe : </label> <input type="password" name="cmdp" id="cmdp"/>
                        </div>
                        <div>
                            <button data-toggle="modal" class="btn btn-primary" name="connection"
                                    id="connection">Connection
                            </button>
                        </div>
                    </div>
                </div>
                <div>
                    <c:if test="${ !empty messageConnexion }">
                        <div class="alert alert-danger" role="alert"><c:out value="${messageConnexion}" /></div>
                    </c:if>
                </div>
            </form>
        </div>
    </div>
</div>

<%@ include file="_include/footer.jsp" %>

<%@ include file="_include/bootstrap-js.jsp" %>

</body>
</html>