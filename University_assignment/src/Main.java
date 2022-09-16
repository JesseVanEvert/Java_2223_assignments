import ui.LoginUI;

public class Main {
    public static void main(String[] args) {
        LoginUI loginUI = new LoginUI();
        loginUI.start();
        /*
        List<UserModel> users = database.getAllUsers();

        for (UserModel user: users) {
            StudentModel student1 = (StudentModel) user;
            System.out.print(student1.getGroup());
        }*/
    }
}