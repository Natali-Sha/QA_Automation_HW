package Helpers;

public class Change_Lesson_5_11 {
    private static int staticField;
    private int nonStaticField;

    public static void setStatic(int newStaticField) {
    staticField = newStaticField;
    }

    public void setNonStatic(int newNonStaticField) {
        nonStaticField = newNonStaticField;
    }
    public static int getStatic(){
        return staticField;
    }
    public int getNonStaticField(){
        return nonStaticField;
    }
}

