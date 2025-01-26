package app.controller;

import app.service.UserService;

public class UserController {
    public void run() {
        UserService userService = new UserService();

        userService.printUser();
    }
}
