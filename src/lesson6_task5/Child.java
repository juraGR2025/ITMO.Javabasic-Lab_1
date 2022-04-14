package lesson6_task5;

public class Child extends NameAndAge{
    //Создайте класс-наследник. Добавьте в него:
    //●	переопределенный метод для получения имени пользователя;
    //Создайте объект на основе класса-наследника и используйте для него метод из класса.
    //Подсказка: подумайте над переменными, так как объект класса Scanner удобнее создать лишь один раз в главном классе
    private String name;

    @Override
    public void setAge() {
        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите имя пользователя:");
        name = scanner.next();
        System.out.println("Возраст пользователя:" + age);
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.setAge();
        System.out.println("Имя пользователя:" + child.getName());
    }
}
