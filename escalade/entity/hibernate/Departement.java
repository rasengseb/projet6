package hibernate;

import javax.persistence.*;
import javax.swing.*;

@Entity
@Table (name = "departement")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numero;
    private String nom;

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
