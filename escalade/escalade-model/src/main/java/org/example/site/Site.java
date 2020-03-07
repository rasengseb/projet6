package org.example.site;

import java.util.ArrayList;
import java.util.List;

public class Site {
    private int id;
    private String nom;
    private Adresse localisation;
    private List<Secteur> secteurs;
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

    public Adresse getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Adresse localisation) {
        this.localisation = localisation;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public boolean isOfficiel() {
        return isOfficiel;
    }

    public void setOfficiel(boolean officiel) {
        isOfficiel = officiel;
    }
}
