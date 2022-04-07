package lesson2;

public class Calculator {

    public void sum(){}//Сумма
    public void sum(Double a, Double b){
        System.out.println("Sum = " + (a+b));
    }
    public void sum(Long a, Long b){
        System.out.println("SumLong = " + (a+b));
    }
    public void sum(Integer a, Integer b){
        System.out.println("SumInteger = " + (a+b));
    }
    public void division(){}//Деление
    public void div(Double a, Double b){
        System.out.println("DivDouble = " + (a/b));
    }
    public void div(Long a, Long b){
        //При делении 2/3 будет 0 (дробная часть у отбрасывается)
        System.out.println("DivLong = " + (a*1.0/b));//А так получим Double.
    }
    public void div(Integer a, Integer b){
        //При делении 2/3 будет 0 (дробная часть отбрасывается)
        System.out.println("DivInteger = " + (a*1.0/b));//А так получим Double.
    }
    public void multiplication(){}//Умножение
    public void multiplication(Double a, Double b){
        System.out.println("multiplicationDouble = " + (a*b));
    }
    public void multiplication(Long a, Long b){
        System.out.println("multiplicationLong = " + (a*b));
    }
    public void multiplication(Integer a, Integer b){
        System.out.println("multiplicationInteger = " + (a*b));
    }

    public void subtraction(){}//Вычитание
    public void subtraction(Double a, Double b){
        System.out.println("subtractionDouble = " + (a-b));
    }
    public void subtraction(Long a, Long b){
        System.out.println("subtractionLong = " + (a-b));
    }
    public void subtraction(Integer a, Integer b){
        System.out.println("subtractionInteger = " + (a-b));
    }

}
