package model.person;

import javax.persistence.Entity;

@Entity
public class Officer extends Person {
    private Long salary;

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
