package app.service;

import app.entity.Address;
import app.view.PrintInfo;

public class AddressService {
    public void printAddress() {
        Address address = new Address("Shevchenko str.", 25, "Ukraine");
        PrintInfo printInfo = new PrintInfo();

        printInfo.print(address);
    }
}
