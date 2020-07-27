package Helpers;

public class Getter_Lesson_5_8 {
    private String a = "test";
    private int b = 10 ;
    private int c = 11;
    private int d = 12;
    private int e = 13;

    public Getter_Lesson_5_8 () {
    }
    public String getValue_1() {
        return a;
    }
    public int getValue_2() {
        return b;
    }
    public int getValue_3() {
        return c;
    }
    public int getValue_4() {
        return d;
    }
    public int getValue_5() {
        return e;
    }
    public void setValue(String newA, int newB, int newC, int newD, int newE) {
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
    }
}
