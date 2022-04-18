/*

Given a string and a non-empty word string, return a version of the original String where all chars have been replaced
by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

package String2;

import java.util.ArrayList;
import java.util.List;

public class plusOut {
    public static void main(String[] args) {
        String str = "aaxxxxbb";
        String word = "xx";
        /* correct output: ++xxxx++ */
        System.out.println(plusOut(str, word));
    }

    /* failed attempt (Correct for more than half the tests)*/
//    public static String plusOut(String str, String word) {
//        List<Integer> list1 = new ArrayList<>();
//        String result = "";
//        boolean result2 = false;
//        int counter = 0;
//        String temp = "";
//        while(temp.length() != str.length()){
//            temp+="+";
//        }
//        for(int i=word.length(); i<str.length()+1; i++){
//            System.out.println(str.substring(i).startsWith(word));
//            if((str.substring(i-word.length(), i).equals(word.substring(0, word.length())))){
//                int index = i;
//                list1.add(index);
//                System.out.println(index);;
//                if(counter == 0){
//                    result+=temp.substring(0, index-word.length())+word;
//                    counter++;
//                } else if(counter!=0){
//                    System.out.println(list1.get(counter-1));
//                    result+=temp.substring(list1.get(counter-1), index-2)+word;
//                    counter++;
//
//                }
//
//
//                result2 = true;
//
//
//            }
//        }
//
//        if (list1.get(list1.size()-1) == list1.get(counter-1)){
//            result+=temp.substring(list1.get(list1.size()-1), temp.length());
//        }
//
//        return result;
//    }

    /* Correct solution */
    public static String plusOut(String str, String word) {
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.substring(i).startsWith(word)){
                result+=word;
                i+=word.length()-1;
            }else{
                result+="+";
            }
        }
        return result;
    }

}
