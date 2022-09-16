package services;

import data.Database;
import models.User;

import java.util.List;

abstract class BaseService {
    private Database database = Database.getInstance();

    protected void addUserToUsers(User user) {
        this.database.addUserToUsers(user);
    }

    protected List<User> getAllUsers() {
        return this.database.getAllUsers();
    }

    protected User getUserByUsername(String username) {
        return this.database.getUserByUsername(username);
    }
}
