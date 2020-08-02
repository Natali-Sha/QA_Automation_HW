package Lesson_7_3;

public class MyDevice_Lesson_7_3 implements State_Lesson_7_3, Volume_Lesson_7_3 {
    double value;

   public void changeVolume(double value) {
       this.value = 30.86;
       System.out.println("Value equals - " + this.value);
   }

    public void on(){
           System.out.println("On was run");
    }

    public void off(){
        System.out.println("Off was run");
    }
}
