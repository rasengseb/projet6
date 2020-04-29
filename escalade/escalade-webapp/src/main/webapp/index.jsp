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
            <h1><a href="${pageContext.request.contextPath}/accueil">Les Amis de l'escalade </a></h1>
        </div>
        <div class="col-lg-6">
            <div class="row">
                <div class="col-lg-offset-2 col-lg-3">
                    <a href="">Rechercher</a>
                </div>
                <div class="col-lg-offset-2 col-lg-3">
                    <c:if test="${ user }">
                        <a href="${pageContext.request.contextPath}/profile"> Profile</a>
                    </c:if>
                    <c:if test="${ visiteur }">
                        <a href="${pageContext.request.contextPath}/authentification">Log in/ Sign up</a>
                    </c:if>
                </div>
            </div>
        </div>
    </div>
</div>

<%--Corps de la page web--%>
<div class="container">
    <div class="row">
        <div class="col-lg-offset-3 col-lg-6">
            <h2>Bienvenue !</h2>
            <p>Les Amis de l'Escalde est un site ayant pour but de référencer un maximum de site d'escalade pour qu'aussi bien les amateurs curieux que les aventuriers chevronnés
            puissent trouver un endroit ou profiter de leur passion.</p>
            <p>Le site est actuellement en création, donc incomplet.</p>
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