<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/accueil">Les Amis de l'Escalade</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="/rechercher">Rechercher</a></li>
            <c:choose>
                <c:when test="${ connecte }">
                    <li><a data-toggle="dropdown" href="#">Profile<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/profile">Info profile</a></li>
                            <li><a href="${pageContext.request.contextPath}/ajoutSite">Ajouter un site</a></li>
                        </ul>
                    </li>
                </c:when>
                <c:when test="${ !connecte }">
                    <li><a href="${pageContext.request.contextPath}/authentification">Log in/ Sign up</a></li>
                </c:when>
            </c:choose>
        </ul>
    </div>
</div>


