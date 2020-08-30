package hibernate;

import fr.rasen.escalade.model.bean.Departement;
import fr.rasen.escalade.model.bean.Region;

import javax.persistence.*;

@Entity
@Table (name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
    private String rue;
    private int codePostal;
    private String ville;
    @OneToOne
    private Departement departement;
    @OneToOne
    private Region region;

    public Adresse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", numero=" + numero +
                ", rue='" + rue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                ", departement=" + departement +
                ", region=" + region +
                '}';
    }
}
