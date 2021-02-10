package model;

import java.util.List;
import model.person.Solider;

public class Squad {
    private Long id;
    private String type;
    private List<Solider> soliderList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Solider> getSoliderList() {
        return soliderList;
    }

    public void setSoliderList(List<Solider> soliderList) {
        this.soliderList = soliderList;
    }
}
