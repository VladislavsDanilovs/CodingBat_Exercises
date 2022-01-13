/*

Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"

 */

package warmup2;

public class stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
    }

    public static String stringX(String str) {
        String result = "";
        if (str.length() > 2) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 'x') {
                    result +=str.charAt(i);
                }
            }
            result = (str.startsWith("x")) ?  "x"+result : result;
            result = (str.endsWith("x")) ? result + "x" : result;
        } else {
            result = str;
        }
        return result;
    }

}

/*
Alternative solution:
String result = "";
if(str.length()<3){
    result = str;
} else {
result +=str.charAt(0);
for(int i=1; i<str.length()-1; i++){
char ch = str.charAt(i);
if (ch != 'x'){
    result += ch;
}
result += str.charAt(str.length()-1);
}
return result;
}

 */