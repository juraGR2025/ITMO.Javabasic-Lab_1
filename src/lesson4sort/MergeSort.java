package lesson4sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
//5. Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.

    public static void mergeSort() {

    int[] Sortarray = new int[11];// Создаем массив
        //Заполняем его случайными числами
        Random r = new Random();
        for (int i = 0; i < Sortarray.length; i++) {
            Sortarray[i] = r.nextInt(100);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(Sortarray));
        int[] newArr = splitArr(Sortarray);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(newArr));
}
    public static int[] splitArr(int[] arr) {

        if (arr.length < 2) return arr;

        int mid = arr.length / 2;
        int[] arrleft = new int[mid];

        int[] arrright;
        if (arr.length % 2 == 0 )
            arrright = new int[mid];
        else
            arrright = new int[mid + 1];

        for (int i = 0; i < mid; i++) {
            arrleft[i] = arr[i];
        }
        for (int j = 0; j < arrright.length; j++) {
            arrright[j] = arr[mid + j];
        }

        System.out.println(Arrays.toString(arrleft));
        System.out.println(Arrays.toString(arrright));
        arrleft = splitArr(arrleft);
        arrright = splitArr(arrright);
        return mergeParts(arrleft, arrright);
    }
    private static int[] mergeParts(int[] arrleft, int[] arrright) {
        int[] resultArr = new int[arrleft.length + arrright.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int resultPoint = 0;
        while (leftPoint < arrleft.length || rightPoint < arrright.length) {
            if (leftPoint < arrleft.length && rightPoint < arrright.length) {
                if (arrleft[leftPoint] < arrright[rightPoint]) {
                    resultArr[resultPoint++] = arrleft[leftPoint++];
                } else
                    resultArr[resultPoint++] = arrright[rightPoint++];
            }
            else if (leftPoint < arrleft.length)
                resultArr[resultPoint++] = arrleft[leftPoint++];
            else if (rightPoint < arrright.length)
                resultArr[resultPoint++] = arrright[rightPoint++];
        }
        return resultArr;
    }

}
