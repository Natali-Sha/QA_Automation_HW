package HW;

import java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Lesson_2 {
    public static void main(String[] args) {
//        LESSON 2

//        #1
        int int_1 = 2;
        int int_2 = 2;
        System.out.println("addition - " + (int_1 + int_2));
        System.out.println("substruction - " + (int_1 - int_2));
        System.out.println("multiplication - " + (int_1 * int_2));
        System.out.println("division - " + (int_1 / int_2));

        System.out.println("------------------");
//       #2
// double s_Sqr =  ar.area(x, y);
        double rCircle = 2;
        double aRectangle = 10;
        double bRectangle = 4;
        double sCircle = Math.pow(rCircle, 2) * Math.PI;
        double sRectangle = (aRectangle * bRectangle);
        System.out.println("square of a circle - " + sCircle);
        System.out.println("square of a rectangle - " + sRectangle);

        System.out.println("------------------");
//        #3
        int[] randomArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++)
        {
            randomArray[i] = random.nextInt(100);
            System.out.println(randomArray[i]);
        }

        System.out.println("------------------");

//        #4
        double [] array4 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int a = 0; a < array4.length; a++)
        {
            System.out.println("Square root of " + array4[a] + " is " + Math.sqrt(array4[a]));
        }

        System.out.println("------------------");

//        #5
        int result = 1;
        int factorial = 8;
        for (int f = 1; f < factorial + 1; f++) {
            result = result * f;
        }
        System.out.println("Factorial " + factorial+ " is " + result);

        System.out.println("------------------");

//        #6
//        #6.1
        String ast = "*";
        String sp = " ";
        int size = 9;
        for (int row = 0; row < size; row++)
        {
            for (int line = 0; line < size; line++)
            {
                System.out.print(ast);
            }
            System.out.println();
        }

        System.out.println("------------------");
//        #6.2
        for (int row = 0; row < size; row++) // switching to new row
        {
            for (int line = 0; line < size; line++) // iterating trough one line
            {
                if (0 < row && row < size -1 ) // selecting middle rows
                {
                    if (0 < line && line < size -1 )// selecting middle of the line
                    System.out.print(sp);
                    else {// border symbols
                        System.out.print(ast);
                    }
                }
                else { // border rows
                    System.out.print(ast);
                }
            }
            System.out.println();
        }
//          #6.3
        System.out.println("------------------");
        for (int row = 0; row < size; row++) // switching to new row
        {
            for (int line = 0; line < row; line++) // iterating trough one line
            {
            System.out.print(ast);
            }
            System.out.println();
        }
//            #6.4
        System.out.println("------------------");

        for (int row = 0; row < size; row++) // switching to new row
        {
            for (int line = 0; line < size - (row+1); line++) //printing spaces
            {
                System.out.print(sp);
            }
            for (int line = 0; line < row*2 -1; line++) //printing asterisk
            {
                System.out.print(ast);
            }
            System.out.println();
        }

        System.out.println("------------------");

//        #7
        int [] array7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum7 = 0;
       for (int i = 1; i < array7.length-1; i++)
           {
              sum7 = array7[i] + sum7;

            }
//
       System.out.println("Sum of elements: " + sum7);

        System.out.println("------------------");

//       #8
        int lenght = 101;
        for (int i = 1; i < lenght; i++)
        {
            if (i % 2 > 0 && (i % 5 == 0 || i % 3 == 0))
//            {
                System.out.println(i);
//            }
        }
        System.out.println("------------------");

//        #9
       int [] randomArray9 = new int [8];
       Random random9 = new Random ();
       for (int i=0;  i < randomArray9.length; i++) // filling array
       {
           randomArray9[i] = random9.nextInt(100);

          System.out.println("Array before: " + randomArray9[i]);
        }

        for (int i=0;  i < randomArray9.length; i++) // sorting array
        {
            for (int j = i + 1; j < randomArray9.length; j++)
            {
                int tmp = 0;
                if (randomArray9[i] > randomArray9[j])
                {
                    tmp = randomArray9[i];
                    randomArray9[i] = randomArray9[j];
                    randomArray9[j] = tmp;
                    System.out.println("_________________");
                    for (int a = 0; a < randomArray9.length; a++)
                    {
                        System.out.println(randomArray9[a]); // sorting array step by step
                    }
                    System.out.println("_________________");
                }
            }
        }


























    }
}

