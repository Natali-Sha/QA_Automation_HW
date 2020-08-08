package Helpers.Lessons.Lesson_7_2;

public class FahrenheitConverter_Lesson_7_2 {
    private double fahrenheit;
    public void convert(double celsius){
        this.fahrenheit = (celsius * 9 / 5) + 32 ;
        System.out.println(celsius + " Celsius equals - " + fahrenheit + " Fahrenheit.");

    }
}
