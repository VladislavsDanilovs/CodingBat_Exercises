/*
We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as
0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5.
However, if either tea or candy is at least double the amount of the other one, the party is great (2).
However, in all cases, if either tea or candy is less than 5, the party is always bad (0).


teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2

 */

package Boolean1;

public class teaParty {
    public static void main(String[] args) {
        int tea = 20;
        int candy = 6;
        System.out.println(teaParty(tea, candy));
    }

    public static int teaParty(int tea, int candy) {
        int result = 0;

        //at least at 5 - good
        //great = double the amount of the other one
        //bad less than 5
        result = (tea < 5 || candy < 5) ? 0 : (tea >= candy+candy || candy >= tea+tea)
                ? 2 : 1;

        return result;
    }

}
