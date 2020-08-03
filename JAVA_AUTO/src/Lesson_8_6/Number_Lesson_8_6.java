package Lesson_8_6;
import java.util.Scanner;

public class Number_Lesson_8_6 {
    int[] intArray= new int[100];
    int i = 0;
    public void readData() {

        Scanner in = new Scanner(System.in);
        try {
            while (true) {

                System.out.println("Enter a number: ");
                intArray[i] = in.nextInt();
                System.out.println("Your number: " + intArray[i]);
                i++;
            }
        } catch (Exception e){
            System.out.println("Your entered not a number.");
            System.out.println("An exception was thrown - " + e);
            System.out.println("Your input was:");
            for (int count = 0; count <= i - 1; count++){
                System.out.println(intArray[count]);
            }
        }
    }
}