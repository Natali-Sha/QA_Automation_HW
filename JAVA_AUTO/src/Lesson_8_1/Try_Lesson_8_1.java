package Lesson_8_1;

public class Try_Lesson_8_1 {
    public int number;
    public Try_Lesson_8_1(int number){
        this.number = number;
    }
        public void checkNumber() {
            if (number < 0) {
                System.out.println("Number < 0");
            } else if (number > 0) {
                System.out.println("Number > 0");
            }
            else if (number == 0){
                try {
                throw new MyException_Lesson_8_1(number);
                } catch (MyException_Lesson_8_1 ex) {
                    System.out.println(ex);
                }
            }
        }

    public void setNumber(int number){
        this.number = number;
    }
}
