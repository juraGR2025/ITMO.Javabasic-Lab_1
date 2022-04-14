package lesson6;
//В класс Человек добавьте:
//●	поля: имя, фамилия;
//●	метод для получение имени;
//●	метод для получение фамилии;
//●	абстрактный метод для вывода всей информации;
//●	конструктор для установки значений.
public abstract class AbstractHuman {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract String getAll();

    public AbstractHuman(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
