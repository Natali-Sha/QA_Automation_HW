package Helpers;
import java.util.Random;

public class RandomNumber_Lesson_4_3 {
            Random rN = new Random(); // creating Random object
            int[] arr = new int[4];
            public int[] generateNumber() {
            for(int q = 0; q < arr.length; q++) {
                arr[q] = rN.nextInt(9999); // storing random integers in an array
//                System.out.println(arr[q]); // printing each array element
            }
                System.out.println("Card " + arr[3] + " generated.");
                System.out.println();
                return arr;
          }
        }