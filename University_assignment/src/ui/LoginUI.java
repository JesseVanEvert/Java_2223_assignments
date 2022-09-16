package ui;

import services.LoginService;

import java.util.Scanner;

public class LoginUI {
    private LoginService loginService = new LoginService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.print("Enter your username: ");
        String username = scanner.next();
        System.out.print("Enter your password: ");
        String password = scanner.next();
        boolean loginSucceed = loginService.login(username, password);
        while (loginSucceed == false) {
            this.start();
        }
    }
}
