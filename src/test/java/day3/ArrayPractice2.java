package day3;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] words = {"Aygun", "Aygun", "Oleksandr", "Olga" ,"Adam", "Adam", "Adam", "Cihad", "Cihad", "Max"};

        for (String element : words) {

            int frequency = 0;

            for (String each : words) {

                if(each.equals(element)){

                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
            }
        }

        System.out.println("----------------------------------------");

        String[] group1 = {"Ali", "Layan", "Ayşenur"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] result = new String[group1.length + group2.length];

        int i = 0;

        for (String each : group1) {

            result[i++] = each;

        }

        for (String each : group2) {

            result[i++]=each;

        }

        System.out.println(Arrays.toString(result));

    }
}

/*
        1-Write a program that can return the unique element from the given array.
        Ex:
            words = {"Aygun", "Aygun", "Oleksandr", "Olga" ,"Adam", "Adam", "Adam", "Cihad", "Cihad", "Max"};
            output = Oleksandr
                     Olga
                     Max

        2-Write a program that can merge given arrays
                group1 = {"Ali", "Layan", "Ayşenur"};
                group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};
 */
