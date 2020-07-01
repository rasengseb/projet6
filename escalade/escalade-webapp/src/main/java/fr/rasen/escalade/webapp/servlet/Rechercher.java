package fr.rasen.escalade.webapp.servlet;

import fr.rasen.escalade.webapp.bean.Session;
import fr.rasen.escalade.webapp.resource.projectResource.DepartementResource;
import fr.rasen.escalade.webapp.resource.projectResource.RegionResource;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Rechercher")
public class Rechercher extends HttpServlet {

    @Inject
    private Session session;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //-- Permettre dans le contexte d'une servlet de se lier au contexte Spring.
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegionResource regionResource = new RegionResource();
        session.setRegions(regionResource.getAllRegions());

        DepartementResource departementResource = new DepartementResource();
        session.setDepts(departementResource.getAllDepts());

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        request.setAttribute("profile", session.getUtilisateur());
        request.setAttribute("regions", session.getRegions());
        request.setAttribute("depts", session.getDepts());


        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/site.jsp").forward(request, response);
        ;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setAttribute("profile", session.getUtilisateur());
        request.setAttribute("profile", session.getUtilisateur());
        request.setAttribute("regions", session.getRegions());

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/site.jsp").forward(request, response);
        ;
    }
}
