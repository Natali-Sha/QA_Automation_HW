package Helpers;

 class ProjectManager_Lesson_6_2 extends IT_Lesson_6_2 {
    {
        System.out.println("PM created");
        System.out.println("------------------");
    }

    private String strPM = "I am Project Manager";
    public void printMe() {
        System.out.println(this.strWorker);
        System.out.println(this.strIT);
        System.out.println(this.strPM);
        System.out.println("------------------");
    }
}
