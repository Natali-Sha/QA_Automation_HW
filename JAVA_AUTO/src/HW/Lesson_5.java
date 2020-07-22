package HW;


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
//        Package-private access - означает, что никто не может получить доступ к этому члену, кроме класса, который содержит этот член, внутри методов этого класса.
//        Другие классы в том же пакете не могут получить доступ к закрытым членам.

//        TestClass1_Lesson_5_3 i = new TestClass1_Lesson_5_3(4); //it is not possible to call this constructor, constructor has package-private access
         TestClass1_Lesson_5_3 z = new TestClass1_Lesson_5_3(7, 9); //public constructor creates object using another package-private constructor
         TestClass2_Lesson_5_3 f = new TestClass2_Lesson_5_3(); // creating object of the class in the same package that using package-private constructor













    }
}
