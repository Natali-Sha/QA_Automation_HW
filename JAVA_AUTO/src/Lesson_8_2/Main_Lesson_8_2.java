package Lesson_8_2;

public class Main_Lesson_8_2 extends ArithmeticException{

    public boolean divideByZero() {
        int a = 5;
        int b = 0;
        int result;
        boolean isDividedByZero = false;
        try {
        result = a / b;
                } catch (ArithmeticException e) {
        System.out.println(e);
        isDividedByZero = true;
    }
        return isDividedByZero;

    }

}
