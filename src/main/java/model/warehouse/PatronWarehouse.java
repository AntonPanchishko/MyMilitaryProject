package model.warehouse;

import model.wepon.Patron;

import java.util.List;

public class PatronWarehouse {
    private Long id;
    private List<Patron> patronScope;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Patron> getPatronScope() {
        return patronScope;
    }

    public void setPatronScope(List<Patron> patronScope) {
        this.patronScope = patronScope;
    }
}
