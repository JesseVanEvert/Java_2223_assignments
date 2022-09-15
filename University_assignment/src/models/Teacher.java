package models;

public class Teacher extends User {
    public Teacher() {
        this.setAccessLevel(AccessLevelType.EDITOR);
    }
}
