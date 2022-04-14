package lesson6_task4;

import java.util.Scanner;

public class ChiefAndHeir {
    //4.Создайте два класса: главный и класс-наследник.
    //В главном классе:
    //●	создайте поле для ввода целого числа;
    //В классе-наследнике:
    //●	метод для вывода переменной из главного класса.
    //Создайте объект на основе класса наследника и выведите через метод переменную с главного класса.
    private int number;

    public void setNumber() {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            number = scanner.nextInt();
        }
    }
    public int getNumber(){
        return number;
    }
}
