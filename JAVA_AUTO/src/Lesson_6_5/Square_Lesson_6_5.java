package Lesson_6_5;

public class Square_Lesson_6_5 extends Figure_Lesson_6_5 {
    public Square_Lesson_6_5(int height, int width) {
        this.height = height;
        this.width = width;

    }
    public void calculateArea () {
     System.out.println( "calculateArea - " +  width * height);
    }
}
