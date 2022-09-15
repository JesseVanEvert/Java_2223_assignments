package assignments.one;

public class Student extends Person{
    String group;

    public Student(String group, String name, String email) {
        super(name, email);
        this.group = group;
    }

    @Override
    public void display() {
        System.out.printf("name: %s email: %s group: %s %n", this.name, this.email, this.group);
    }
}
