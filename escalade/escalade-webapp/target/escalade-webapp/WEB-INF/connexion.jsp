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
        <div class="navbar-header col-lg-6">
            <h1 class="navbar-brand" href="#">Les Amis de l'escalade</h1>
        </div>
        <ul class="nav navbar-nav col-lg-6">
            <li>
                <a href="../index.jsp">Rechercher</a>
            </li>
            <li>
                <a href="connexion.jsp">Log in/ Sign up</a>
            </li>
        </ul>
    </div>
</div>

<%--Corps de la page web--%>
<div class="row">
    <div class="col-lg-6">
        <form method="post" action="${pageContext.request.contextPath}/authentification">
            <fieldset>
                <legend>S'inscrire</legend>
                <label for="ipseudo">Pseudo : </label> <input type="text" name="ipseudo" id="ipseudo">
                <label for="imdp">Mot de passe : </label> <input type="password" name="imdp" id="imdp">
                <label for="inom">Nom : </label> <input type="text" name="inom" id="inom">
                <label for="iprenom">Prénom : </label> <input type="text" name="iprenom" id="iprenom">
                <label for="imail">Mail : </label> <input type="email" name="imail" id="imail">
                <input type="submit" value="S'inscrire" name="inscrire" id="inscrire">
            </fieldset>
        </form>
    </div>
    <div class="col-lg-6">
        <form method="post" action="${pageContext.request.contextPath}/authentification">
            <fieldset>
                <legend>Se Connecter</legend>
                <label for="cpseudo">Pseudo : </label> <input type="text" name="cpseudo" id="cpseudo"/>
                <label for="cmdp"> Mot de Passe : </label> <input type="password" name="cmdp" id="cmdp"/>
                <input type="submit" value="Connection" name="connection" id="connection">
            </fieldset>
        </form>
    </div>
</div>

<footer>
    <div class="row">
        <div class="btn-toolbar col-lg-offset-3 col-lg-6">
            <div class="btn-group">
                <button class="btn btn-primary btn-sm">Instagram</button>
                <button class="btn btn-primary btn-sm">Facebook</button>
                <button class="btn btn-primary btn-sm">Twitter</button>
                <button class="btn btn-primary btn-sm">Google +</button>
                <button class="btn btn-primary btn-sm">Nous Contacter</button>
            </div>
        </div>

    </div>
</footer>

</body>
</html>