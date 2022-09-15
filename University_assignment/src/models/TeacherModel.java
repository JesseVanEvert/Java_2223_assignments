package models;

import enums.AccessLevelType;

public class TeacherModel extends UserModel {
    public TeacherModel() {
        this.setAccessLevel(AccessLevelType.EDITOR);
    }
}
