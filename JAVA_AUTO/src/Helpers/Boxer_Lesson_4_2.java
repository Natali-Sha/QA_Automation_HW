package Helpers;

public class Boxer_Lesson_4_2 {
    public int age;
    public int weight;
    public int strength;

    public Boxer_Lesson_4_2(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public boolean fight(Boxer_Lesson_4_2 anotherBoxer) {
            // write your code here
        double enemyAge =  anotherBoxer.age;
        double enemyWeight =  anotherBoxer.weight;
        double enemyStrength =  anotherBoxer.strength;
        double ageC = enemyAge/this.age;
//         System.out.println(ageC);
         double weightC = this.weight / enemyWeight;
//         System.out.println(weightC);
         double strengthC = this.strength / enemyStrength;
//         System.out.println(strengthC);

         if (ageC * weightC * strengthC > 1) {
             return true;
         }
        else {
            return false;
         }
    }
}