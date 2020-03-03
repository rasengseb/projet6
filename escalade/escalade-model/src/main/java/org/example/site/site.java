package org.example.site;

import java.util.ArrayList;

public class site {
    private int id;
    private String nom;
    private Localisation localisation;
    private ArrayList<Secteur> secteurs;
    private boolean haveTopo;
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

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    public ArrayList<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(ArrayList<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public boolean isHaveTopo() {
        return haveTopo;
    }

    public void setHaveTopo(boolean haveTopo) {
        this.haveTopo = haveTopo;
    }

    public boolean isOfficiel() {
        return isOfficiel;
    }

    public void setOfficiel(boolean officiel) {
        isOfficiel = officiel;
    }
}
