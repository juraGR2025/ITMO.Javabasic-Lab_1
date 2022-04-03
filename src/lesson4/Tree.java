package lesson4;
//Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
//●	Конструктор, который устанавливает только возраст и название;
//●	Конструктор, который устанавливает все переменные в классе;
//●	Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
//Создайте три объекта на основе класса и используйте по одному конструктору на каждый.

public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String Name;
    String str;

    public Tree(Integer a, String n) {//Конструктор, который устанавливает возраст и название;
        age = a;
        Name = n;
    }
    public Tree(Integer a, Boolean isA, String n) {//Конструктор, который устанавливает все переменные в классе;
        age = a;
        isAlive = isA;
        Name = n;
    }
    public Tree() {//Пустой конструктор
        System.out.println("Пустой конструктор без параметров сработал");
    }
    public String treeInform() {
    str = "Вот дерево " + Name + ". " + "Живое? (" + isAlive +
        "). Возраст " + age + " лет";
        return this.str;
    }
    public static void main(String[] args) {
        Tree tree1 = new Tree(7, "dub");
        Tree tree2 = new Tree(12, true,"lipa");
        Tree tree3 = new Tree();
        System.out.println(tree1.treeInform());
        System.out.println(tree2.treeInform());
        System.out.println(tree3.toString());
    }
}
