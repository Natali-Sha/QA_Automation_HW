package Helpers;

public class Test_Lesson_4_7 {

        static int staticI;
        int nonStaticI;

        // Static initialization block:
        // Runs once.
        static {
            System.out.println("Static initialization.");
            staticI = 5;
        }

        // Instance initialization block:
        // Runs each time you instantiate an object.
        {
            System.out.println("Instance initialization.");
            nonStaticI = 7;
        }

        public Test_Lesson_4_7() {
            System.out.println("Constructor.");

        }
    }

