package data;

import dtos.GradedSubjectDTO;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<GradedSubjectDTO> subjects = new ArrayList<>();
    private List<User> users;
    private static Database instance = new Database();
    private Database(){
        DataInitialization dataInitialization = new DataInitialization();
        this.users = dataInitialization.initializeUserList();
        this.subjects = dataInitialization.initializeGradedSubjectList();
    }
    public static Database getInstance(){
        return instance;
    }

    public void addSubjectToSubjects(GradedSubjectDTO subject) {
        this.subjects.add(subject);
    }
    public void addUserToUsers(User user) {
        user.setId(this.users.size() + 1);
        this.users.add(user);
    }
    public List<User> getAllUsers() {
        return this.users;
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username))
                return user;
        }
        return null;
    }
}
