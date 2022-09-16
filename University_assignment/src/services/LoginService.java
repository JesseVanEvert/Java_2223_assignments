package services;

import models.User;

import java.util.List;

public class LoginService extends BaseService{

    public boolean login(String username, String password) {
        User user = this.getUserByUsername(username);

        if(user == null) {
            System.out.printf("user: %s not found: %n", username);
            return false;
        }

        return true;
    }
}
