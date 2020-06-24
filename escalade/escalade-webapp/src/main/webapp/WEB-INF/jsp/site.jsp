<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/_include/head.jsp" %>

</head>

<body>


<%@ include file="/WEB-INF/jsp/_include/header.jsp" %>


<form method="post" action="site.jsp">
    <div class="panel panel-default">
        <div class="panel-heading">Rechercher un site</div>
        <div class="panel-body">
            <label for="region">Sélectionnez une région</label> <input type="text" id="region" name="region">
            <label for="dep">Sélectionnez un département</label> <input type="text" id="dep" name="dep">
            <label for="site">Entrez le nom du site d'escalade</label> <input type="text" name="site" id="site">
        </div>
    </div>
</form>
<%@include file="/WEB-INF/jsp/_include/footer.jsp" %>

<%@include file="/WEB-INF/jsp/_include/bootstrap-js.jsp" %>


</body>
</html>