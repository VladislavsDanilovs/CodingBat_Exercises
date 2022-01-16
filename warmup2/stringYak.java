/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"

 */


package warmup2;

import java.util.ArrayList;
import java.util.List;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
    }
    public static String stringYak(String str) {
        if(str.length()<3){
            return str;
        }
        String result = "";
        List<Integer> indexCheckList = new ArrayList<>();
        for(int i=2; i<str.length(); i++){
            if(str.charAt(i-2) == 'y' && str.charAt(i) == 'k'){
                indexCheckList.add(i-2);
                indexCheckList.add(i-1);
                indexCheckList.add(i);
            }
        }
        for(int i=0; i<str.length(); i++) {
            if(!indexCheckList.contains(i)){
                result+=str.charAt(i);
            }
        }
        return result;
    }

}
