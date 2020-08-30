package hibernate;

import javax.persistence.*;

@Entity
@Table (name = "cotation")
public class Cotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cote;

    public Cotation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCote() {
        return cote;
    }

    public void setCote(String cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Cotation{" +
                "id=" + id +
                ", cote='" + cote + '\'' +
                '}';
    }
}
