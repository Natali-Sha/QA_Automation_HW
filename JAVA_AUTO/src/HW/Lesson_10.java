package HW;

import Helpers.Lessons.Lesson_10_1.Lesson_10_1_readToSet;
import Helpers.Lessons.Lesson_10_2.Lesson_10_2_countRepetitions;

public class Lesson_10 {
    public static void main(String[] args)  {

        Lesson_10_1_readToSet read = new Lesson_10_1_readToSet();
        read.readFile("var/alice.txt");


        Lesson_10_2_countRepetitions read2 = new Lesson_10_2_countRepetitions();
        read2.readFile("var/alice.txt");
    }
}
