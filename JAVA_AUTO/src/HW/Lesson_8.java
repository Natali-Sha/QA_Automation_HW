package HW;

import Helpers.Lessons.Lesson_8_1.Try_Lesson_8_1;
import Helpers.Lessons.Lesson_8_1.MyException_Lesson_8_1;
import Helpers.Lessons.Lesson_8_2.Main_Lesson_8_2;
import Helpers.Lessons.Lesson_8_5.ICanThrowException_Lesson_8_5;
import Helpers.Lessons.Lesson_8_6.Number_Lesson_8_6;
import Helpers.Lessons.Lesson_8_7.Lesson_8_7;

import java.util.HashSet;
import java.util.Set;

public class Lesson_8 {
    public static void main(String[] args) throws MyException_Lesson_8_1 {
//        LESSON 8
//            #1
        Try_Lesson_8_1 t = new Try_Lesson_8_1(-4);

        t.checkNumber();
        t.setNumber(5);
        t.checkNumber();
        t.setNumber(0);
        t.checkNumber();

        System.out.println("------------------");

//            #2
        Main_Lesson_8_2 m = new Main_Lesson_8_2();
        System.out.println("Was divided by zero - " + m.divideByZero());

        System.out.println("------------------");

//            #5

        ICanThrowException_Lesson_8_5 iCan = new ICanThrowException_Lesson_8_5();

        try {

            iCan.iCanThrowException();
        } catch (NullPointerException e){
            System.out.println("Exception " + e + " was handled");
        }
        System.out.println("------------------");

//            #6
        Number_Lesson_8_6 num = new Number_Lesson_8_6();
        num.readData();

        System.out.println("------------------");


//            #7
        Set<Lesson_8_7> s = new HashSet<>();
        s.add(new Lesson_8_7("Donald", "Duck"));
        System.out.println(s.contains(new Lesson_8_7("Donald", "Duck")));
        System.out.println(s.contains(new Lesson_8_7("Donalds", "Ducks")));


    }

    }

