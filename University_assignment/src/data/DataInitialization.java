package data;

import dtos.GradedSubjectDTO;
import models.Manager;
import models.Student;
import models.Teacher;
import models.User;

import javax.swing.*;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class DataInitialization {
    private List<User> users = new LinkedList<>();
    private List<GradedSubjectDTO> gradedSubjects = new LinkedList<>();
    private Student larry = new Student();
    private Teacher richard = new Teacher();
    private Manager michael = new Manager();

    public List<User> initializeUserList() {
        larry.setFirstName("Larry");
        larry.setLastName("Page");
        larry.setBirthDate(Date.from(Instant.now()));
        larry.setGroup("inf2a");

        richard.setFirstName("Richard");
        richard.setLastName("Feynman");
        richard.setBirthDate(Date.from(Instant.now()));

        michael.setFirstName("Michael");
        michael.setLastName("Scott");
        michael.setBirthDate(Date.from(Instant.now()));

        return users;
    }

    public List<GradedSubjectDTO> initializeGradedSubjectList() {
        GradedSubjectDTO java = new GradedSubjectDTO(larry.getId(), "Java", 70);
        GradedSubjectDTO python = new GradedSubjectDTO(larry.getId(), "Python", 80);

        this.gradedSubjects.add(java);
        this.gradedSubjects.add(python);

        return this.gradedSubjects;
    }
}