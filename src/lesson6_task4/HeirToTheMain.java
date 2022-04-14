package lesson6_task4;

public class HeirToTheMain extends ChiefAndHeir{
    public void outNumber(){
        System.out.println("Пользователь ввел: " + getNumber());
    }
    public static void main(String[] args) {
        HeirToTheMain child = new HeirToTheMain();
        child.setNumber();
        child.outNumber();
    }
}
