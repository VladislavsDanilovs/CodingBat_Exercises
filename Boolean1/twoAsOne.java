/*

Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false

 */

package Boolean1;

public class twoAsOne {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(twoAsOne(a,b,c));
    }
    public static boolean twoAsOne(int a, int b, int c) {
        boolean result = false;
        result = (a + b == c || a - b == c || b + a == c || b - a == c) ? true : false;
        return result;
    }

}
