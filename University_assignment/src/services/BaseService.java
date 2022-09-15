package services;

import data.Database;
import models.UserModel;

import java.util.List;

abstract class BaseService {
    private Database database = Database.getInstance();

    protected void addUserToUsers(UserModel user) {
        this.database.addUserToUsers(user);
    }

    protected List<UserModel> getAllUsers() {
        return this.database.getAllUsers();
    }
}
