/*

When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true

 */

package Boolean1;

public class cigarParty {
    public static void main(String[] args) {
        boolean isWeekend = false;
        int cigars = 30;
        System.out.println(cigarParty(cigars, isWeekend));
    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        boolean result = false;
        if(isWeekend){
            if (cigars >39){
                return true;
            }
        }
        if (cigars >39 && cigars < 61){
            result = true;
        }
        return result;
    }

}
