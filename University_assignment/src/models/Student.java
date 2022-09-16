package models;

import enums.AccessLevelType;

public class Student extends User {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student() {
        this.setAccessLevel(AccessLevelType.BASIC);
    }
}
