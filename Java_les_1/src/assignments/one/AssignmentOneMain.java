package assignments.one;

import java.util.Scanner;

public class AssignmentOneMain {
    public static void main(String[] args) {
        AssignmentOneMain main = new AssignmentOneMain();
        main.start();
    }

     void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.println("Name is: " + name + " Age is: " + age);
        scanner.close();
    }
}
