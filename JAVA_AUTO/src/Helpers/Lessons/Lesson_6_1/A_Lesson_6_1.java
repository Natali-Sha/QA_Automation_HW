package Helpers.Lessons.Lesson_6_1;

public class A_Lesson_6_1 {
    public int aField;
    public B_Lesson_6_1 bField;
    public C_Lesson_6_1 cField;

    public void aPrint (int aField, B_Lesson_6_1 bField, C_Lesson_6_1 cField){
       System.out.println("aField - " + aField);
       System.out.println("bField 1 - " + bField.bFirstField);
       System.out.println("bField 2 - " + bField.bSecondField);
       System.out.println("bField 3 - " + bField.bThirdField);

       System.out.println("cField 1 - " + cField.cFirstField);
       System.out.println("cField 2 - " + cField.cSecondField);
    }
}
