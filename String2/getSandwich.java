/*

A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

 */

package String2;

public class getSandwich {
    public static void main(String[] args) {
        String str = "breadjambread";
        System.out.println(getSandwich(str));
    }

    public static String getSandwich(String str) {
        String temp = "";
        int index1 = 0;
        int index2 = 0;
        int counter = 0;

        if (str.length() < 5) {
            return temp;
        }

        for (int i = 0; i < str.length() - 4; i++) {

            if (str.substring(i, i + 5).equals("bread")) {

                if (counter != 0) {
                    counter++;
                    break;
                }
                index1 = i + 5;
                counter++;
            }
        }
        if (counter == 2) {
            for (int j = str.length(); j > 0; j--) {
                if (str.substring(j - 5, j).equals("bread")) {
                    index2 = j - 5;
                    temp = temp + str.substring(index1, index2);
                    break;
                }
            }
        }

        return temp;
    }


}
