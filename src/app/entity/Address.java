package app.entity;

import lombok.Getter;

@Getter
public class Address {
    private final String address;
    private final int houseNumber;
    private final String country;

    public Address(String address, int houseNumber, String country) {
        this.address = address;
        this.houseNumber = houseNumber;
        this.country = country;
    }

    @Override
    public String toString(){

        return "User address" +
                "\n Country='" + country + '\'' +
                "\n Address='" + address + '\'' +
                "\n House number='" + houseNumber + '\'';
    }
}
