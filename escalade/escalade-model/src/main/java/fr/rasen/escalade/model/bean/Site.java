package fr.rasen.escalade.model.bean;

import java.util.List;

public class Site {
    private int id;
    private String nom;
    private Adresse adresse;
    private List<Secteur> secteurs;
    private List<Image> images;
    private List<Commentaire> commentaires;
    private boolean isOfficiel;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public boolean isOfficiel() {
        return isOfficiel;
    }

    public void setOfficiel(boolean officiel) {
        isOfficiel = officiel;
    }
}
