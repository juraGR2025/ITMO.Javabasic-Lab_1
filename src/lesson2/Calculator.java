package lesson2;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    public void sum(){}//Сумма
    public void sum(Double a, Double b){
        System.out.println("Введите 1 слагаемое:");
        if(scanner.hasNext()){
            a = scanner.nextDouble();
        }
        System.out.println("Введите 2 слагаемое:");
        if(scanner.hasNext()){
            b = scanner.nextDouble();
        }

        System.out.println("Sum = " + (a+b));

    }
    public void sum(Long a, Long b){

    }
    public void sum(Integer a, Integer b){

    }
    public void division(){}//Деление
    public void multiplication(){}//Умножение
    public void subtraction(){}//Вычитание

}
