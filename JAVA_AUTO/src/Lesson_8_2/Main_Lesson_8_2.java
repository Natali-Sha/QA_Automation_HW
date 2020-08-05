package Lesson_8_2;

public class Main_Lesson_8_2 extends ArithmeticException{

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        int result;
        try {
        result = a / b;
                } catch (ArithmeticException e) {
        System.out.println(e);
        result = 0;
        }

        return result;

    }

//    public boolean divideByZero() {
//        int a = 5;
//        int b = 0;
//        int result;
//        boolean isDividedByZero = true;
//        try {
//        result = a / b;
//                } catch (ArithmeticException e) {
//        System.out.println(e);
//        isDividedByZero = true;
//    }
//        return isDividedByZero;
//
//    }

}
