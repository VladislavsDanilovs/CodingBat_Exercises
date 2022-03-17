/*

Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"

 */

package String2;

public class repeatEnd {
    public static void main(String[] args) {
        String str = "Hello";
        int number = 3;

        System.out.println(repeatEnd(str, number));
    }
    public static String repeatEnd(String str, int n) {
        String temp = "";
        for(int i=0; i<n; i++){
            temp = temp + str.substring(str.length()-n, str.length());
        }
        return temp;
    }

}
