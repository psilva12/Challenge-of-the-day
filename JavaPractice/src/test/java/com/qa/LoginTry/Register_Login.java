package com.qa.LoginTry;

import java.util.Scanner;

public class Register_Login {

    public static String userEmail = "";
    public static String userPassword = "";
    public static String checkEmail = "";
    public static String checkPassword = "";

    public static void main(String[] args){

        MainMenu();


    }
    public static void MainMenu(){

        System.out.println("Please choose:");
        System.out.println("1 to Register");
        System.out.println("2 to Login");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        if (choice.equals("1")){
            Register();
            MainMenu();
        }
        else {
            Login();

        }

    }

    public static void Register(){
        System.out.println("You have are registering a new account");
        System.out.println("Please enter an email address: ");
        Scanner in = new Scanner(System.in);
        userEmail = in.nextLine();
        System.out.println("Please enter a password: ");
        userPassword = in.nextLine();

    }

    public static void Login(){
        System.out.println("Please Login: ");
        System.out.println("Please enter an email address: ");
        Scanner in = new Scanner(System.in);
        checkEmail = in.nextLine();
        System.out.println("Please enter a password: ");
        checkPassword = in.nextLine();

        if (userEmail.equals(checkEmail)){
            if(userPassword.equals(checkPassword)){
                System.out.println("LOGIN SUCCESSFUL");
            }
            else {
                System.out.println("The details you have entered are incorrect, please try again");
                Login();
            }
        }

    }

}
