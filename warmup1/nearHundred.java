/*

Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */

public class nearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
    }
    public static boolean nearHundred(int n) {
        return ((n < 90) || ( n > 110 && n < 190) || (n > 210)) ? false : true;
    }
    //solution using Math.abs:

    /*
    public boolean nearHundred(int n) {
    return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}
     */

}
