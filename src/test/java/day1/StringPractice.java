package day1;

import java.util.Arrays;
import java.util.Locale;

public class StringPractice {

    public static void main(String[] args) {

        String first = "cybertek";
        String last = "school";

        char f = first.toUpperCase().charAt(0);
        char l = last.toUpperCase().charAt(0);

        System.out.println(f + "." + l);

        System.out.println("-------------------------------------------------");

        String str = "Anna";
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            char ch = str.charAt(i);

            result += ch;

        }

        if(str.equalsIgnoreCase(result)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

        System.out.println(result);

        System.out.println("-------------------------------------------------");


        String str1 = "aaabbcccdeeeff";

        String result1 = "";

        for (int i = 0; i < str1.length() ; i++) {

            String s = "" + str1.charAt(i);

            if(!result1.contains(s)){
                result1+=s;

            }
        }

        System.out.println(result1);

        System.out.println("-------------------------------------------------");

        String input = "Wooden Spoon";

        String reverse = "";

        for (int i = input.length()-1; i >=0  ; i--) {

            char c = input.charAt(i);

            reverse += c;

        }

        System.out.println(reverse);

        System.out.println("-------------------------------------------------");

        String str2 = "aaabccdffg";

        String uniqueChars = "";

        for (int i = 0; i < str2.length() ; i++) {

            String ch1 = "" + str2.charAt(i);

            if(str2.indexOf(ch1)==str2.lastIndexOf(ch1) ){

                uniqueChars += ch1;
            }

        }

        System.out.println(uniqueChars);


    }

}

/*

    1. Write a program that can return the initials of the user
    ex:
    cybertek
    school
    output:
    C.S
    Note: Pay attention to the example output




    2. Write a program that can check if the given String is palindrome
        Ex:
        input: Level
        output: true
        input: Anna
        output: true


    3. Write a program that can remove the duplicates from the given String.
        Ex:
        String str = "aaabbcccdeeeff";
        output: "abcdef";


    4. Write a program that can reverse a String
        Ex :
        input : Wooden Spoon
        output: noopS nedooW


    5. Write a program that can return the unique characters from a String
        Ex :
        input:  AABCCD
        output: BD
 */

