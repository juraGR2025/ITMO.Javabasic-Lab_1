package com.company;

import java.util.Scanner;
import lesson2.Calculator;

public class Main {

    public static void main(String[] args) {

	// write your code here
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
        System.out.println();

        double res = (46+10)*(10/3);
        System.out.println("res = " + res);
        System.out.println();
        int res2 = 29*4*(-15);
        System.out.println("res2 = " + res2);
        System.out.println();

        int number = 10500;
        double result = (number/10)/10;
        System.out.println("result = " + result);
        System.out.println();

        result = 3.6*4.1*5.9;
        System.out.println("result2 = " + result);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.nextInt());

            int b = scanner.nextInt();
            if(b%2 == 0){
                System.out.println("Четное");
            }
            if(b%2 != 0){
                System.out.println("Нечетное");
            }
            if(b%2 == 0 && b > 100){
                System.out.println("Выход за пределы диапазона");
            }

        }
        Calculator calc = new Calculator();//Создается экземпляр класса Calculator
        System.out.println("Задание № 2");
        double summand1 = 0, summand2 = 0;
        long summandLong1 = 0L, summandLong2 = 0L;
        int summandInt1 = 0, summandInt2 = 0;
        System.out.println("Введите 1 слагаемое:");
        if(scanner.hasNext()){
            summand1 = scanner.nextDouble();
        }
        System.out.println("Введите 2 слагаемое:");
        if(scanner.hasNext()){
            summand2 = scanner.nextDouble();
        }
        calc.sum(summand1, summand2);// Вызываются методы класса Calculator
        System.out.println("Введите 1 слагаемое:");
        if(scanner.hasNext()){
            summandLong1 = scanner.nextLong();
        }
        System.out.println("Введите 2 слагаемое:");
        if(scanner.hasNext()){
            summandLong2 = scanner.nextLong();
        }
        calc.sum(summandLong1, summandLong2);
        System.out.println("Введите 1 слагаемое:");
        if(scanner.hasNext()){
           summandInt1 = scanner.nextInt();
        }
        System.out.println("Введите 2 слагаемое:");
        if(scanner.hasNext()){
            summandInt2 = scanner.nextInt();
        }
        calc.sum(summandInt1, summandInt2);

        double divisible = 0, divider = 0;
        long divisibleLong = 0L, dividerLong = 0L;
        int divisibleInt = 0, dividerInt = 0;
        System.out.println("Введите делимое:");
        if(scanner.hasNext()){
            divisible = scanner.nextLong();
        }
        System.out.println("Введите делитель:");
        if(scanner.hasNext()){
            divider = scanner.nextLong();
        }
        divisibleLong = (long) divisible;
        dividerLong = (long) divider;
        divisibleInt = (int) divisible;
        dividerInt = (int) divider;
        calc.div(divisible, divider);
        calc.div(divisibleLong, dividerLong);
        calc.div(divisibleInt, dividerInt);
    }
}
