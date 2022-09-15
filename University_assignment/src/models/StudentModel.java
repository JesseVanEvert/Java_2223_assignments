package models;

import enums.AccessLevelType;

public class StudentModel extends UserModel {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public StudentModel() {
        this.setAccessLevel(AccessLevelType.BASIC);
    }
}
