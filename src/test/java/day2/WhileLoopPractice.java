package day2;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Please enter a number");
            int num = scan.nextInt();

            if(num%2==0){
                System.out.println("Even number");
            }else{
                System.out.println("Odd number");
            }

            System.out.println("Would you like to enter another number. (yes/no)");
            String answer = scan.next();

            if(  !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry!");
                System.exit(1);
            }

            if(answer.equalsIgnoreCase("no")){

                System.out.println("Thank you!");
                break;

            }
        }


    }

}
/*
    1-Ask user to enter a number
    if it is odd, print ""Odd Number";
    if it is even, print "Even Number"

    Ask user again if wants to continue or not, if answer is "yes", continue to enter number,
                                                if answer is "no", send "Thank you!" message and close the program.

    If answer is not "yes" or "no" Don't let user continue and close the program with "Invalid Entry!" message




    2-You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */


