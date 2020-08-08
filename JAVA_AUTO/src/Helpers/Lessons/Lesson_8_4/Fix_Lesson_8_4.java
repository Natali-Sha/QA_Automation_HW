package Helpers.Lessons.Lesson_8_4;

public class Fix_Lesson_8_4 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a; }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException was run - " + e);
        }
        catch (Exception e) {
            System.out.println("Exception was run - " + e);
        }
    }
}
