package Recursion1;

/*

We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5

 */

public class BunnyEars2 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(bunnyEars2(number));
    }

    public static int bunnyEars2(int bunnies) {
        int result = 0;
        if (bunnies == 0) {
            return bunnies;
        }

        if (bunnies % 2 == 0 ) {
            result = result+  3 + bunnyEars2(bunnies-1);
        }

        if (bunnies % 2 != 0 || bunnies == 1) {
            result = result+  2 + bunnyEars2(bunnies-1);
        }
        return result;
    }
}
