package lesson7;
//1.Создайте класс Самолет. В классе создайте вложенный класс крыло. Внутри класса Крыло реализуйте:
//●	поле для хранения информации про вес крыла;
//●	метод, что будет показывать вес крыла.
public class Plane {
class AirplaneWing{
    Integer wingweight = 0;

    public Integer getWingweight() {
        return wingweight;
    }

    public void setWingweight(Integer wingweight) {
        this.wingweight = wingweight;
    }

    public Integer showwingweight(){

    return wingweight;
}
}
//2.В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла,
// а также выведите информацию на экран. Создайте два объекта и добавьте разный вес для крыльев.
    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane.AirplaneWing planeWing = plane.new AirplaneWing();
        planeWing.wingweight = 100;
        System.out.println("Вес крыла самолета = " + planeWing.wingweight);
        Plane.AirplaneWing planeWing2 = plane.new AirplaneWing();
        planeWing2.setWingweight(150);
        System.out.println("Вес крыла 2 самолета = " + planeWing2.getWingweight());
        Plane.AirplaneWing planeWing3 = plane.new AirplaneWing();
        planeWing2.setWingweight(50);
        System.out.println("Вес крыла 3 самолета = " + planeWing2.showwingweight());
    }
}
