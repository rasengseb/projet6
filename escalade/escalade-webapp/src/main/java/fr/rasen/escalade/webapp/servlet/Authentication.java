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

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //-- INSCRIPTION
        if (request.getParameter("inscrire") != null) {
            System.out.println("INSCRIPTION");

            String nom = request.getParameter("inom");
            String prenom = request.getParameter("iprenom");
            String pseudo = request.getParameter("ipseudo");
            String mdp = request.getParameter("imdp");
            String mail = request.getParameter("imail");

            //-- On lance l'inscription seulement si les données sont bien remplies
            boolean checkInsert = false;
            if (!nom.isEmpty() && !prenom.isEmpty() && !pseudo.isEmpty() && !mdp.isEmpty() && !mail.isEmpty()) {
                UtilisateurResource utilisateurResource = new UtilisateurResource();
                Utilisateur utilisateur = new Utilisateur(nom, prenom, pseudo, mdp, mail, false);
                checkInsert = utilisateurResource.addUtilisateur(utilisateur);
                System.out.println("checkInsert = " + checkInsert);
            }

            request.setAttribute("checkInsert", checkInsert); // Dans tous les cas, on passe le checkInsert à la JSP
            if (checkInsert) {
                request.setAttribute("messageInscription", "Inscription réussie !!!");
            } else {
                request.setAttribute("messageInscription", "Inscription refusée !!!");
            }

            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);
        }

        //-- CONNEXION
        if (request.getParameter("connection") != null) {
            System.out.println("CONNECTION");
            UtilisateurResource utilisateurResource = new UtilisateurResource();
            Utilisateur utilisateur = utilisateurResource.getConnexion(request.getParameter("cpseudo"), request.getParameter("cmdp"));

            System.out.println(utilisateur);

            // Si un utilisateur a été trouvé alors on se connecte et on retourne l'utilisateur et "connecte" à true
            if (utilisateur.getId() != 0) {
                session.setConnecte(true);
                session.setUtilisateur(utilisateur);
                request.setAttribute("email", session.getUtilisateur().getMail());
                request.setAttribute("connecte", session.getConnecte());
                this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/site.jsp").forward(request, response);
            } else {
                request.setAttribute("messageConnexion", "Connexion refusée !!!");
                this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);
            }
        }
    }
}
