/*
onsider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.


fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

 */

package Array2;

import java.util.Arrays;

public class fizzBuzz {
    public static void main(String[] args) {
        int start = 50;
        int end = 56;
        System.out.println(Arrays.toString(fizzBuzz(start, end)));
    }
    public static String[] fizzBuzz(int start, int end) {
        String[] array= new String[end-start];
        int[] intArray= new int[end-start];

        for(int i=0; i<end-start; i++){
            array[i] = String.valueOf(start+i);

        }
        for(int i=0; i<end-start; i++){
            intArray[i] = Integer.parseInt(array[i]);

        }
        System.out.println(Arrays.toString(array)+ "chkar string");
        System.out.println(Arrays.toString(intArray));


        for(int i=0; i<end-start; i++){

            if(intArray[i] % 3 == 0 && intArray[i] % 5 ==0 ){
                array[i] = "FizzBuzz";
                continue;
            }

            if(intArray[i] % 3 == 0){
                array[i] = "Fizz";
                continue;
            }

            if(intArray[i] % 5 == 0){
                array[i] = "Buzz";
                continue;
            }
        }
        return array;
    }

}
