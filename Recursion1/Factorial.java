/*

Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6

 */

package Recursion1;

public class Factorial {

    public static void main(String[]args){
        int Number = 3;
        System.out.println(factorial(Number));
    }

    public static int factorial(int n) {
        if (n<=2){
            return n;
        }
        System.out.println(n*factorial(n-1) + " * test * ");
        return n*factorial(n-1);
    }
}
