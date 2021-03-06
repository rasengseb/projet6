package fr.rasen.escalade.webapp.servlet;

import fr.rasen.escalade.webapp.bean.Session;
import fr.rasen.escalade.webapp.resource.projectResource.ContactResource;
import fr.rasen.escalade.webapp.resource.projectResource.UtilisateurResource;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Contact")
public class Contact extends HttpServlet {

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

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/contact.jsp").forward(request, response);
        ;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        if(request.getParameter("envoyer") != null){
            System.out.println("ENVOIE DEMANDE");

            String mail = request.getParameter("mail");
            String objet = request.getParameter("objet");
            String message = request.getParameter("message");

            ContactResource contactResource = new ContactResource();
            contactResource.addContact(mail, objet, message);
        }

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/contact.jsp").forward(request, response);
        ;
    }
}
