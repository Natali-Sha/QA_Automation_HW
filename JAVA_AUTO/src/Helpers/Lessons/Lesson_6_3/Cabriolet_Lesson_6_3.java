package Helpers.Lessons.Lesson_6_3;

public class Cabriolet_Lesson_6_3 extends Car_Lesson_6_3 {
    private boolean roofFolded;

    public Cabriolet_Lesson_6_3(String name, String size, int gear, boolean roofFolded) {
        super(name, size, gear);
        this.roofFolded = roofFolded;
    }

    public void convertRoof(boolean roofFolded) {
        this.roofFolded = roofFolded;
        System.out.println("Currently roof folded - " + this.roofFolded);
    }
    public boolean getRoofFolded() {
        return roofFolded;
    }
}