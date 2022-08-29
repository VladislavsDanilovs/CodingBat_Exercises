/*


Given a string that contains a single pair of parenthesis, compute recursively
a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"

 */

package Recursion1;

public class ParenBit {
    public static void main(String[] args) {
        String ss = "";
    }

    public String parenBit(String str) {
        if(str.length() <=1){
            return str;
        }

        if(str.substring(0,1).equals("(")){
            return str.substring(0, str.indexOf(")")+1);
        }

        return parenBit(str.substring(1));

    }

/* Alternative solution */
/*

public String parenBit(String str) {
  if(str.length() <=1){
    return str;
  }

  char firstLetter = str.charAt(0);
  char lastLetter = str.charAt(str.length()-1);

  if(firstLetter == '(' && lastLetter == ')'){
    return str;
  }

  if(firstLetter != '(' && lastLetter == ')'){
    return parenBit(str.substring(1, str.length()));
  }

  if(firstLetter == '(' && lastLetter != ')'){
    return parenBit(str.substring(0, str.length()-1));
  }
  return parenBit(str.substring(1, str.length()-1));
}


 */

}
