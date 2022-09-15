package models;

import java.util.Date;

public abstract class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int id;
    private AccessLevelType accessLevel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccessLevelType getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevelType accessLevel) {
        this.accessLevel = accessLevel;
    }
}
