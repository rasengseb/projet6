package fr.rasen.webapp.servlet;

import fr.rasen.webapp.bean.Session;
import fr.rasen.webapp.rest.resource.projectResource.UtilisateurResource;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Profile")
public class Profile extends HttpServlet {

    @Inject
    Session session;

    UtilisateurResource utilisateurResource = new UtilisateurResource();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

       // System.out.println(session.toString());

        request.setAttribute("profile", utilisateurResource.getProfile());
        this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);;
    }
}
