/*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */


public class intMax {
    public static void main(String[] args) {
        System.out.println(intMax(5,10,15));
    }
    public static int intMax(int a, int b, int c) {
        return ((a > b && a > c)) ? a : (b>a && b>c) ? b : c;
    }

}

//Another solution:
/*

public int intMax(int a, int b, int c) {
  int max;

  // First check between a and b
  if (a > b) {
    max = a;
  } else {
    max = b;
  }

  // Now check between max and c
  if (c > max) {
    max = c;
  }

  return max;

  // Could use the built in Math.max(x, y) function which selects the larger
  // of two values.
}

 */
