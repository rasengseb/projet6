package fr.rasen.webapp.servlet;

import fr.rasen.webapp.rest.resource.projectResource.UtilisateurResource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/profile")
public class Profile extends HttpServlet {
    UtilisateurResource utilisateurResource = new UtilisateurResource();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        request.setAttribute("profile", utilisateurResource.getProfile());
        this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp");
    }
}
