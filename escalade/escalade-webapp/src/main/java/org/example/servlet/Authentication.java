package org.example.servlet;

import org.example.bean.Utilisateur;
import org.example.rest.resource.projectResource.UtilisateurResource;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Authentication")
public class Authentication extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        System.out.println("doGet");
        System.out.println(request.getParameter("cpseudo") + " - " + request.getParameter("cmdp"));

        this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        System.out.println("doPost");
        System.out.println(request.getParameter("cpseudo") + " - " + request.getParameter("cmdp"));

        UtilisateurResource utilisateurResource = new UtilisateurResource();
        Utilisateur utilisateur = utilisateurResource.getConnexion(request.getParameter("cpseudo"), request.getParameter("cmdp"));
        System.out.println("Connexion Réussi");
        System.out.println(utilisateur.toString());

        this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
    }
}
