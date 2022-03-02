/*

Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

 */

package String2;

public class catDog {
    public static void main(String[] args) {
        String str = "catcat";
        System.out.println(catDog(str));
    }

    public static boolean catDog(String str) {
        boolean result = false;
        int catCounter = 0;
        int dogCounter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {

                catCounter++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCounter++;
            }
        }

        if (dogCounter == catCounter) {
            result = true;
        }
        return result;
    }
}
