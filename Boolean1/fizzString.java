/*

Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"

 */

package Boolean1;

public class fizzString {
    public static void main(String[] args) {
        String str = "fib";
        System.out.println(fizzString(str));
    }

    public static String fizzString(String str) {
        String result = "";
        result = (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
                ? "FizzBuzz" : (str.charAt(0) == 'f') ? "Fizz"
                : (str.charAt(str.length() - 1) == 'b') ? "Buzz" : str;
        return result;
    }

}
