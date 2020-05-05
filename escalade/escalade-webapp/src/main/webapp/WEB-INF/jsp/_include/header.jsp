<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="row">
    <div class="navbar navbar-default">
        <div class="col-lg-4">
            <h1><a href="${pageContext.request.contextPath}/accueil">Les Amis de l'escalade </a></h1>
        </div>
        <div class="col-lg-8">
            <div class="row">
                <div class="col-lg-4">
                    <a href="">Rechercher</a>
                </div>
                <div class="col-lg-4">
                    <c:choose>
                        <c:when test="${ connecte }">
                            <span><a href="${pageContext.request.contextPath}/profile">Profile</a> - Bienvenue <a href="mailto:<c:out value="${email}" />"><c:out value="${email}" /></a></span>
                        </c:when>
                        <c:when test="${ !connecte }">
                            <a href="${pageContext.request.contextPath}/authentification">Log in/ Sign up</a>
                        </c:when>
                    </c:choose>
                </div>
            </div>
        </div>
    </div>
</div>