package lesson5;

import java.util.Scanner;

public class Stringclass {
    //1.Написать метод для поиска самой длинной строки.
    public static void stringComparison(){
        String [] str = new String[4];
        str[0] = "1 строка==============";
        str[1] = "2 строка";
        str[2] = "Другая строка";
        str[3] = "Еще одна строка";
        String longstr = str[0];
        for (int i = 0; i < str.length; i++) {
            if (i<str.length-1){
                if(str[i+1].length() > longstr.length()){
                    longstr = str[i+1];
                }
            }
        }
System.out.println("Самая длинная строка: " + longstr);
    }
//2.Написать метод, который проверяет является ли слово палиндромом.
public static void wordPalindrome(){
        String str = "str";
        String rts;

    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNext()) {
        str = scanner.next();
    }

    StringBuilder builder = new StringBuilder(str);
    rts = builder.reverse().toString();

    if(str.equals(rts))System.out.println("Палиндром!");
    else System.out.println("Никакой не палиндром!");
}
//3.Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
public static void byakiSearch(){
        String text = "Бяка! Бяка! Бяка! И снова: не то! И бяка! И бяка! И опять бяка!";
        String[]str = text.split(" ");

        StringBuilder builder = new StringBuilder();
        String buffer1, buffer2;
    for (int i = 0; i < str.length; i++) {
        if(str[i].length() >= 4){
            buffer1 = str[i].substring(0, 4);
             if(buffer1.equalsIgnoreCase("бяка")){
                 buffer2 = str[i].substring(4);
                 str[i] = "[вырезано цензурой]" + buffer2;
            }
        }
    }

    for(String s1:str){
        builder.append(s1)
                .append(" ");
    }
    System.out.println(builder.toString());
}
//4.Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
public static void stringSearch(){
        String s1 = "Имеются две строки. Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую. Имеются две строки. Имеются две строки.";
        String s2 = "Имеются две строки.";
        int count = 0;

    for (int indexS = s1.indexOf(s2); indexS >= 0; indexS = s1.indexOf(s2, indexS + 1))
        count++;//Не понимаю почему, но это работает...
    System.out.println("Количество повторений: ");
    System.out.println(count);
}
//5.Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
    //Тестовая строка: This is a test string
    public static void invertingAstring(){
        String test = "This is a test string";
        String[]str = test.split(" ");

        for (int i = 0; i < str.length; i++) {
            StringBuilder builder = new StringBuilder(str[i]);
            str[i] = builder.reverse().toString();
        }

        StringBuilder builder = new StringBuilder();
        for(String s1:str){
            builder.append(s1)
                    .append(" ");
        }
        System.out.println("This is a test string");
        System.out.println(builder.toString());

    }
    public static void main(String[] args) {
        //stringComparison();
        //wordPalindrome();
        //byakiSearch();
        //stringSearch();
        invertingAstring();
    }
}
