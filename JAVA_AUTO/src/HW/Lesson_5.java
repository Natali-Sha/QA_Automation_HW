package HW;

import PrivateAccess_Lesson_5_5.PrivateAccess_Lesson_5_5;
import Protected2_Lessson_5_6.Protected_Class_5_6;
import Protected_Lesson_5_6.Protected_Lesson_5_6;
import PublicAccess_Lesson_5_4.PublicAccess_Lesson_5_4;
import PublicAccess_Lesson_5_4.PublicAccess2_Lesson_5_4;
import ThirdPack_Lesson_5_3.*;



public class Lesson_5 {
    public static void main(String[] args) {
//        LESSON 5
//        #1

        FirstPack_Lesson_5_1.FirstClass_Lesson_5_1 test = new FirstPack_Lesson_5_1.FirstClass_Lesson_5_1(3);
        SecondPack_Lesson_5_1.FirstClass_Lesson_5_1 otherTest = new SecondPack_Lesson_5_1.FirstClass_Lesson_5_1(3);

        System.out.println("------------------");

        System.out.println("------------------");


//        #2
//        Невозможно создать обьекты (имена классов идентичны, мы не указали Package и программа не знает какой именно класс мы хотим вызвать)
//        Для решения этой проблемы можно использовать конструкторы с разными типами данных или разным количеством аргументов.

//        FirstClass_Lesson_5_1 task2  = new FirstClass_Lesson_5_1(3);
//        FirstClass_Lesson_5_1 task2.2  = new FirstClass_Lesson_5_1(5);

//        #3
//        Answer the question: What is a package-private access?

//       Package-private means that other members of the same package have access to the item.
//       Package-private is the default access modifier and does not have a keyword, because package is used to specify the package for a class or interface.

//       TestClass1_Lesson_5_3 i = new TestClass1_Lesson_5_3(4); //it is not possible to call this constructor, constructor has package-private access
         TestClass1_Lesson_5_3 z = new TestClass1_Lesson_5_3(7, 9); //public constructor creates object using another package-private constructor
         TestClass2_Lesson_5_3 f = new TestClass2_Lesson_5_3(); // creating object of the class in the same package that using package-private constructor

//        #4
//        Public access: The access level of a public modifier is everywhere. It can be accessed from within the class,
//        outside the class, within the package and outside the package.

        PublicAccess_Lesson_5_4 public1 = new PublicAccess_Lesson_5_4(7, 9); //public constructor creates object using another package-private constructor
        PublicAccess2_Lesson_5_4 public2 = new PublicAccess2_Lesson_5_4(); // creating object of the class in the same package that using package-private constructor

//        #5

//        Private access: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.


       // PrivateAccess_Lesson_5_5 pA = new PrivateAccess_Lesson_5_5(6,6); - //

//        #6
       // Protected_Lesson_5_6 prot = new Protected_Lesson_5_6("test");
     //   Protected_Class_5_6 prot2 = new Protected_Class_5_6("test2");

//        #7



//        #8


















    }
}
