package fr.rasen.escalade.webapp.servlet;

import fr.rasen.escalade.webapp.bean.Session;
import fr.rasen.escalade.webapp.resource.projectResource.UtilisateurResource;
import fr.rasen.escalade.model.bean.Utilisateur;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Authentication")
public class Authentication extends HttpServlet {

    @Inject
    Session session;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //-- Permettre dans le contexte d'une servlet de se lier au contexte Spring.
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

       System.out.println(session.toString());

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
