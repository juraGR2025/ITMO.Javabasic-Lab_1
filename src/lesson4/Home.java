package lesson4;

import java.util.Calendar;
import java.util.Scanner;

//Создайте класс Дом. Добавьте в него следующие данные:
//●	поля: количество этажей, год постройки, наименование;
//●	метод для установки всех значений;
//●	метод для вывода всех значений;
//●	метод, возвращающий количество лет с момента постройки.
//
//На основе класса создайте два объекта и пропишите для каждого характеристики. Добавление характеристик реализуйте через метод класса.
//
//Выведите информацию про каждый объект.
public class Home {
    private Integer floorsNumber;
    private Integer constructionYear;
    private String Name;
    private String str;
    private Integer time;

    public void settingMethod(Integer f, Integer c, String N){
        floorsNumber = f;
        constructionYear = c;
        Name = N;
    }
    public String outputHome(){
        str = "Количество этажей: " + floorsNumber + "." + " Год постройки: " + constructionYear +
                "." + " Наименование: " + Name;
        return this.str;
    }
    public Integer existenceTime(Integer c){
        constructionYear = c;

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        time = year - constructionYear;
        return this.time;
    }
    public static void main(String[] args) {
        Home home1 = new Home();
        Home home2 = new Home();
        System.out.println("Введите количество этажей:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            home1.floorsNumber = scanner.nextInt();
        }
        System.out.println("Введите год постройки:");
        if(scanner.hasNext()){
            home1.constructionYear = scanner.nextInt();
        }
        System.out.println("Введите наименование дома:");
        if(scanner.hasNext()){
            home1.Name = scanner.next();
        }
        System.out.println("Прошло времени с начала постройки 1 дома:");
        System.out.print(home1.existenceTime(home1.constructionYear));
        System.out.println(" лет");

        int floor = 0;
        int  constructY = 0;
        String Name = null;
        String str;
        int  tm;
        System.out.println("Введите количество этажей:");
        if(scanner.hasNext()){
            floor = scanner.nextInt();
        }
        System.out.println("Введите год постройки:");
        if(scanner.hasNext()){
            constructY = scanner.nextInt();
        }
        System.out.println("Введите наименование дома:");
        if(scanner.hasNext()){
            Name = scanner.next();
        }
        home2.settingMethod(floor, constructY, Name);
        System.out.println("Прошло времени с начала постройки 2 дома:");
        System.out.print(home2.existenceTime(home2.constructionYear));
        System.out.println(" лет");

        System.out.println(home1.outputHome());
        System.out.println(home2.outputHome());

    }
}
