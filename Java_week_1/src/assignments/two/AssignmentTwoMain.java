package assignments.two;


import java.util.Arrays;
import java.util.Scanner;

public class AssignmentTwoMain {
    private String course;
    private String[] students;
    private double[] grades;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AssignmentTwoMain assignmentTwoMain = new AssignmentTwoMain();

        assignmentTwoMain.askAndStoreCourseName();
        assignmentTwoMain.askStudentCountAndInitializeArrays();
        assignmentTwoMain.askStudentNamesAndStoreInStudents();
        assignmentTwoMain.askStudentCourseGradesAndStoreInGrades();
        assignmentTwoMain.calculateAndShowAverageGrade();
        assignmentTwoMain.findAndShowMaximumGrade();
        assignmentTwoMain.showGradesStudentAndCourse();
    }

    private void askAndStoreCourseName() {
        System.out.print("Enter course name: ");
        this.course = scanner.nextLine();
    }

    private void askStudentCountAndInitializeArrays() {
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        this.students = new String[numberOfStudents];
        this.grades = new double[numberOfStudents];
    }

    private void askStudentNamesAndStoreInStudents() {
        for (int i = 0; i < this.students.length; i++){
            System.out.printf("Enter name of student %s :", (i+1));
            this.students[i] = scanner.next();
        }
    }

    private void askStudentCourseGradesAndStoreInGrades() {
        for (int i = 0; i < this.grades.length; i++){
            System.out.printf("Enter the grade of %s:", this.students[i]);
            this.grades[i] = scanner.nextInt();
        }
    }

    private void calculateAndShowAverageGrade() {
        double average = Arrays.stream(this.grades).sum() / this.grades.length;
        System.out.printf("Average grade: %s %n", average);
    }

    private void findAndShowMaximumGrade() {
        double maxGrade = Arrays.stream(this.grades).max().getAsDouble();
        String student = "";
        for(int i = 0; i < this.grades.length; i++) {
            if(maxGrade == this.grades[i]) {
                student = this.students[i];
            }
        }
        System.out.printf("Student %s has maximum grade: %s %n", student, maxGrade);
    }

    private void showGradesStudentAndCourse() {
        for(int i = 0; i < grades.length; i++) {
            System.out.printf("Grade for student %s (course %s): %s %n", this.students[i], this.course, this.grades[i]);
        }
    }
}
