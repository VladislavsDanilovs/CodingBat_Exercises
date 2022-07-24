/*

Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3

 */


package Recursion1;

public class SumDigits {
    public static void main(String[] args) {
        int number = 126;
        System.out.println(sumDigits(number));
    }
    public static int sumDigits(int n) {
        if (n == 0){
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

}
