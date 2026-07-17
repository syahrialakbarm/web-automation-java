package org.example;

public class IfElseLesson {
    public static void main(String[] args) {
//        boolean loginSuccess = false;
//
//        if (loginSuccess) {
//            System.out.println("Login successful!");
//        } else {
//                System.out.println("Login failed!");
//            }
//        }

//        String expectedTitle = "Swag Labs";
//        String actualTitle = "Login";
//
//            if (expectedTitle.equals(actualTitle)) {
//            System.out.println("Test PASSED");
//            } else {
//                System.out.println("Test FAILED");
//            }
//    }
//        String username = "standard_user";
//        String password = "wrong_password";
//
//        if (username.equals("standard_user") && password.equals("secret_sauce")) {
//        System.out.println("Login Successful");
//        } else {
//            System.out.println("Login Failed");
//        }
//    }

//        int failedAttempts = 3;
//
//        if (failedAttempts == 0) {
//            System.out.println("Welcome");
//        } else if (failedAttempts < 3) {
//            System.out.println("Warning: Be Careful.");
//        } else {
//            System.out.println("Account Locked");
//        }
//    }

        String expectedUsername = "standard_user";
        String expectedPassword = "secret_sauce";

        String enteredUsername = "standard_user";
        String enteredPassword = "secret_sauce";

        if (expectedUsername.equals(enteredUsername) && expectedPassword.equals(enteredPassword)) {
            System.out.println("Login Successful");
        } else if (!expectedUsername.equals(enteredUsername)) {
            System.out.println("Invalid username");
        }  else {
            System.out.println("Invalid password");
        }
    }
}

