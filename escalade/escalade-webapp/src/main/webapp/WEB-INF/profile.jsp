<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <title>Les Amis de l'escalade</title>
</head>

<body>

<div class="row">
    <div class="navbar navbar-default">
        <div class="col-lg-6">
            <h1 href="#">Les Amis de l'escalade</h1>
        </div>
        <div class="col-lg-6">
            <div class="row">
                <div class="col-lg-offset-2 col-lg-3">
                    <a href="">Rechercher</a>
                </div>
                <div class="col-lg-offset-2 col-lg-3">
                    <a href="${pageContext.request.contextPath}/authentification">Log in/ Sign up</a>
                </div>
            </div>
        </div>
    </div>
</div>

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