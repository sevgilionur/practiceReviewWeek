package day3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers) {

            if(each > max){
                max= each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println(max);
        System.out.println("min = " + min);

        System.out.println("------------------------------------------");

        String str1 = "acdb";
        String str2 ="dbca";
        //String str3 = "I love Java";

        //String[] arr2 =str3.split(" ");

        char[] chr =str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr);
        Arrays.sort(chr2);

        System.out.println(Arrays.toString(chr));
        System.out.println(Arrays.toString(chr2));

        boolean isAnagram =Arrays.equals(chr,chr2);

        System.out.println("isAnagram = " + isAnagram);

        System.out.println("------------------------------------------");

        String[] names = {"Ahmet Özparlak", "Recai Parlak", "Doğukan Özer", "Hatice Biçer", "Cemal Kiraz"};

        for (int j = names.length - 1; j >= 0; j--) {

            String each = names[j];

            String reverse = "";

            for (int i = each.length()-1; i >= 0; i--) {

                reverse+= each.charAt(i);

            }

            System.out.println(reverse);
        }


























    }


}

/*
            1-Find max and min numbers from the given array
            Ex:
            input: numbers = {10, 5, 4, 20, 1, 0};
            output: max = 20  min=0;

            2-Write a program that can check if str1 & str2 are build out same characters(is Anagram?)
            String str1 = "acdb";
            String str2 ="dbca";

            MUST USE ARRAY

            3-Write a program that can reverse the given array
            Ex:
            names = {"Ahmet Özparlak", "Recai Parlak", "Doğukan Özer", "Hatice Biçer", "Cemal Kiraz"};





 */