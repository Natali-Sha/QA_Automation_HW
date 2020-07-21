package Helpers;

public class Recursive_Lesson_4_9 {
        private int i = 31;
        private char unicode;
        public void p() {
            i++;
            if (i <= 124) {
                unicode = (char) i;
                System.out.print(unicode + " ");
                if (i%31 == 0){
                    System.out.println();
                }
                p();
            }
        }
    }
