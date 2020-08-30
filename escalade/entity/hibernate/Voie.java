package hibernate;

import fr.rasen.escalade.model.bean.Cotation;
import fr.rasen.escalade.model.bean.Secteur;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
@Table (name = "voie")
public class Voie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne (cascade = CascadeType.ALL)
    private Secteur secteur;
    private String nom;
    @OneToOne
    private Cotation cotation;
    private int longueur;
    private String description;
    @ElementCollection
    private List<Image> images;

    public Voie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Cotation getCotation() {
        return cotation;
    }

    public void setCotation(Cotation cotation) {
        this.cotation = cotation;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Voie{" +
                "id=" + id +
                ", secteur=" + secteur +
                ", nom='" + nom + '\'' +
                ", cotation=" + cotation +
                ", longueur=" + longueur +
                ", description='" + description + '\'' +
                ", images=" + images +
                '}';
    }
}
