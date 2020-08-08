package Helpers.Lessons.Lesson_6_4;

public class B_Lesson_6_4 extends A_Lesson_6_4 {
    public B_Lesson_6_4(String nameOfField, int numberOfField, int numberOfRow) {
        super(nameOfField, numberOfField, numberOfRow);
        System.out.println("Printed from B_Lesson_6_4");
    }

    public void methodA2 () {
        System.out.println("methodB2 called.");
    }
    public void methodA3 () {
        super.methodA3();
        System.out.println("methodB3 called.");
    }
}
