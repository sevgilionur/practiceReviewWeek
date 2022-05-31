package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String str = "aaabbbcdddfeee";

        String[] arr = str.split("");
        //char[] chr = str.toCharArray();

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        String result = "";

        for (String each : list) {

            int frequency = Collections.frequency(list,each);

            if(frequency==1){
                result+=each;
            }

        }

        /**
        for (char each : chr) {
            list.add(""+each);
        }

         */

        System.out.println(list);
        System.out.println(result);

        System.out.println("------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(2);
        list2.add(35);
        list2.add(42);
        list2.add(5);
        list2.add(65);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        int max = list2.get(8); //arr[0]
        int min = list2.get(8);
        int sum = 0;

        for (Integer each : list2) {

            if(each > max){
                max=each;
            }

            if(each < min){
                min=each;

            }

            sum+=each;

        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);

        System.out.println(sum/list2.size());


        System.out.println("-------------------------------------------");


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(10);
        list3.add(10);
        list3.add(20);
        list3.add(20);
        list3.add(20);
        list3.add(30);
        list3.add(30);
        list3.add(30);

        ArrayList<Integer> result2 = new ArrayList<>();

        for (Integer each : list3) {

            if(!result2.contains(each)){

                result2.add(each);

            }
        }

        System.out.println(result2);




    }
}
/*
      1- Write a program that can only writes unique chars from the given string

       String str = "aaabbbcdddfeee";

       MUST USE ARRAYLIST


       2-Write a program that can find the max and min number, sum of the numbers from the given ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        3-Write a program that can remove the duplicates from the given ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);



 */