package hibernate;

import fr.rasen.escalade.model.bean.Secteur;
import fr.rasen.escalade.model.bean.Site;
import fr.rasen.escalade.model.bean.Voie;

import javax.persistence.*;
import java.security.AllPermission;

@Entity
@Table (name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Chemin;
    @ManyToOne (cascade = CascadeType.ALL)
    private Voie voie;
    @ManyToOne (cascade = CascadeType.ALL)
    private Secteur secteur;
    @ManyToOne (cascade = CascadeType.ALL)
    private Site site;

    public Image() {
    }

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

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", Chemin='" + Chemin + '\'' +
                ", voie=" + voie +
                ", secteur=" + secteur +
                ", site=" + site +
                '}';
    }
}
