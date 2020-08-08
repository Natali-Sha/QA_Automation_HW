package Helpers.Lessons.Lesson_8_1;


    public class MyException_Lesson_8_1 extends Exception {
        private int value;

        public MyException_Lesson_8_1(int d)
        {
            this.value = d;
        }

        public String toString()
        {
            return "MyException[" + this.value + "]";
        }
}
