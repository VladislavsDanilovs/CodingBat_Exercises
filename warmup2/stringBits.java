/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

 */

package warmup2;

public class stringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Heeololeo"));
    }
    public static String stringBits(String str) {
        String result="";
        if(str.length()<1){
            result = str;
        }
        for(int i=0; i<str.length(); i+=2){
            result+=str.charAt(i);
        }
        return result;
    }
}
