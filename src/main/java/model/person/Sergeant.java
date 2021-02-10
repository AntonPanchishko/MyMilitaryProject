package model.person;

import javax.persistence.Entity;

@Entity
public class Sergeant extends Person {
    private Long experience;

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}
