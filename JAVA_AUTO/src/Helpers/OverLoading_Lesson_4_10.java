package Helpers;

public class OverLoading_Lesson_4_10 {

        public void over(double a) {
            System.out.println("test(double) was called - " + a);
        }
        public void over(String b) {
        System.out.println("test(int) was called - " + b);
        }

        public void over(String d, String e) {
            System.out.println("test(int, int) was called - " + d + " " + e);
        }

        public void over(double a, double c) {
            System.out.println("test(double, double) was called - " + a + " "+ c);
        }
    }




