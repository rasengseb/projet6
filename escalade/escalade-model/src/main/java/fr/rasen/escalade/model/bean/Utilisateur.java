package fr.rasen.escalade.model.bean;

public class Utilisateur {
    private int id;
    private String  nom;
    private String  prenom;
    private String  pseudo;
    private String  mdp;
    private String  mail;
    private boolean isAdmin;

    public Utilisateur(String nom, String prenom, String pseudo, String mdp, String mail, boolean isAdmin){
        this.nom     = nom;
        this.prenom  = prenom;
        this.pseudo  = pseudo;
        this.mdp     = mdp;
        this.mail    = mail;
        this.isAdmin = isAdmin;
    }

    public Utilisateur(){

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", mdp='" + mdp + '\'' +
                ", mail='" + mail + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
