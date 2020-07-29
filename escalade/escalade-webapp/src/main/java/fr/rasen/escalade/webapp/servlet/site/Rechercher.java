package fr.rasen.escalade.webapp.servlet.site;

import fr.rasen.escalade.model.bean.Departement;
import fr.rasen.escalade.model.bean.Region;
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
import java.util.List;

@WebServlet("/Rechercher")
public class Rechercher extends HttpServlet {

    @Inject
    private Session session;
    private List<Departement> departements;
    private List<Region> regions;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //-- Permettre dans le contexte d'une servlet de se lier au contexte Spring.
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegionResource regionResource = new RegionResource();
        regions = regionResource.getAllRegions();

        DepartementResource departementResource = new DepartementResource();
        departements = departementResource.getAllDepts();

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        request.setAttribute("profile", session.getUtilisateur());
        request.setAttribute("regions", regions);
        request.setAttribute("depts", departements);


        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Site/rechercher.jsp").forward(request, response);
        ;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setAttribute("profile", session.getUtilisateur());
        request.setAttribute("depts", departements);
        request.setAttribute("regions", regions);

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Site/rechercher.jsp").forward(request, response);
        ;
    }
}
