package org.example.site;

import java.util.ArrayList;

public class Secteur {
    private int idSite;
    private ArrayList<Voie> voies;
    //Image??


    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public ArrayList<Voie> getVoies() {
        return voies;
    }

    public void setVoies(ArrayList<Voie> voies) {
        this.voies = voies;
    }
}
