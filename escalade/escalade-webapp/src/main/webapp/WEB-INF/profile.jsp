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
                <fieldset>
                    <legend>Profile</legend>
                    <label> Pseudo : </label> <input type="text" name="pseudo" placeholder="<c:out value="${ profile.getPseudo() }"/>">
                    <label> Mot de passe :</label> <input type="password" name="mdp" placeholder="<c:out value="${ profile.getMdp() }"/>">
                    <label> Nom : </label> <input type="text" name="nom" placeholder="<c:out value="${ profile.getNom() }"/>">
                    <label> Prénom : </label> <input type="text" name="prenom" placeholder="<c:out value="${ profile.getPrenom() }"/>">
                    <label> Mail : </label> <input type="text" name="mail" placeholder="<c:out value="${ profile.getMail() }"/>">
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