package hibernate;

import fr.rasen.escalade.model.bean.Image;
import fr.rasen.escalade.model.bean.Site;
import fr.rasen.escalade.model.bean.Voie;

import javax.persistence.*;
import java.security.AllPermission;
import java.util.List;

@Entity
@Table (name = "secteur")
public class Secteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne (cascade = CascadeType.ALL)
    private Site site;
    @ElementCollection
    private List<Voie> voies;
    @ElementCollection
    private List<Image> images;

    public Secteur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Secteur{" +
                "id=" + id +
                ", site=" + site +
                ", voies=" + voies +
                ", images=" + images +
                '}';
    }
}
