package warmup2;/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


warmup2.stringTimes("Hi", 2) → "HiHi"
warmup2.stringTimes("Hi", 3) → "HiHiHi"
warmup2.stringTimes("Hi", 1) → "Hi"

 */

public class stringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 3));
    }
    public static String stringTimes(String str, int n) {
        String result = "";
        if (n<0){
            result = str;
        } else if(n>0){
            for(int i=0; i<n; i++){
                result+=str;
            }

        } return result;
    }

}
