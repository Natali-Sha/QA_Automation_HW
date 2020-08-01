package Helpers;

 class OfficeManager_Lesson_6_2 extends Clerk_Lesson_6_2 {
     {
         System.out.println("Office Manager created");
         System.out.println("------------------");
     }

    private String strOM = "I am Office Manager";
    public void printMe() {
        System.out.println(this.strWorker);
        System.out.println(this.strClerk);
        System.out.println(this.strOM);
        System.out.println("------------------");
    }
}
