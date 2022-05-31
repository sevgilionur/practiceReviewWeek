package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {

            if(list.indexOf(each)==list.lastIndexOf(each)){

                unique.add(each);

            }

        }

        System.out.println(unique);

        System.out.println("-----------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D', 'E', 'E','F'));

        for (Character element : list2) {

            int frequency = 0;
            for (Character each : list2) {

                if(each== element){

                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element);
                break;
            }
        }

        System.out.println("---------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        Collections.max(list3);

        int n = 3;

        for (int i = 1; i < n  ; i++) {

            list3.removeIf(p -> Collections.max(list3)==p);
        }

        int max = Collections.max(list3);

        System.out.println(max);

        System.out.println("------------------------------");



    }























    }



/*
  1-Write a program that can print the unique elements from the given ArrayList with new ArrayList

  Ex:
  ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

  output:[Python, Ruby]


    2- write a program that can return the FIRST unique elements from an arrayList
        Do not use indexOf && lastIndexOf methods

        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D', 'E', 'E','F'));


     3- write a program that prints nTh largest number from the given ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

 */

