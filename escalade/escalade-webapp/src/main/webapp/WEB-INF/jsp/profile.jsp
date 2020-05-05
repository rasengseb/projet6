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
        <div class="col-lg-offset-2 col-lg-8">
            <form method="post" action="${pageContext.request.contextPath}/profile">
                <div class="panel panel-default">
                    <div class="panel-header">Profile</div>
                    <div class="panel-body">
                        <div>
                            <label for="pseudo"> Pseudo : </label> <input type="text" name="pseudo" id="pseudo"
                                                                          value="${ profile.getPseudo() }"
                                                                          readonly/>
                        </div>
                        <div>
                            <label for="mdp"> Mot de passe :</label> <input type="password" name="mdp" id="mdp"
                                                                            value="${ profile.getMdp() }"
                                                                            readonly/>
                        </div>
                        <div>
                            <label for="nom"> Nom : </label> <input type="text" name="nom" id="nom"
                                                                    value="${ profile.getNom() }"
                                                                    readonly/>
                        </div>
                        <div>
                            <label for="prenom"> Prénom : </label> <input type="text" name="prenom" id="prenom"
                                                                          value="${ profile.getPrenom() }"
                                                                          readonly/>
                        </div>
                        <div>
                            <label for="mail"> Mail : </label> <input type="text" name="mail" id="mail"
                                                                      value="${ profile.getMail() }"
                                                                      readonly/>
                        </div>
                        <div>
                            <input type="submit" name="modifier" id="modifier" value="Modifier">
                        </div>
                    </div>
                </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>

<%@ include file="_include/footer.jsp" %>

<%@ include file="_include/bootstrap-js.jsp" %>

</body>
</html>