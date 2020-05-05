<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="WEB-INF/css/escalade.css">
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
                        <c:when test="${ connecte == 'true' }">
                            <p><a href="${pageContext.request.contextPath}/profile"> Profile</a></p>
                        </c:when>
                        <c:when test="${ connecte == 'false' }">
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
        <div class="col-offset-lg-3 col-lg-6">
            <form method="post">
                <div class="panel panel-default">
                    <div class="panel-heading">Nous Contacter</div>
                    <div class="panel-body">
                        <div>
                            <label for="mail">Votre Adresse Mail :</label> <input type="email" name="mail" id="mail">
                        </div>
                        <div>
                            <label for="objet">Objet :</label> <input type="text" name="objet" id="objet">
                        </div>
                        <div>
                            <label for="message">Message :</label> <textarea name="message" id="message"> </textarea>
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