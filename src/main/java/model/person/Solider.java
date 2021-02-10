package model.person;

import javax.persistence.Entity;

@Entity
public class Solider extends Person {
    private String soliderRole;

    public String getSoliderRole() {
        return soliderRole;
    }

    public void setSoliderRole(String soliderRole) {
        this.soliderRole = soliderRole;
    }
}
