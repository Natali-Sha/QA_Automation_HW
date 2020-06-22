package Helpers;

import java.util.Scanner;

public class Calculator_Lesson_4_4 {
    Scanner input = new Scanner(System.in);
    double firstValue;
    double secondValue;
    String operation;
    Double result;


    public  void  userData (){
        System.out.println("Введите операцию (-,+, *, /): ");
        operation = input.nextLine();

    }
    public void getFirstValue() {
        System.out.println("Введите первое значение: ");
        if (input.hasNextDouble()) {
            firstValue = input.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            input.next();//рекурсия
            this.getFirstValue();
        }
    }

        public void getSecondValue() {
            System.out.println("Введите второе значение: ");
            if (input.hasNextDouble()) {
                secondValue = input.nextDouble();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                input.next();//рекурсия
                this.getSecondValue();
            }
        }
    public void getOperation() {
        System.out.println("Введите операцию:");

        operation = input.nextLine();
       operation = operation.trim();
        if (operation != null && !operation.isEmpty()){

        }
        else {
            System.out.println("Попробуйте еще раз (-,+, *, /):");
//            input.next();//рекурсия
            this.getOperation();
        }


//      System.out.println(operation instanceof String);
//      System.out.println(operation instanceof char);

    }
    public void calculate (){
        if (operation.equals("+")) {
            this.summ();
        } else if (operation.equals("-")) {
            this.minus();
        } else if (operation.equals("*")) {
            this.multiply();
        } else if (operation.equals("/")) {
            this.divide();
        } else {
            System.out.println("Введите верную операцию (-,+, *, /): ");

        }
    }

    public void summ() {
         double result = firstValue + secondValue;
         System.out.println("Результат: " + result);
        }

    public void minus() {
        double result = firstValue - secondValue;
        System.out.println("Результат: " + result);
    }

    public void multiply() {
        double result = firstValue * secondValue;
        System.out.println("Результат: " + result);
    }

    public void divide() {
        double result = firstValue / secondValue;
        System.out.println("Результат: " + result);
    }

    }






