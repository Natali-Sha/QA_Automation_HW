package Helpers.Lessons.Lesson_6_4;

public class A_Lesson_6_4 {

    public String nameOfField;
    public int numberOfField;
    public int numberOfRow;

    public A_Lesson_6_4(String nameOfField, int numberOfField, int numberOfRow) {
        this.nameOfField = nameOfField;
        this.numberOfField = numberOfField;
        this.numberOfRow = numberOfRow;
        System.out.println("Printed from A_Lesson_6_4");
        System.out.println("Name of field - " + nameOfField );
        System.out.println("Number of field - " + numberOfField );
        System.out.println("Number of row - " + numberOfRow );
        System.out.println("------------------");


    }

    public void methodA2 () {
        System.out.println("methodA2 called.");
    }
    public void methodA3 () {
        System.out.println("methodA3 called.");
    }





//    public String getNameOfField(){
//        return nameOfField;
//    }
//
//    public int getNumberOfField(){
//        return numberOfField;
//    }
//
//    public int getNumberOfRow(){
//        return numberOfRow;
//    }
//


}
