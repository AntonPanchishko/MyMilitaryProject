package model.warehouse;

import java.util.List;
import model.wepon.Patron;

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
