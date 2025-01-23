package app.entity;

import lombok.Getter;

@Getter
public class User {
    private final String name;
    private final String secondName;
    private final int age;

    public User(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }
}
