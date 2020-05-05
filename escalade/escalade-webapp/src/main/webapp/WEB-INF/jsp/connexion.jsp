<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="../css/escalade.css">
    <title>Les Amis de l'escalade</title>
</head>

<body>

<div class="row">
    <div class="navbar navbar-default">
        <div class="col-lg-6">
            <h1><a href="${pageContext.request.contextPath}/accueil">Les Amis de l'escalade </a></h1>
        </div>
        <div class="col-lg-6">
            <div class="row">
                <div class="col-lg-offset-2 col-lg-3">
                    <a href="">Rechercher</a>
                </div>
                <div class="col-lg-offset-2 col-lg-3">
                    <c:choose>
                        <c:when test="${ connecte==true }">
                            <a href="${pageContext.request.contextPath}/profile"> Profile</a>
                        </c:when>
                        <c:when test="${ connecte==false }">
                            <a href="${pageContext.request.contextPath}/authentification">Log in/ Sign up</a>
                        </c:when>
                    </c:choose>
                </div>
            </div>
        </div>
    </div>
</div>

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
                            <div class="modal" id="info-inscription">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">x</button>
                                            <h4 class="modal-title">Inscription</h4>
                                        </div>
                                        <div class="modal-body">
                                            Inscription Réussi !
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
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
                            <button data-toggle="modal" href="#info-connexion" class="btn btn-primary" name="connection"
                                    id="connection">Connection
                            </button>
                            <div class="modal" id="info-connexion">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">x</button>
                                            <h4 class="modal-title">Connexion</h4>
                                        </div>
                                        <div class="modal-body">
                                            Connexion Réussi !
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>


<footer>
    <div class="row">
        <div class="col-lg-offset-2 col-lg-3">
            <div class="col-lg-offset-1 col-lg-2">
                <button class="btn btn-primary" type="submit">Facebook</button>
            </div>
            <div class="col-lg-offset-1 col-lg-2">
                <button class="btn btn-primary" type="submit">Twitter</button>
            </div>
            <div class="col-lg-offset-1 col-lg-2">
                <button class="btn btn-primary" type="submit">Instagram</button>
            </div>
        </div>
        <div class="col-lg-offset-2 col-lg-3">
            <a href="#">Nous Contacter</a>
        </div>
    </div>
</footer>

</body>
</html>