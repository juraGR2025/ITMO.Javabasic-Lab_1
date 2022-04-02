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
            divisible = scanner.nextDouble();
        }
        System.out.println("Введите делитель:");
        if(scanner.hasNext()){
            divider = scanner.nextDouble();
        }
        divisibleLong = (long) divisible;
        dividerLong = (long) divider;
        divisibleInt = (int) divisible;
        dividerInt = (int) divider;
        calc.div(divisible, divider);
        calc.div(divisibleLong, dividerLong);
        calc.div(divisibleInt, dividerInt);
        //Умножение
        double multipli1 = 0, multipli2 = 0;
        long multipliLong1 = 0L, multipliLong2 = 0L;
        int multipliInt1 = 0, multipliInt2 = 0;
        System.out.println("Введите 1 множитель:");
        if(scanner.hasNext()){
            multipli1 = scanner.nextDouble();
        }
        System.out.println("Введите 2 множитель:");
        if(scanner.hasNext()){
            multipli2 = scanner.nextDouble();
        }
        multipliLong1 = (long) multipli1;
        multipliLong2 = (long) multipli2;
        multipliInt1 = (int) multipli1;
        multipliInt2 = (int) multipli2;
        calc.multiplication(multipli1, multipli2);
        calc.multiplication(multipliLong1, multipliLong2);
        calc.multiplication(multipliInt1, multipliInt2);

        //Вычитание
        double number1 = 0, number2 = 0;
        long numberLong1 = 0L, numberLong2 = 0L;
        int numberInt1 = 0, numberInt2 = 0;
        System.out.println("Займемся вычитанием!");
        System.out.println("Введите 1 число:");
        if(scanner.hasNext()){
            number1 = scanner.nextDouble();
        }
        System.out.println("Введите 2 число:");
        if(scanner.hasNext()){
            number2 = scanner.nextDouble();
        }
        numberLong1 = (long) number1;
        numberLong2 = (long) number2;
        numberInt1 = (int) number1;
        numberInt2 = (int) number2;
        calc.subtraction(number1, number2);
        calc.subtraction(numberLong1, numberLong2);
        calc.subtraction(numberInt1, numberInt2);

        System.out.println("Определяем класс Person");
        class Person{

            String lastname;//Фамилия
            String firstname;//Имя
            String patronymic;//Отчество
            int age;        // Возраст
            double height;//Рост
            double weight;//Вес
            public void Person()
            {
                lastname = "Undefined";
                age = 22;
                System.out.println("По умолчанию Person это " + lastname + ", " + age + " года");
            }
            public void fullperson(String l, String f, String p, int a, double b, double c)
            {
                lastname = l;
                firstname = f;
                patronymic = p;
                age = a;
                height = b;
                weight = c;
                System.out.println(l);
                System.out.println(f);
                System.out.println(p);
                System.out.println("Возраст: " + a);
                System.out.println("Рост: " + b);
                System.out.println("Вес: " + c);
            }
        }
        Person person = new Person();//Создается экземпляр класса Person
        System.out.println("Определяем параметры для класса Person");
        String lastname = null;//Фамилия
        String firstname = null;//Имя
        String patronymic = null;//Отчество
        int age = 2;        // Возраст
        double height = 180;//Рост
        double weight = 99;//Вес

        System.out.println("Введите фамилию:");
        if(scanner.hasNext()){
            lastname = scanner.next();
        }
        System.out.println("Введите имя:");
        if(scanner.hasNext()){
            firstname = scanner.next();
        }
        System.out.println("Введите возраст:");
        if(scanner.hasNext()){
            age = scanner.nextInt();
        }
        person.fullperson(lastname, firstname, patronymic, age, height, weight);
}
}
