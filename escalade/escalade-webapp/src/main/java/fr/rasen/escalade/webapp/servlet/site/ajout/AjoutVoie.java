package fr.rasen.escalade.webapp.servlet.site.ajout;

import fr.rasen.escalade.webapp.bean.Session;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AjoutVoie")
public class AjoutVoie extends HttpServlet {

    @Inject
    private Session session;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //-- Permettre dans le contexte d'une servlet de se lier au contexte Spring.
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        if (session.getUtilisateur() != null) {
            request.setAttribute("email", session.getUtilisateur().getMail());
            request.setAttribute("connecte", session.getConnecte());
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Site/ajout/ajoutSite.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        request.setAttribute("email", session.getUtilisateur().getMail());
        request.setAttribute("connecte", session.getConnecte());

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Site/ajout/ajoutVoie.jsp").forward(request, response);
    }
}
