/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

 */


public class max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(5, 10));
    }

    public static int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            return (a > b) ? a : b;
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else {
            return 0;
        }
    }

}

/*
codingbat given solution:

public int max1020(int a, int b) {
  // First make it so the bigger value is in a
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }

  // Knowing a is bigger, just check a first
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}
 */