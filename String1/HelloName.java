/*

Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"

 */

package String1;

public class HelloName {
    public static void main(String[] args) {
        String str = "Bob";
        System.out.println(helloName(str));
    }

    public static String helloName(String name) {
        return "Hello "+name+"!";
    }

}
