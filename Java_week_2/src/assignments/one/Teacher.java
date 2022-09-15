package assignments.one;

public class Teacher extends Person {
    double salary;

    public Teacher(double salary, String name, String email) {
        super(name, email);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.printf("name: %s email: %s salary: %s %n", this.name, this.email, this.salary);
    }
}
