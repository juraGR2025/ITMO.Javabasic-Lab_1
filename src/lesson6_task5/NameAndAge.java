package lesson6_task5;

import java.util.Scanner;

public class NameAndAge {
    //5.	Создайте главный класс. Добавьте в него:
    //●	метод для получения возраста пользователя;
    //Создайте класс-наследник. Добавьте в него:
    //●	переопределенный метод для получения имени пользователя;
    //Создайте объект на основе класса-наследника и используйте для него метод из класса.
    //Подсказка: подумайте над переменными, так как объект класса Scanner удобнее создать лишь один раз в главном классе

    private int age;
    public Scanner scanner = new Scanner(System.in);

    public void setAge() {
        System.out.println("Введите свой возраст: ");
        age = scanner.nextInt();
    }

    public int getAge() {
        return age;
    }
}
