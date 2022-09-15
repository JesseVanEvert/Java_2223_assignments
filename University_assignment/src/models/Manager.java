package models;

public class Manager extends User{
    public Manager() {
        this.setAccessLevel(AccessLevelType.ADMIN);
    }
}
