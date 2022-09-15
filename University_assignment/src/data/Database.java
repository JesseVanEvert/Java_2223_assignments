package data;

import dtos.SubjectDTO;
import models.UserModel;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<SubjectDTO> subjects = new ArrayList<>();
    private List<UserModel> users = new ArrayList<>();
    private static Database instance = new Database();
    private Database(){}
    public static Database getInstance(){
        return instance;
    }

    public void addSubjectToSubjects(SubjectDTO subject) {
        this.subjects.add(subject);
    }
    public void addUserToUsers(UserModel user) {
        this.users.add(user);
    }

    public List<UserModel> getAllUsers() {
        return this.users;
    }
}
