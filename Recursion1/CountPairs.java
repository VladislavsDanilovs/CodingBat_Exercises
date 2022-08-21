/*


We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair.
Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
Recursively compute the number of pairs in the given string.


countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1

 */


package Recursion1;

public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairs("axax"));
    }

    public static int countPairs(String str) {
        if (str.length() <= 2){
            return 0;
        }
        String firstLetter = str.substring(0,1);
        String thirdLetter = str.substring(2,3);
        if (firstLetter.equals(thirdLetter)){
            return 1+countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }

}
