<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="../js/escalade.js"></script>

<div class="row">
    <nav class="navbar navbar-default">
        <ul class="nav navbar-nav">
            <li class="col-lg-4">
                <h1><a href="${pageContext.request.contextPath}/accueil">Les Amis de l'escalade </a></h1>
            </li>
            <li class="col-lg-4"><a href="">Rechercher</a></li>
            <c:choose>
                <c:when test="${ connecte }">
                    <li class="dropdown col-lg-4">
                        <a data-toggle="dropdown>" href="">Profile<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/profile">Info profile</a></li>
                            <li><a href="${pageContext.request.contextPath}/ajoutSite">Ajouter un site</a></li>
                        </ul>
                    </li>
                </c:when>
                <c:when test="${ !connecte }">
                    <li class="col-lg-4"><a href="${pageContext.request.contextPath}/authentification">Log in/ Sign up</a></li>
                </c:when>
            </c:choose>
        </ul>
    </nav>
</div>