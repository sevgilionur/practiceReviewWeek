package day4;

import java.util.Arrays;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {

        String reverse = reverse("Java");

        System.out.println(reverse);

        boolean r = isPalindrome("Hakan");

        System.out.println(r);

        int[] arr ={10, 20, 30, 40, 50, 60};

        int[] result = removeElement(arr, 2);

        System.out.println(Arrays.toString(result));

        int[] array ={1,1,1,1,1,2,2};

        int frequency = frequencyOfNumber(array, 1);

        System.out.println(frequency);

    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result+=str.charAt(i);

        }
        return result;
    }

    public static boolean isPalindrome(String str){

        String result = reverse(str);

        return result.equalsIgnoreCase(str);

    }

    public static int[] removeElement(int[] arr, int index){

        int[] result = new int[arr.length-1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if(i == index){

                continue;
            }else {

                result[j++]+=arr[i];
            }

        }
        return result;
    }

    public static int frequencyOfNumber(int[] arr, int number){

        int frequency = 0;

        for (int each : arr) {

            if(each==number){

                frequency++;

            }
        }
        return frequency;

    }


}

/*
    1. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ

    2. By using the reverse method above to create another method named isPalindrome  that passes
       a String parameter, the method returns true if the string is palindrome, otherwise returns false
                    Ex:
                    str = "Level"
                        isPalindrome(str) ===> true



    3. create a method named removeElement that passes one integer array and one integer,
    the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2

				removeElement(array, index) ==== {10, 20, 40, 50, 60}

	4. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5


 */