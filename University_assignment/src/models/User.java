package models;

import enums.AccessLevelType;

import java.util.Date;

public abstract class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int id;
    private AccessLevelType accessLevel;
    private String password;
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

    protected void setAccessLevel(AccessLevelType accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getUsername() {
        return this.firstName + this.id;
    }

    public boolean isLoginValid(String password) {
        return password.equals(this.password);
    }
    /*
    public int getAge() {
    }
     */
}
