package HW;

import java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Lesson_1 {
    public static void main(String[] args) {
        // #2
        byte DT_1 = 6;
        short DT_2 = 456;
        int DT_3 = 456768;
        long DT_4 = 456;
        float DT_5 = 4.76567f;
        double DT_6 = 456.7;
        char DT_7 = 90;
        boolean DT_8 = true;

        System.out.println(
                "byte - " + DT_1 + "\n" +
                        "short - " + DT_2 + "\n" +
                        "int - " + DT_3 + "\n" +
                        "long - " + DT_4 + "\n" +
                        "float - " + DT_5 + "\n" +
                        "double - " + DT_6 + "\n" +
                        "char - " + DT_7 + "\n" +
                        "boolean - " + DT_8 + "\n"

        );
        // #3
        //int a = 2147483647; // 2147483648 - error "Integer number too large"
        //  System.out.println(a);

        //#4

        //Integers and floats are two different kinds of numerical data.
        // An integer (more commonly called an int) is a number without a decimal point.
        // A float is a floating-point number, which means it is a number that has a decimal place.
        // Floats are used when more precision is needed.

        //#5
        char H = 72;
        char e = 101;
        char l = 108;
        char o = 111;
        char W = 87;
        char r = 114;
        char d = 100;
        char Em = 33;
        char Sp = 32;
        String HW = new StringBuilder().append(H).append(e).append(l).append(l).append(o).append(Sp).
                append(W).append(o).append(r).append(l).append(d).append(Em).toString();
        System.out.println(HW);

        //#6
        final int A = 3;
        int B = 4;
        int C = 5;
        int D = 6;
        // A = B; cannot assign a value to final variable A
        C = 2;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

        //#7
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array length - " + my_array.length);

        //#8
        double[] my_array2 = {1, 2, 3, 4, 5};
        double a = my_array2[0];
        double b = my_array2[my_array2.length - 1];
        System.out.println("first element - " + a);
        System.out.println("last element - " + b);
    }
}
