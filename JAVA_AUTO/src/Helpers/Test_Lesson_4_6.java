package Helpers;

public class Test_Lesson_4_6 {
    int test1;
    int test2;
    int test3;

    public Test_Lesson_4_6(int test1) {
        this.test1 = test1;
        System.out.println("First arg. - " + this.test1);
    }

    public Test_Lesson_4_6(int test1, int test2 ) {
        this(test1);
        this.test2 = test2;
        System.out.println("Second arg. - " + this.test2);
    }

    public Test_Lesson_4_6(int test1, int test2, int test3) {
        this(test1, test2);
        this.test3 = test3;
        System.out.println("Third arg. - " + this.test3);

    }
}

