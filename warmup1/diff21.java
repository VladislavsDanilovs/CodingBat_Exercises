
/*

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/

class diff21 {
    public static void main(String[] args) {
        System.out.println(diff(30));
    }
    public static int diff(int n) {
        if (n > 21) {
            int a = n-21;
            return a*2;
        } else {
            return 21 - n;
        }
    }
}
