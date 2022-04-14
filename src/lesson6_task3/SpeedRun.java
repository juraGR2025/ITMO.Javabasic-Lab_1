package lesson6_task3;

public class SpeedRun {
    public static void main(String[] args) {
        Truck truck = new Truck(6000, "Man", 'r', 100, 6,9500);
        truck.outPut();
        truck.newNumWheels(5);
    }
}
