package hibernate;

import javax.persistence.*;

@Entity
@Table (name = "cotation")
public class Cotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cote;

    public Cotation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
