package org.example.servlet;

import org.example.bean.Utilisateur;
import org.example.rest.resource.projectResource.UtilisateurResource;

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

<<<<<<< HEAD
        if (request.getParameter("inscrire") != null) {
            System.out.println("INSCRIPTION");
            UtilisateurResource utilisateurResource = new UtilisateurResource();
            Utilisateur utilisateur = utilisateurResource.addUtilisateur(request.getParameter("ipseudo"), request.getParameter("imdp"), request.getParameter("inom"), request.getParameter("ipernom"), request.getParameter("imail"), false);
            System.out.println(utilisateur.toString());
        }

        if (request.getParameter("connection") != null) {
            System.out.println("CONNECTION");
            UtilisateurResource utilisateurResource = new UtilisateurResource();
            Utilisateur utilisateur = utilisateurResource.getConnexion(request.getParameter("cpseudo"), request.getParameter("cString"));
            System.out.println(utilisateur.toString());
        }

=======
        UtilisateurResource utilisateurResource = new UtilisateurResource();
        Utilisateur utilisateur = utilisateurResource.getConnexion(request.getParameter("cpseudo"), request.getParameter("cmdp"));
        System.out.println("Connexion Réussi");
        System.out.println(utilisateur.toString());
>>>>>>> ab46c1ced7279d302607e3d18b3d3099526c21fc

        this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
    }
}
