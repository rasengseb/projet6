package com.rasen.escalade.servlet;


import org.example.profile.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    public Servlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
        if (request.getParameter("inscrire") != null) {
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setPseudo(request.getParameter("ipseudo"));
            utilisateur.setMdp(request.getParameter("imdp"));
            utilisateur.setNom(request.getParameter("inom"));
            utilisateur.setPrenom(request.getParameter("iprenom"));
            utilisateur.setMail(request.getParameter("imail"));
        }

    }
}
