package Lesson_7_2;

public class KelvinConverter_Lesson_7_2 implements Converter_Lesson_7_2 {
    private double kelvin;
    public void convert(double celsius){
        this.kelvin = celsius + 273.15;
        System.out.println(celsius + " Celsius equals - " + kelvin + " Kelvin.");

    }
}
