/*

Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"

 */

package String2;

public class repeatFront {
    public static void main(String[] args) {
        String str = "Chocolate";
        int number = 4;
        System.out.println(repeatFront(str, number));
    }

    public static String repeatFront(String str, int n) {
        String temp = "";
        while (n > 0) {
            temp = temp + str.substring(0, n);
            n--;
        }
        return temp;
    }

}
