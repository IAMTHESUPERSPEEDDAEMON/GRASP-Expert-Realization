package app.service;

import app.entity.User;
import app.view.PrintInfo;

public class UserService {
    public void printUser() {
        User user = new User("Albert", "Kulikov", 28);
        PrintInfo printInfo = new PrintInfo();

        printInfo.print(user);
    }
}
