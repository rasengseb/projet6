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

<%@ include file="_include/footer.jsp" %>

<%@ include file="_include/bootstrap-js.jsp" %>


</body>
</html>