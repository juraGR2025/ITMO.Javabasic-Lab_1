package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class GameswithNumbers {
    public static void main(String[] args) {
        //Напишите программу, которая выводит на консоль нечетные числа
        //  от 1 до 99. Каждое число печается с новой стороки.
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println("Нечетное: " + i);
            }
        }
        // Напишите программу, которая выводит числа от 1 до 100, которые
        // делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
        for (int i = 0; i < 100; i++) {
            if(i%3==0){
                System.out.println("Делится на 3: " + i);
            }
            if(i%5==0){
                System.out.println("Делится на 5: " + i);
            }
            if(i%3==0 && i%5==0){
                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
        //Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
        // если сумма равна третьему целому числу.
        Scanner scanner = new Scanner(System.in);
        int numb1 = 0;
        int numb2 = 0;
        int numb3 = 0;
        System.out.println("Введите первое число:");
        if(scanner.hasNext()){
            numb1 = scanner.nextInt();
        }
        System.out.println("Введите второе число:");
        if(scanner.hasNext()){
            numb2 = scanner.nextInt();
        }
        System.out.println("Введите третье число:");
        if(scanner.hasNext()){
            numb3 = scanner.nextInt();
        }
        if (numb3 == numb1+numb2) {
            System.out.println("Результат: true");
        }
        else System.out.println("Результат: false");
        //Напишите программу, чтобы проверить, появляется ли число 3
        // как первый или последний элемент массива целых чисел.
        // Длина массива должна быть больше или равна двум.
        int[] arrayInt = {14, 2, 34, 4, 56, 4, 8, 77, 33};
        System.out.println("arrayInt = " + Arrays.toString(arrayInt));
        if(arrayInt[0] == 3 || arrayInt[arrayInt.length-1] == 3){
            System.out.println("true");
        }
        else System.out.println("Результат: false");
        //Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
        int flag = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i]==1 || arrayInt[i]==3){
                flag = 1;
            }
        }
        if(flag == 1) System.out.println("Содержит!");
        else System.out.println("1 или 3 не найдены...");
    }
}
