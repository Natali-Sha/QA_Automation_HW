package Helpers;

 class CTO_Lesson_6_2 extends IT_Lesson_6_2 {
    {
        System.out.println("CTO created");
        System.out.println("------------------");
    }

    private String strCTO = "I am technical director";
    public void printMe() {
        System.out.println(this.strWorker);
        System.out.println(this.strIT);
        System.out.println(this.strCTO);
        System.out.println("------------------");
    }
}
