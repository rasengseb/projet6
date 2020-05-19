package fr.rasen.escalade.webapp.servlet;

import fr.rasen.escalade.model.bean.Adresse;
import fr.rasen.escalade.webapp.bean.Session;
import fr.rasen.escalade.webapp.resource.projectResource.AdresseResource;
import fr.rasen.escalade.webapp.resource.projectResource.SiteRessource;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AjoutSite")
public class AjoutSite  extends HttpServlet {

    @Inject
    private Session session;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/ajoutSite.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        if(request.getParameter("ajouter") != null){
            System.out.println("AJOUT SITE");


            String nom = request.getParameter("nom");
            int numero = Integer.parseInt(request.getParameter("numero"));
            String rue = request.getParameter("rue");
            int codePostal = Integer.parseInt(request.getParameter("codePostal"));
            String ville = request.getParameter("ville");

            Adresse adresse = new Adresse(numero, rue, codePostal, ville);
            AdresseResource adresseResource = new AdresseResource();

            boolean checkInsert = adresseResource.addAdresse(adresse);
            adresse.setId(adresseResource.getIdAdresse(adresse));
            System.out.println("Ajout adresse Réussi");


            SiteRessource siteRessource = new SiteRessource();
            siteRessource.addSite(nom, adresse);
            System.out.println("Ajout Site Réussi");

        }

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/ajoutSite.jsp").forward(request, response);
    }
}
