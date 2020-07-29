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
                <div class="panel-header"><c:out value="${ voie.getNom() }"></div>
            </div>
            <div class="panel-body">
                <div>
                    <label for="cotation"> Cotation :</label> <input type="text" name="cotation" id="cotation"
                                                                     value="${ voie.getCotation() }" readonly/>
                </div>
                <div>
                    <label for="longueur"> Longueur :</label> <input type="text" name="longueur" id="longueur"
                                                                     value="${ voie.getLongueur() }" readonly/>
                </div>
                <div>
                    <label for="description"> Description :</label> <input type="text" name="description" id="description"
                                                                     value="${ voie.getAdresse() }" readonly/>
                </div>
            </div>
        </div>
    </div>

</div>

<%@ include file="../../_include/footer.jsp" %>

<%@ include file="../../_include/bootstrap-js.jsp" %>

</body>
</html>