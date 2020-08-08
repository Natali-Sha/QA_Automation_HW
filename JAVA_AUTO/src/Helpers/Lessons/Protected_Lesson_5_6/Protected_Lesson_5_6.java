package Helpers.Lessons.Protected_Lesson_5_6;

public class Protected_Lesson_5_6 {
    protected String name;

    protected Protected_Lesson_5_6 (String name) {
        this.name = name;
        System.out.println("Helpers.Lessons.Protected_Lesson_5_6 name - " + this.name);
    }

    protected String getName() {
        return name;
    }

}
