package model.wepon;

public class Patron {
    private Long id;
    private String type;
    private Long caliber;

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

    public Long getCaliber() {
        return caliber;
    }

    public void setCaliber(Long caliber) {
        this.caliber = caliber;
    }
}
