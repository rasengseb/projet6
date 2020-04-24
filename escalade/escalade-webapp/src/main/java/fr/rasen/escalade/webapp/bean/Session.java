package fr.rasen.escalade.webapp.bean;

import javax.inject.Named;

@Named
public class Session {

    private int idCurrentUser;
    private String loginCurrentUser;

    public Session() {
        this.idCurrentUser = 7;
        this.loginCurrentUser = "007";
    }

    public int getIdCurrentUser() {
        return idCurrentUser;
    }

    public void setIdCurrentUser(int idCurrentUser) {
        this.idCurrentUser = idCurrentUser;
    }

    public String getLoginCurrentUser() {
        return loginCurrentUser;
    }

    public void setLoginCurrentUser(String loginCurrentUser) {
        this.loginCurrentUser = loginCurrentUser;
    }

    @Override
    public String toString() {
        return "Session{" +
                "idCurrentUser=" + idCurrentUser +
                ", loginCurrentUser='" + loginCurrentUser + '\'' +
                '}';
    }
}
