package org.example;
public class OOPLesson {

    public static void main(String[] args) {

        User user = new User();

        user.username = "standard_user";
        user.password = "secret_sauce";

        User admin = new User();

        admin.username = "admin_user";
        admin.password = "admin123";

        user.login();
        admin.login();
    }
    
}
