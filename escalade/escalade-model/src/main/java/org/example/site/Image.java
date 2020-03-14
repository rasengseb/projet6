package org.example.site;

public class Image {
    private int id;
    private String Chemin;
    private Voie voie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChemin() {
        return Chemin;
    }

    public void setChemin(String chemin) {
        Chemin = chemin;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }
}
