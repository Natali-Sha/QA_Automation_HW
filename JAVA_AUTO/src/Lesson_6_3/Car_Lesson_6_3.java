package Lesson_6_3;

 class Car_Lesson_6_3 extends Vehicle_Lesson_6_3{
     private int gear;

     public Car_Lesson_6_3(String name, String size, int gear) {
         super(name, size);
         this.gear = gear;
     }
     public void changeGear(int gear) {
         this.gear = gear;
         System.out.println("Vehicle now at " + this.gear + " gear.");
     }

     public int getGear() {
         return gear;
     }
 }



