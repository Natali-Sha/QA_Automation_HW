package ThirdPack_Lesson_5_3;

public class TestClass1_Lesson_5_3 {
    int a;
    int b;
    {
        System.out.println("TestClass1 object Created");
    }

    public TestClass1_Lesson_5_3 (int a,int b) {
        this(a);
        this.b = b;
        System.out.println("Public constructor created TestClass1 object with int a = " + this.a + " and int b = " + this.b );
        System.out.println("------------------");

    }

    TestClass1_Lesson_5_3 (int a) {
        this.a = a;
        System.out.println("Package-private constructor created TestClass1 object with int a = " + this.a);

    }

}
