<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/_include/head.jsp" %>

</head>

<body>


<%@ include file="/WEB-INF/jsp/_include/header.jsp" %>


<form method="post" action="rechercher.jsp">
    <div class="panel panel-default">
        <div class="panel-heading">Rechercher un site</div>
        <div class="panel-body">

            <select class="regions">Régions
                <c:forEach items="${ regions }" var="region" varStatus="status">
                    <option value="<c:out value="${ status.count }"/>"> <c:out value="${ region.getNom() }"/></option>
                </c:forEach>
            </select>

            <select class="depts">Départements
                <c:forEach items="${ depts }" var="dept" varStatus="stauts">
                    <option value="<c:out value="${ stauts.count }"/> "><c:out value="${ dept.getNom() }"/></option>
                </c:forEach>
            </select>

            <label for="site">Entrez le nom du site d'escalade</label> <input type="text" name="site" id="site">
        </div>
    </div>
</form>
<%@include file="/WEB-INF/jsp/_include/footer.jsp" %>

<%@include file="/WEB-INF/jsp/_include/bootstrap-js.jsp" %>


</body>
</html>