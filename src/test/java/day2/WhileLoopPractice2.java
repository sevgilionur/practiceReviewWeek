package day2;

import java.util.Scanner;

public class WhileLoopPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        if(username.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Logged in");


        }else{

            int attempts = 3;

            while ( !(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0){

                System.out.println("Incorrect username or password. Please re-enter");
                System.out.println("Enter your username");
                username= scan.next();

                System.out.println("Enter your password");
                password = scan.next();

                attempts--;

            }

            if(username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");

            }else{
                System.out.println("Your account is locked!!!");
            }

        }

        scan.close();

    }
}
/*
2-You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */