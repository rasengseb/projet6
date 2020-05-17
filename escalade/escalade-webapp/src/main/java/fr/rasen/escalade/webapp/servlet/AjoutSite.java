package fr.rasen.escalade.webapp.servlet;

import fr.rasen.escalade.model.bean.Adresse;
import fr.rasen.escalade.webapp.bean.Session;

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

        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        if(request.getParameter("ajouter") != null){
            System.out.println("AJOUT SITE");
            Adresse adresse = new Adresse();

            String nom = request.getParameter("nom");
            adresse.setNumero(Integer.parseInt(request.getParameter("numero")));
            adresse.setRue(request.getParameter("rue"));
            adresse.setCodePostal(Integer.parseInt(request.getParameter("codePostal")));
            adresse.setVille(request.getParameter("ville"));
        }

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/ajoutSite.jsp").forward(request, response);
    }
}
