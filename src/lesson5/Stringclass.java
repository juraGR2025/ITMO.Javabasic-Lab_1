package lesson5;

public class Stringclass {
    //1.Написать метод для поиска самой длинной строки.
    public static void stringComparison(){
        String [] str = new String[4];
        str[0] = "1 строка";
        str[1] = "2 строка==============";
        str[2] = "Другая строка";
        str[3] = "Еще одна строка";
        String longstr = str[0];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Длина строки: " + str[i].length());
            if (i<str.length-1){
                if(str[i+1].length() > longstr.length()){
                    longstr = str[i+1];
                }
            }
        }
System.out.println("Самая длинная строка: " + longstr);
    }
//2.Написать метод, который проверяет является ли слово палиндромом.



    public static void main(String[] args) {
        stringComparison();
    }
}
