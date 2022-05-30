package day4;

public class CustomMethodsPractice {


    public static void main(String[] args) {

        evenNumbers();
        System.out.println();
        oddNumbers();
        System.out.println();
        isEligibleToBuyAlcohol(18);


    }

    public static void evenNumbers() {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
    }

    public static void oddNumbers(){

        for (int i = 0; i <=100 ; i++) {

            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void isEligibleToBuyAlcohol(int age){

        if(age < 0){
            System.out.println("Invalid Entry!");
            System.exit(1);
        }else {
            if(age < 18){
                System.out.println("Not eligible");
            }else{
                System.out.println("Eligible");
            }
        }

    }
}

/*
    1. create a method that can print even numbers between 0~100 in a same line seperated by space

    2. create a method that can print odd numbers between 0~100 in a same line seperated by space

    3.Write a program can print if the person is eligible to buy alcohol or not


 */
