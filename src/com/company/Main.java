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
        Calculator calc = new Calculator();//
        System.out.println("Следующий урок");
        System.out.println("Введите 1 слагаемое:");
        if(scanner.hasNext()){
            calc.sum(scanner.nextDouble(), scanner.nextDouble());
        }

    }
}
