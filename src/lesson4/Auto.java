package lesson4;

public class Auto {
    //Создайте простой класс, который будет иметь поля: цвет, название, вес. Создайте метод
    //в классе через который можно будет вывести все эти данные. Добавьте два объекта,
    // установите для них значения и выведите все при помощи ранее созданного метода.
    // Также добавьте несколько конструкторов, которые будут устанавливать:
    //●	только цвет машины;
    //●	цвет и вес машины;
    //●	и пустой конструктор.
    private String color;
    private String Name;
    private String str;
    private Integer weight;
//Создаем конструкторы.
    public Auto(String s) {//Конструктор, который устанавливает цвет машины;
        color = s;
    }
    public Auto(String s, Integer w) {//Конструктор, который устанавливает цвет и вес машины;
        color = s;
        weight = w;
    }
    public Auto() {}//Пустой конструктор

    public Auto(String c, String n, Integer w) {//Конструктор для всех полей класса;
        color = c;
        Name = n;
        weight = w;
    }

    public String outputAuto(){
        str = "Цвет машины: " + color + "." + " Марка машины: " + Name +
                "." + " Вес: " + weight;
        return this.str;
    }
    //Создаются геттеры и сеттеры

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        //Добавляем два объекта
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto1.setColor("red");//Установка полей через сеттеры.
        auto1.setName("Audi");
        auto1.setWeight(1500);

        auto2.setColor("Blue");
        auto2.setName("Chevrolet");
        auto2.setWeight(1890);

System.out.println(auto1.outputAuto());//Выводим присвоенные значения
System.out.println(auto2.outputAuto());
    }
}
