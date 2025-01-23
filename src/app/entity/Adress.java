package app.entity;

import lombok.Getter;

@Getter
public class Adress {
    private final String adress;
    private final int houseNumber;
    private final String country;


    public Adress(String adress, int houseNumber, String country) {
        this.adress = adress;
        this.houseNumber = houseNumber;
        this.country = country;
    }
}
