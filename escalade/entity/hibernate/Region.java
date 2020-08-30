package hibernate;

import fr.rasen.escalade.model.bean.Departement;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "region")
public class Region {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @ElementCollection
    private List<Departement> departements;


    public Region() {
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

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements = departements;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", departements=" + departements +
                '}';
    }
}
