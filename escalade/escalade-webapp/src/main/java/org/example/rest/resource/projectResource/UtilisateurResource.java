package org.example.rest.resource.projectResource;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;
import org.example.rest.resource.AbstractResource;

import javax.rmi.CORBA.Util;
import java.util.List;

@Path("/utilisateurs")
public class UtilisateurResource extends AbstractResource {

    @GET
    @Path("{id}")
    public Utilisateur getUtilisateur(@PathParam("id") Integer pId) throws NotFoundException{
        Utilisateur utilisateur = getManagerFactory().getUtilisateurManager().getUtilisateur(pId);
        return utilisateur;
    }

    @GET
    public List<Utilisateur> getListUtilisateur(){
        List<Utilisateur> list = getManagerFactory().getUtilisateurManager().getListUtilisateur();
        return list;
    }
}
