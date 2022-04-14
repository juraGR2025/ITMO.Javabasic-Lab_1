package lesson6_task3;

public class Truck extends Car{
    private int numOfWheels;
    private int maxWeight;
    public  void newNumWheels(int numberOfWheels){
        this.numOfWheels = numberOfWheels;
        System.out.println("Новое значение количества колёс: " + numOfWheels);
    }
    public Truck(int w, String m, char c, float s, int numberOfWheels, int maxWeight) {
        super(w, m, c, s);
        this.numOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }
}
