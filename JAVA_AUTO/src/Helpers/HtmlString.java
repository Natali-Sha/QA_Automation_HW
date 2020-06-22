package Helpers;

public class HtmlString {
    public String stringCreator (String word, String tag) {
        String x = "<" + tag + ">" + word + "</" + tag + ">";
        return x;
    }
}
