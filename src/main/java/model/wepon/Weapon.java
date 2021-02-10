package model.wepon;

public class Weapon {
    private Long id;
    private String weaponName;
    private Long patronTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Long getPatronTypeId() {
        return patronTypeId;
    }

    public void setPatronTypeId(Long patronTypeId) {
        this.patronTypeId = patronTypeId;
    }

}
