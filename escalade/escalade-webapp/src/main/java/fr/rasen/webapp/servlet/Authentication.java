package fr.rasen.webapp.servlet;

import fr.rasen.webapp.rest.resource.projectResource.UtilisateurResource;
import fr.rasen.model.bean.bdd.Utilisateur;

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

        if (request.getParameter("inscrire") != null) {
            System.out.println("INSCRIPTION");
            UtilisateurResource utilisateurResource = new UtilisateurResource();
            Utilisateur utilisateur = new Utilisateur(
                    request.getParameter("inom"),
                    request.getParameter("iprenom"),
                    request.getParameter("ipseudo"),
                    request.getParameter("imdp"),
                    request.getParameter("imail"),
                    false
            );
            boolean checkInsert = utilisateurResource.addUtilisateur(utilisateur);
            System.out.println(utilisateur.toString());
        }

        if (request.getParameter("connection") != null) {
            System.out.println("CONNECTION");
            UtilisateurResource utilisateurResource = new UtilisateurResource();
            Utilisateur utilisateur = utilisateurResource.getConnexion(request.getParameter("cpseudo"), request.getParameter("cmdp"));
            System.out.println(utilisateur.toString());
        }


        this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
    }
}
