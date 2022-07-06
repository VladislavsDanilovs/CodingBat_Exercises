/*

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string
with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"

 */

package String1;

public class MakeTags {
    public static void main(String[] args) {
        String tag = "i";
        String word = "Yay";
        System.out.println(makeTags(tag, word));
    }

    public static String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"<"+"/"+tag+">";
    }

}
