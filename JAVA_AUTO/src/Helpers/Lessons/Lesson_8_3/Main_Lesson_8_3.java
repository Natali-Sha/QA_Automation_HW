package Helpers.Lessons.Lesson_8_3;

public class Main_Lesson_8_3 {

    public static void main(String[] args) {
        try {

            int a = args.length;
            System.out.println("a = " + a);

            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
            System.out.println("End of try block");}
            catch (ArithmeticException e) {
//                 This block will only execute if any Arithmetic exception
                System.out.println("You should not divide a number by zero");
            }
            catch (Exception e) {
//               This is a generic Exception handler which means it can handle

                System.out.println("Exception occurred");
            }
            System.out.println("Out of try-catch block in Java.");

    }

    }

