/*

We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod


specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false

 */


package Boolean1;

public class specialEleven {
    public static void main(String[] args) {
    int number = 23;
        System.out.println(specialEleven(number));
    }

    public static boolean specialEleven(int n) {
        boolean result = false;
        if (n % 11 == 0 || (n % 11) + 1 == 0 || (n % 11) == 1) {
            result = true;
        }
        return result;
    }
}

