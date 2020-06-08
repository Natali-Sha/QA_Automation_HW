package HW;


import Helpers.HtmlString;
import Helpers.Lesson_3_10;

public class Lesson_3 {
    public static void main(String[] args) {
//        LESSON 3
//        #1

        System.out.println("------------------");

        System.out.println("1. Given string firstName = \"Den\" and lastName = \"Brown\". Print to the console the full name in the following format: \"FirstName LastName\"\n");

        String firstName = "Den";
        String lastName = "Brown";
        System.out.println("Name: "+  firstName + " " + lastName);

        System.out.println("------------------");

//        #2
        System.out.println("2. Given a string. Write a code that will creates a new string made of its first two chars of the initial string, so the String \"Hello\" yields \"He\".\n" +
                "   If the string is shorter than length 2, return whatever there is, so \"X\" yields \"X\", and the empty string \"\" yields the empty string \"\".\n");

        String str = "s";
        if (str.length() > 1)
        {
            str = str.substring(0,2);
        }
        System.out.println("Result: " + str);

        System.out.println("------------------");

//         #3
        System.out.println("3. The web is built with HTML strings like \"<i>Hello</i>\" which draws Hello as italic text. \n" +
                "   In this example, the \"i\" tag makes <i> and </i> which surround the word \"Hello\".\n" +
                "   Given tag and word strings, create the HTML string with tags around the word, e.g. \"<i>Hello</i>\".\n" +
                "   ");

        HtmlString Obj = new HtmlString();
        String word = ("Welcome to Java World");
        String tag = ("p");
        String htmlReady = Obj.stringCreator(word,tag);
        System.out.println(htmlReady);

        System.out.println("------------------");

//        #4
        System.out.println("4. Given two strings. Check if they start with \"The\".\n");

        String word1 = "The End";
        String word2 = "End The";
        if (word1.substring(0,2) == "The")
        {
            System.out.println(word1 + " - Begins from The");
        }
        else
        {
            System.out.println(word1 + " - Does not begins from The");
        }

        if (word2.substring(0,2) == "The")
        {
            System.out.println(word2 + " - Begins from The");
        }
        else
        {
            System.out.println(word2 + " - Does not begins from The");
        }

        System.out.println("------------------");
//        #5
        System.out.println("Given a string \"ABCDEFGHIJK\". You need to make this string lowercased and remove all vowels.\n");

        String s =  "ABCDEFGHIJK";
        String s2 = s.toLowerCase();
        System.out.println(s2);
        String s3 = s2.replaceAll("[aeiou]", "");
        System.out.println(s3);

        System.out.println("------------------");
//        #6
        System.out.println("6. Given 2 strings, a and b. Create a string c of the form short+long+short, with the shorter string on the outside and the longer string on the inside.\n");

        String a = "hop";
        String b = "hello";
        String c = "";
        if (a.length() > b.length())
        {
            c = (b + " " + " "+ a +" " + " "+ b);
            System.out.println(c);
        }
        else
        {
            c = (a + " " + " "+ b +" " + " "+ a);;
            System.out.println(c);
        }

        System.out.println("------------------");

//        #7
        System.out.println("7. Given a user's email address: john_smith@example.com. Create two strings \"login\" and \"domain\" which will be substrings of full email address. \n" +
                "   The First Name and Last Name of the user should be in the following format: \"Name Surname\".\n");

        String mail = "john_smith@example.com.";
        String login = (mail.substring(0,1).toUpperCase() + mail.substring(1,4)  + " " + mail.substring(5,6).toUpperCase() + mail.substring(6,10));
        String domain = mail.substring(11,18);
        System.out.println("Name - " + login + " "+ "; Domain - "+  domain);

        System.out.println("------------------");

//        #8
        System.out.println("8. Given a string \"Den, John, Will, Kate, Adam, Robin\". Print all the names from the following string each from a new line. \n");

        String names = "Den, John, Will, Kate, Adam, Robin";
        System.out.println(names.replaceAll(", ","\n"));

        System.out.println("------------------");

//         #9
        System.out.println("9. Given some random string s. Verify if that string ends with \".\". If so, leave this string as is. If not - add it. Test strings create on your own.\n");

        String sString = "Some strings";
        String lastChar = (sString.substring(sString.length() - 1));

        if (lastChar.equals("."))
        {
            System.out.println(sString);
        }
        else
         {
            System.out.println("Last char is not a dot - '.'");
         }
        System.out.println("------------------");

//        #10
        System.out.println("10. Write a program which prints \"Hello world\" to the console using methods transformIntToChar and printList only.\n");

        Lesson_3_10.run();
    }
}
