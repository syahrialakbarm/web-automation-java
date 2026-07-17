package org.example;

public class LoopLesson {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Iteration: " + i);
//        }
//    }

//    public static void enterUsername(String username){
//        System.out.println("Entering username: " + username);
//    }
//
//    public static void main(String[] args) {
//        String[] usernames = {
//                "standard_user",
//                "problem_user",
//                "locked_out_user"
//        };
//
//        for (int i = 0; i < usernames.length; i++) {
//            enterUsername(usernames[i]);
//        }
//    }

    public static void login(String username, String password) {
        System.out.println("Logging in with: ");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        String[] usernames = {
           "standard_user",
           "problem_user",
           "locked_out_user"
        };

        String[] passwords = {
                "secret_sauce",
                "wrong_password",
                "secret_sauce"
        };

        for (int i = 0; i < usernames.length; i++) {
            login(usernames[i], passwords[i]);
        }
    }
}
