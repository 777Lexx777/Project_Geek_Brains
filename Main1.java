package geekArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      /* Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        int[] arr = {0, 1};
        System.out.print("Решение_1: ");
        System.out.print(Arrays.toString(arr));
        System.out.print(" - ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

        /*2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
значениями 0 3 6 9 12 15 18 21;*/
        System.out.print("Решение_2: ");
        int[] arr2 = new int[8];
        int j=0;
        for(int i = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));

        /*3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2;*/

        System.out.print("Решение_3: ");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arr3));
        System.out.print(" - ");

        for (int i = 0; i < arr.length; i++) {
            if (arr3[i] < 6 ) arr3[i] = arr3[i]*2;
        }
        System.out.println(Arrays.toString(arr3));

/*4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;;*/
        System.out.print("Решение_4: ");

        int n =5;
        int[][] arr4 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i == j) && arr[i] == n) arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr4));
    }
}
//===========================================
//выдает ошибку что не так?
//+++++++++++++++++++++++++++++++++
