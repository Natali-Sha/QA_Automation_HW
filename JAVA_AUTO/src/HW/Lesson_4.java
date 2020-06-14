package HW;

import Helpers.Boxer_Lesson_4_2;
import Helpers.Human_Lesson_4_1;

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













    }
}
