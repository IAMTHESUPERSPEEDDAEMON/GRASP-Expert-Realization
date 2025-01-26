package app;

import app.controller.AddressController;
import app.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        AddressController addressController = new AddressController();

        userController.run();
        addressController.run();
    }
}
