package hibernate;

import fr.rasen.escalade.model.bean.Site;

import javax.persistence.*;

@Entity
@Table (name = "commentaire")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne (cascade = CascadeType.ALL)
    private Site site;
    private String commentaire;
    private boolean isPublic;

    public Commentaire() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", site=" + site +
                ", commentaire='" + commentaire + '\'' +
                ", isPublic=" + isPublic +
                '}';
    }
}
