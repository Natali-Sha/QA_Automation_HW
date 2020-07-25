package PublicAccess_Lesson_5_4;

public class PublicAccess_Lesson_5_4 {
    int p1;
    int p2;
    {
        System.out.println("PublicAccess_Lesson_5_4 object Created");
    }
    public PublicAccess_Lesson_5_4 (int p1,int p2) {
        this.p1 = p1;
        this.p2 = p2;
        System.out.println("Public constructor created PublicAccess_Lesson_5_4 object with int p1 = " + this.p1 + " and int p2 = " + this.p2 );
        System.out.println("------------------");
    }
}
