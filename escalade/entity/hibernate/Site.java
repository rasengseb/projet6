package hibernate;

import fr.rasen.escalade.model.bean.Adresse;
import fr.rasen.escalade.model.bean.Commentaire;
import fr.rasen.escalade.model.bean.Image;
import fr.rasen.escalade.model.bean.Secteur;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToOne (cascade = CascadeType.ALL)
    private Adresse adresse;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Secteur> secteurs;
    @ElementCollection
    private List<Image> images;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Commentaire> commentaires;
    private boolean isOfficiel;

    public Site() {
    }

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

    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse=" + adresse +
                ", secteurs=" + secteurs +
                ", images=" + images +
                ", commentaires=" + commentaires +
                ", isOfficiel=" + isOfficiel +
                '}';
    }
}
