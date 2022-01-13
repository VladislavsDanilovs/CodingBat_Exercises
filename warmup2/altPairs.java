/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"

 */

package warmup2;

public class altPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
    }
    public static String altPairs(String str) {
        String result = "";
        if(str.length()<1){
            return str;
        }
        int index = 0;
        for(int i=0; i<str.length(); i++){
            if(index < 2){
                result+=str.charAt(i);
            }
            index++;
            if(index == 4){
                index = 0;
            }
        }
        return result;
    }

}
