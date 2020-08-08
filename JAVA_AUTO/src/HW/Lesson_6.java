package HW;
import Helpers.Lessons.Lesson_6_1.A_Lesson_6_1;
import Helpers.Lessons.Lesson_6_1.B_Lesson_6_1;
import Helpers.Lessons.Lesson_6_1.C_Lesson_6_1;
import Helpers.Lessons.Lesson_6_3.Cabriolet_Lesson_6_3;
import Helpers.Lessons.Lesson_6_4.A_Lesson_6_4;
import Helpers.Lessons.Lesson_6_4.B_Lesson_6_4;
import Helpers.Lessons.Lesson_6_5.Square_Lesson_6_5;


public class Lesson_6 {
        public static void main(String[] args) {
//        LESSON 6
//        #1
         A_Lesson_6_1 allFields = new A_Lesson_6_1();
         B_Lesson_6_1 bField = new B_Lesson_6_1(3,7,8);
         C_Lesson_6_1 cField = new C_Lesson_6_1("First field - C class", " Second field - C class");
         allFields.aPrint(20, bField, cField);
            System.out.println("------------------");

//          #2

//       In Task_Lesson_6_2 class

//          #3
            Cabriolet_Lesson_6_3 bentleyContinental = new Cabriolet_Lesson_6_3("Continental GT", "4806 mm", 4,true);
            System.out.println(bentleyContinental.getName());
            System.out.println(bentleyContinental.getSize());
            System.out.println(bentleyContinental.getGear());
            bentleyContinental.changeGear(2);
            System.out.println(bentleyContinental.getRoofFolded());
            bentleyContinental.convertRoof(false);
            bentleyContinental.move(79,89);
            System.out.println(bentleyContinental.getCurrentVelocity());
            bentleyContinental.steer(6);
            bentleyContinental.stop();
            System.out.println(bentleyContinental.getCurrentVelocity());
            System.out.println("------------------");

//          #4

            A_Lesson_6_4 a = new A_Lesson_6_4("field A", 7,1);

            B_Lesson_6_4 b = new B_Lesson_6_4("field B",7,8);

            a.methodA2();
            b.methodA2();
            System.out.println("------------------");
            a.methodA3();
            b.methodA3();

            System.out.println("------------------");

//          #5

            Square_Lesson_6_5 squ = new Square_Lesson_6_5(8,4);
            squ.calculateArea();

        }
    }
