package lesson4sort;

import java.util.Random;
import java.util.Scanner;

public class BeSorted {
    //1. Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
    // Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
    public static void increasingSort(){//Сортировка по возрастанию
        //Создаем два массива
       int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 33};
       int[] array2;
       array2 = new int[12];
       //Заполняем второй массив случайными числами
       Random r = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = r.nextInt(100) ;
          }
        boolean flag = false;
        for (int i = 0; i < array1.length-1; i++) {
            if(array1[i] < array1[i+1]){
                flag = true;
                continue;
            }
            else {
                flag = false;
                break;
            }
        }
        System.out.println("Первый массив:");
        System.out.println((flag) ? "OK" : "Please, try again");
        //Проверяем второй массив
        flag = false;
        for (int i = 0; i < array2.length-1; i++) {
            if(array2[i] < array2[i+1]){
                flag = true;
                continue;
            }
            else {
                flag = false;
                break;
            }
        }
        //Вывод массива случайных чисел (на всякий случай)
        System.out.println("Массив случайных чисел: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();
        System.out.println("Второй массив:");
        System.out.println((flag) ? "OK" : "Please, try again");
    }
    //2. Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь
    //вводит цифру 4), затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.
    public static void manualArray(){
        System.out.println("Введите длину массива:");
        Scanner scanner = new Scanner(System.in);
        int arraysize = 0;//Переменная для длины массива
        if (scanner.hasNext()) {
            arraysize = scanner.nextInt();
        }
        //Инициализируем массив...
        int[] manualarray1 = new int[arraysize];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arraysize; i++) {
            if (scanner.hasNext()) {
                manualarray1[i] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arraysize; i++) {
            if(i==0)System.out.print("Result: [");
            if(i < arraysize-1)System.out.print(manualarray1[i] + ", ");
            if(i == arraysize-1)System.out.print(manualarray1[i] + "] ");
        }
    }
    //3. Напишите метод, который меняет местами первый и последний элемент массива.
    public static void replacingMethod(){

        int[] replacarray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100};
        int arraysize = replacarray1.length;
        for (int i = 0; i < arraysize; i++) {
            if(i==0)System.out.print("Array: [");
            if(i < arraysize-1)System.out.print(replacarray1[i] + ", ");
            if(i == arraysize-1)System.out.println(replacarray1[i] + "] ");
        }
        int buffer;
        buffer = replacarray1[0];
        replacarray1[0] = replacarray1[arraysize-1];
        replacarray1[arraysize-1] = buffer;
        for (int i = 0; i < arraysize; i++) {
            if(i==0)System.out.print("Result replacing: [");
            if(i < arraysize-1)System.out.print(replacarray1[i] + ", ");
            if(i == arraysize-1)System.out.print(replacarray1[i] + "] ");
        }
    }
    //4. Дан массив чисел. Найдите первое уникальное в этом массиве число.
    //Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
    public static void uniqueNumber(){
        boolean flag = false;
        int numb = 0;
        int[] uniquearray = {3, 3, 3, 5, 5, 6, 6, 8, 9, 4, 7, 11};

        for (int i = 0; i < uniquearray.length; i++) {
            for (int j = 0; j < uniquearray.length; j++) {
                if(uniquearray[i] == uniquearray[j] && i != j){
                    flag = false; break;
                }
                if(uniquearray[i] != uniquearray[j] ){
                    flag = true;
                }
            }
            if(flag) {
                numb = uniquearray[i]; break;
            }
        }
        System.out.println("Уникальное число: " + ((flag) ? numb : " не найдено"));
    }

    public static void main(String[] args) {
        //increasingSort();
        //manualArray();
        //replacingMethod();
        //uniqueNumber();

        MergeSort mst = new MergeSort();
        mst.mergeSort();

    }
}
