package hibernate;

import fr.rasen.escalade.model.bean.Topo;
import fr.rasen.escalade.model.bean.Utilisateur;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Utilisateur utilisateur;
    @OneToOne
    private Topo topo;
    private Date dateReservation;

    public Reservation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", utilisateur=" + utilisateur +
                ", topo=" + topo +
                ", dateReservation=" + dateReservation +
                '}';
    }
}
