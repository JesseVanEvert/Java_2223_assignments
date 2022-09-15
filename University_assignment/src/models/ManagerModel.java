package models;

import enums.AccessLevelType;

public class ManagerModel extends UserModel {
    public ManagerModel() {
        this.setAccessLevel(AccessLevelType.ADMIN);
    }
}
