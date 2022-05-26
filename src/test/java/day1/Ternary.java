package day1;

public class Ternary {

    public static void main(java.lang.String[] args) {

        int n1 = 10, n2 = 20, n3 = 30;

        java.lang.String result = (n1 > n2 && n1 > n3)?"n1 is bigger":(n2> n1 && n2 > n3)?"n2 is bigger":"n3 is bigger";

        System.out.println(result);
    }

}

/*
    5.Write a program that checks for the bigger of 3 numbers.
    you get 3 int variables with DIFFERENT values: n1 , n2 and n3
    if n1 is biggest output: "n1 is bigger"
    if n2 is biggest output: "n2 is bigger"
    if n3 is biggest output: "n3 is bigger"
    NOTE: MUST USE TERNARY
 */
