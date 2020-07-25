package PrivateAccess_Lesson_5_5;

public class PrivateAccess_Lesson_5_5{
        int pr1;
        int pr2;
    {
        System.out.println(" PrivateAccess_Lesson_5_5 object Created");
    }

    private PrivateAccess_Lesson_5_5 (int pr1,int pr2) {
        this.pr1 = pr1;
        this.pr2 = pr2;
        System.out.println("Public constructor created PublicAccess_Lesson_5_4 object with int p1 = " + this.pr1 + " and int p2 = " + this.pr2 );
        System.out.println("------------------");
    }
}

