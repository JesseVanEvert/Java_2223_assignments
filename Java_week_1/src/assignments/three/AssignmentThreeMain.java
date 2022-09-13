package assignments.three;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AssignmentThreeMain {
    private List<Student> students = new LinkedList<>();
    private int numberOfStudents;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AssignmentThreeMain assignmentThreeMain = new AssignmentThreeMain();
        assignmentThreeMain.askGroupSizeAndStore();
        assignmentThreeMain.askForStudentNamesAndStore();
        assignmentThreeMain.printOutStudentsIdAndName();
        assignmentThreeMain.askForStudentPresenceAndStore();
        assignmentThreeMain.printOutStudentsIdNameAndPresence();
    }

    private void askGroupSizeAndStore() {
        System.out.print("Please enter the size of your group: ");
        this.numberOfStudents = this.scanner.nextInt();
    }

    private void askForStudentNamesAndStore() {
        for(int i = 0; i < this.numberOfStudents; i++) {
            System.out.printf("Please enter the name of student %s: ", (i+1));
            Student student = new Student();
            student.setName(scanner.next());
            student.setId(i+1);
            this.students.add(student);
        }
    }
    
    private void printOutStudentsIdAndName() {
        for (Student student : this.students) {
            System.out.printf("Student #%s: %s %n", student.getId(), student.getName());
        }
    }

    private void askForStudentPresenceAndStore() {
        String answer = "";
        for (Student student : this.students) {
            while(!(answer.equals("y") || answer.equals("n"))) {
                System.out.printf("Is student #%s(%s) present? (y/n): ", student.getId(), student.getName());
                answer = scanner.next().toLowerCase(Locale.ROOT);
            }
            if(answer.equals("y")) {
                student.setPresent(true);
            }
            answer = "";
        }
    }

    private void printOutStudentsIdNameAndPresence() {
        for (Student student : this.students) {
            System.out.printf("Student #%s: %s | Present: %s %n", student.getId(), student.getName(), student.isPresent());
        }
    }
}
