package lesson1;

public class Person{//Создал класс, который определяет какую-либо сущность (Person)
    //Определил поля класса:
    private String lastname;//Фамилия
    private String firstname;//Имя
    private String patronymic;//Отчество
    private int age;        // Возраст
    private double height;//Рост
    private double weight;//Вес

    public void Person() {//Конструктор по умолчанию.
        lastname = "Undefined";
        age = 22;
        System.out.println("По умолчанию Person это " + lastname + ", " + age + " года");
    }
    //Конструктор со всеми параметрами..
    public void Person(String l, String f, String p, int a, double b, double c) {
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

    public static void main(String[] args) {
        Person person = new Person();//Создается экземпляр класса Person
        //Определяем параметры Person
        person.age = 51;
        person.firstname = "Yuryi";
        person.lastname = "Gravchenko";
        //Выводим на экран
        System.out.println("Возраст: " + person.age);
        System.out.println("Имя: " + person.firstname);
        System.out.println("Фамилия: " + person.lastname);

    }
}
