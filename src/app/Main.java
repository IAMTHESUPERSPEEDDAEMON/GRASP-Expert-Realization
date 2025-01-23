package app;

import app.entity.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Viacheslav", "fbiaf", 12);

        System.out.println(user.getAge());
    }
}
