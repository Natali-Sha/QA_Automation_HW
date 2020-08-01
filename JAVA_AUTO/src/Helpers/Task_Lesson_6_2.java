package Helpers;

public class Task_Lesson_6_2 {
    public static void main(String[] args) {
        OfficeManager_Lesson_6_2 office = new OfficeManager_Lesson_6_2();
        office.printMe();

        Cleaner_Lesson_6_2 clean = new Cleaner_Lesson_6_2();
        clean.printMe();

        HR_Lesson_6_2 recruiter = new HR_Lesson_6_2();
        recruiter.printMe();

        Programmer_Lesson_6_2 programmer = new Programmer_Lesson_6_2();
        programmer.printMe();

        ProjectManager_Lesson_6_2 PM = new ProjectManager_Lesson_6_2();
        PM.printMe();


        IT_Lesson_6_2 IT = new IT_Lesson_6_2() {
            @Override
            public void printMe() {
                System.out.println(strIT + ". IT specialist created");
                System.out.println("------------------");
            }
        };

        IT.printMe();

        Clerk_Lesson_6_2 clerk = new Clerk_Lesson_6_2() {
            @Override
            public void printMe() {
                System.out.println(strClerk + ". Clerk created");
                System.out.println("------------------");
            }
        };

        clerk.printMe();

        Worker_Lesson_6_2 work = new Worker_Lesson_6_2()
        {
            @Override
            public void printMe() {
                System.out.println(strWorker + ". Worker created");
                System.out.println("------------------");
            }
        };

        work.printMe();

    }

    }
