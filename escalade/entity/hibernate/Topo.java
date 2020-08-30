package hibernate;

import fr.rasen.escalade.model.bean.Site;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "topo")
public class Topo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String description;
    @ManyToOne (cascade = CascadeType.ALL)
    private Site site;
    private Date dateParution;
    private boolean disponible;


    public Topo() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Topo{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", site=" + site +
                ", dateParution=" + dateParution +
                ", disponible=" + disponible +
                '}';
    }
}
