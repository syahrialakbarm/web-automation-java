package org.example;

public class MethodLesson {
//    public static void sayHello() {
//        System.out.println("Hello Automation");
//    }
//
//    public static void main(String[] args) {
//        sayHello();
//    }
//    public static void openBrowser() {
//        System.out.println("Opening Chrome...");
//    }

//    public static void login(String username, String password) {
////        System.out.println("Logging In...");
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//    }

//    public static void closeBrowser() {
//        System.out.println("Closing Chrome...");
//    }

//    public static boolean isLoginSuccessful(String username, String password) {
//        return username.equals("standard_user") && password.equals("secret_sauce");
//        boolean result = isLoginSuccessful(
//                "standard_user",
//                "secret_sauce"
//        );
//        return result;
//    }

    String website = "https://www.saucedemo.com";
    public static void openWebsite() {
        System.out.println("Opening https://saucedemo.com");
    }

    public static void enterUsername(String username) {
        System.out.println("Entering username: " + username);
    }

    public static void enterPassword(String password) {
        System.out.println("Entering password: " + password);
    }

    public static void clickLogin() {
        System.out.println("Clicking login button");
    }

    public static void main(String[] args) {
//        openBrowser();
//        login("standard_user", "secret_sauce");
//        closeBrowser();
//        isLoginSuccessful();
        openWebsite();
        enterUsername("standard_user");
        enterPassword("secret_sauce");
        clickLogin();
    }
}
