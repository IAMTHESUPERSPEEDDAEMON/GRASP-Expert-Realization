package app.controller;

import app.service.AddressService;

public class AddressController {
    public void run() {
        AddressService addressService = new AddressService();

        addressService.printAddress();
    }
}
