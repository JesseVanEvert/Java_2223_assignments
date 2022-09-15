package assignments.one;

public class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.printf("name: %s email: %s %n", this.name, this.email);
    }
}
