package HW;
import Helpers.*;

import PrivateAccess_Lesson_5_5.PrivateAccess_Lesson_5_5;
//import Protected2_Lessson_5_6.Protected_Class_5_6;
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
        Getter_Lesson_5_8 iTest = new Getter_Lesson_5_8();
        String a = iTest.getValue_1();
        System.out.println("Getter - " + a);
        int b = iTest.getValue_2();
        System.out.println("Getter - " + b);
        int c = iTest.getValue_3();
        System.out.println("Getter - " + c);
        int d = iTest.getValue_4();
        System.out.println("Getter - " + d);
        int e = iTest.getValue_5();
        System.out.println("Getter - " + e);
        iTest.setValue("test2", 4, 6,7,8);
        System.out.println("Setter - " + iTest.getValue_1());
        System.out.println("Setter - " + iTest.getValue_2());
        System.out.println("Setter - " + iTest.getValue_3());
        System.out.println("Setter - " + iTest.getValue_4());
        System.out.println("Setter - " + iTest.getValue_5());

        System.out.println("------------------");

//        #9

//        Static variables or fields belong to the class, and not to any object of the class.
//        A static variable is initialized when the class is loaded at runtime.
//        Non-static fields are instance fields of an object. They can only be accessed or invoked through an object reference.
//        The value of static variable remains constant throughout the class.
//        The value of Non-static variables changes as the objects has their own copy of these variables.


            System.out.println(Static_Lesson_5_9.st1); // static variables are accessed directly by giving the class reference in other class
            System.out.println(Static_Lesson_5_9.st2);
            Static_Lesson_5_9.Static_Lesson_5_9();

            System.out.println("------------------");

            NonStatic_Lesson_5_9 nonStMain = new NonStatic_Lesson_5_9();//non-static variables are accessed with the help of class object
            System.out.println(nonStMain.nonSt1);
            System.out.println(nonStMain.nonSt2);
            nonStMain.NonStatic_Lesson_5_9();

//        #10

        System.out.println(3 + Constant_Lesson_5_10.con); // it is possible to access the constant from another class and package
        System.out.println("------------------");

//        #11

        Change_Lesson_5_11 valueStatic = new Change_Lesson_5_11();
        Change_Lesson_5_11.setStatic(5);
        valueStatic.setNonStatic(45);

        System.out.println("Static value - " + Change_Lesson_5_11.getStatic());
        System.out.println("Non-static value - " + valueStatic.getNonStaticField());

        Change_Lesson_5_11.setStatic(10);
        valueStatic.setNonStatic(105);
        
        System.out.println("Static value - " + Change_Lesson_5_11.getStatic());
        System.out.println("Non-static value - " + valueStatic.getNonStaticField());

        System.out.println("------------------");






    }
}





















