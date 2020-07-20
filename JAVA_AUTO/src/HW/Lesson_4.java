package HW;

import Helpers.*;

public class Lesson_4 {
    public static void main(String[] args) {
//        LESSON 4
//        #1

        System.out.println("------------------");
        System.out.println("1. Create a class \"Human\". A human should have the following attributes: weight, age, first name, last name, height.");

        Human_Lesson_4_1 person = new Human_Lesson_4_1(80,34,"Lili","Gap",180);
        System.out.println (person.weight);
        System.out.println (person.age);
        System.out.println (person.first_Name);
        System.out.println (person.last_Name);
        System.out.println (person.height);

        System.out.println("------------------");
//        #2
        System.out.println("Implement the method fight() depending on weight, strength and age of the boxer: " +
        "You should write dependency by yourself. The method should return true or false if our boxer won or lost.");

        Boxer_Lesson_4_2 ourBoxer = new Boxer_Lesson_4_2(24, 80,179);
        Boxer_Lesson_4_2 anotherBoxer = new Boxer_Lesson_4_2(29, 75, 188);
//        System.out.println("Our boxer is winn - " + );
//        System.out.println("Another boxer is winn - " + );

        ourBoxer.fight(anotherBoxer);
        anotherBoxer.fight(ourBoxer);

        System.out.println("Our Boxer VS Another boxer win - " +  ourBoxer.fight(anotherBoxer));
        System.out.println("Another boxer VS Our Boxer win - " +   anotherBoxer.fight(ourBoxer));

        System.out.println("------------------");

//        #3
        System.out.println("3. Create 3 different classes to demonstate the relationships \"has-a\" and \"uses-a\"." +
                " They can be anything you want. For example: Car - Engine - Wheels");
        RandomNumber_Lesson_4_3 genNumber = new RandomNumber_Lesson_4_3();
        Passport_Lesson_4_3 passportJon = new Passport_Lesson_4_3("Jon","Rad",34);
        Passport_Lesson_4_3 passportKate = new Passport_Lesson_4_3("Kate","Loo",43);
        BankCard_Lesson_4_3 crd1 = new BankCard_Lesson_4_3(genNumber);
        BankCard_Lesson_4_3 crd2 = new BankCard_Lesson_4_3(genNumber);
        crd1.assign(passportJon, "jCard");
        crd2.assign(passportKate, "kCard");
        crd1.print();
        crd2.print();
//        RandomNumber_Lesson_4_3 number = new RandomNumber_Lesson_4_3();

        System.out.println("------------------");

//        #4
        System.out.println("Create a class Calculator. It should have three fields: double firstValue, double secondValue and String operation.\n " +
         "Create all required constructors to properly initialize your object.\n "+
         "Consider the case when user does not provide any parameters when creates a new object.\n" +
         "Write a method \"calculate\" that takes these two values and return the result of the calculation according to the operation.\n" +
         " Write the test class which contains the main method.\n" +
        "Write a method \"calculate\" that takes these two values and return the result of the calculation according to the operation.\n" +
         "Write a method \"calculate\" that takes these two values and return the result of the calculation according to the operation.\n" +
        "Write the test class which contains the main method.\n" +
        "In this main method you should create your Calculator object and do some calculation to test your code, by calling your \"calculate\" method.\n" +
         "Print all results to the console.");


        Calculator_Lesson_4_4 calc = new Calculator_Lesson_4_4();


        calc.getFirstValue();
        calc.getSecondValue();
        calc.getOperation();

        System.out.println("------------------");

//        #5











    }
}
