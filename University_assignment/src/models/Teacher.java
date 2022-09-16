package models;

import enums.AccessLevelType;

public class Teacher extends User {
    public Teacher() {
        this.setAccessLevel(AccessLevelType.EDITOR);
    }
}
