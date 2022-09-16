package models;

import enums.AccessLevelType;

public class Manager extends User {
    public Manager() {
        this.setAccessLevel(AccessLevelType.ADMIN);
    }
}
