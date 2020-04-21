package fr.rasen.model.bean.ressource;

import fr.rasen.model.bean.bdd.Utilisateur;

import java.io.*;
import java.util.Properties;

public class UtilisateurProperties {

    private int id;
    private String nom;
    private String prenom;
    private String pseudo;
    private String mdp;
    private String mail;
    private boolean isAdmin;

    public UtilisateurProperties() {
        Properties prop = new Properties();
        FileInputStream in;
        Utilisateur utilisateur;

        try {
            in = new FileInputStream("ressources/utilisateur.properties");
            prop.load(in);
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        id = Integer.parseInt(prop.getProperty("id"));
        nom = prop.getProperty("nom");
        prenom = prop.getProperty("prenom");
        pseudo = prop.getProperty("pseudo");
        mdp = prop.getProperty("mdp");
        mail = prop.getProperty("mail");
        isAdmin = Boolean.getBoolean(prop.getProperty("isAdmin"));
    }

    public void sauvegarde() {
        Properties properties = new Properties();
        FileInputStream fis;

        try {
            fis = new FileInputStream("ressources/utilisateur.properties");
            properties.load(fis);
            properties.setProperty("id", String.valueOf(id));
            properties.setProperty("nom", nom);
            properties.setProperty("prenom", prenom);
            properties.setProperty("pseudo", pseudo);
            properties.setProperty("mdp", mdp);
            properties.setProperty("mail", mail);
            properties.setProperty("isAdmin", String.valueOf(isAdmin));
            FileOutputStream fos = new FileOutputStream("ressources/utilisateur.properties");
            properties.store(fos, null);
            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
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
}
