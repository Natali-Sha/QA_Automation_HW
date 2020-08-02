package HW;

import Lesson_7_1.Bird_Lesson_7_1;
import Lesson_7_1.Duck_Lesson_7_1;
import Lesson_7_2.FahrenheitConverter_Lesson_7_2;
import Lesson_7_2.KelvinConverter_Lesson_7_2;
import Lesson_7_3.MyDevice_Lesson_7_3;

public class Lesson_7 {
    public static void main(String[] args) {
//        LESSON 7
//        #1
        Bird_Lesson_7_1 bird = new Bird_Lesson_7_1();
        bird.fly();

        Duck_Lesson_7_1 duck = new Duck_Lesson_7_1();
        duck.fly();
        System.out.println("------------------");

//        #2
        KelvinConverter_Lesson_7_2 k = new KelvinConverter_Lesson_7_2();
        FahrenheitConverter_Lesson_7_2 f = new FahrenheitConverter_Lesson_7_2();
        k.convert(36.6);
        f.convert(36.6);
        System.out.println("------------------");

//        #3

        MyDevice_Lesson_7_3 myDev = new MyDevice_Lesson_7_3();
        myDev.changeVolume(7);
        myDev.off();
        myDev.on();
        System.out.println("------------------");


















    }
}
