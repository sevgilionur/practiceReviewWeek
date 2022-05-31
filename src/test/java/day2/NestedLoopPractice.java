package day2;

import java.util.Collections;

public class NestedLoopPractice {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            String ch = str.charAt(j)+ ""; //each char of str
            int count = 0;

            for (int i = 0; i < str.length() ; i++) {

                String each = str.charAt(i)+ "" ;

                if(ch.equals(each)){

                    count++;
                }
            }

            if(result.contains(ch)){
                continue;
            }

            result+=ch;
            result+=count;

        }

        System.out.println(result);



    }

}

/*
 Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */
