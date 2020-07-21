package Helpers;

    public class Test_Lesson_4_5 {
        int firstInt;
        int secondInt;
        String thirdString;


        public Test_Lesson_4_5(String thirdString) {
            this.thirdString = thirdString;
            System.out.println("constructor with one arg. thirdString - " + this.thirdString);
        }

        public Test_Lesson_4_5(String thirdString, int firstInt) {
            this(thirdString);
            this.firstInt = firstInt;
            System.out.println("constructor with two args. firstInt - " + this.firstInt);
        }

        public Test_Lesson_4_5(String thirdString, int firstInt, int secondInt) {
            this(thirdString, firstInt);
            this.secondInt = secondInt;
            System.out.println("constructor with three args. secondInt - " + this.secondInt);
        }

       public void print_4_5(){
            System.out.println("Object thirdString - "+this.thirdString);
           System.out.println("Object firstInt - "+this.firstInt);
           System.out.println("Object secondInt - "+this.secondInt);

       }
    }

