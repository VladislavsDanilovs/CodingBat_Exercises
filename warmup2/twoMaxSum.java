/*
Given three ints, return sum of two maximal given ints.

threeIntSum("5,20,30") → "50"
threeIntSum("20,40,60") → "100"
threeIntSum("50,100,150") → "250"

 */


package warmup2;

public class twoMaxSum {
    public static void main(String[] args) {
        System.out.println(threeIntSum(40,20,60));
    }

    public static int threeIntSum(int a, int b , int c){
        int firstMax = (a>b) && (a>c) ? a : (c>a)&&(c>b) ? c : b;
        int secondMax = (a>b) && (a<c) ? a : (c>a)&&(c<b) ? c : (b>a)&&(b<c) ? b : (a>c) ? c : a;
        return firstMax+secondMax;
    }
}
