package lesson4;

import java.util.Calendar;
import java.util.Scanner;

//Создайте класс Дом. Добавьте в него следующие данные:
//●	поля: количество этажей, год постройки, наименование;
//●	метод для установки всех значений;
//●	метод для вывода всех значений;
//●	метод, возвращающий количество лет с момента постройки.
//
//На основе класса создайте два объекта и пропишите для каждого характеристики.
// Добавление характеристик реализуйте через метод класса.
//
//Выведите информацию про каждый объект.
public class Home {
    private Integer floorsNumber;
    private Integer constructionYear;
    private String Name;
    private String str;
    private Integer time;
//метод для установки всех значений:
    public void settingMethod(Integer f, Integer c, String N){
        floorsNumber = f;
        constructionYear = c;
        Name = N;
    }
    //Метод для вывода всех значений
    public String outputHome(){
        str = "Количество этажей: " + floorsNumber + "." + " Год постройки: " + constructionYear +
                "." + " Наименование: " + Name;
        return this.str;
    }
    //Метод, возвращающий количество лет с момента постройки.
    public Integer existenceTime(Integer c){
        constructionYear = c;

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        time = year - constructionYear;
        return this.time;
    }
    //метод для установки всех значений
    public void buildingAhouse() {
        System.out.println("Введите количество этажей:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            floorsNumber = scanner.nextInt();
        }
        System.out.println("Введите год постройки:");
        if(scanner.hasNext()){
            constructionYear = scanner.nextInt();
        }
        System.out.println("Введите наименование дома:");
        if(scanner.hasNext()){
            Name = scanner.next();
        }
        System.out.println("Прошло времени с начала постройки " + Name + " дома:");
        System.out.print(existenceTime(constructionYear));
        System.out.println(" лет");
    }


    public static void main(String[] args) {
        Home home1 = new Home();
        Home home2 = new Home();
        Home home3 = new Home();
        home1.buildingAhouse();
        home3.buildingAhouse();

        home2.settingMethod(5, 1966, "Панельный");
        System.out.println("Прошло времени с начала постройки 2 дома:");
        System.out.print(home2.existenceTime(home2.constructionYear));
        System.out.println(" лет");

        System.out.println(home1.outputHome());
        System.out.println(home2.outputHome());

    }
}
