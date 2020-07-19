package geekArray;

import java.util.Arrays;
//import.Math.min;

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
        int j = 0;
        for (int i = 0; i < arr2.length; i++, j = j + 3) {
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
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));

/*4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;;*/
        System.out.print("Решение_4: ");

        int[][] arr4 = new int[2][2];
        //System.out.println(arr4);
        System.out.println(" ");
        for (int a = 0; a < arr4.length; a++) {
            for (j = 0; j < arr4.length; j++) {
                if (a == j) arr4[j][j] = 1;
                System.out.print(arr4[a][j] + " ");
            }
            System.out.println(" ");
        }
        /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);;*/
        System.out.print("Решение_5: ");
        int[] arr5 = {1, 9, 3};
        int min = arr[0];
        int index = 0;
        System.out.print(Arrays.toString(arr5));
        System.out.print(" - ");

        for (int z = 1; z < arr5.length; z++) {
            if (arr5[z] < min) {
                min = arr5[z];
                index = z;

            }
        }
        System.out.println(" min " + min);
        System.out.println("index" + index);

        for (int n = 1; n < arr5.length; n++) {
            if (arr5[n] > min) {
                min = arr5[n];
                index = n;
                System.out.println(" max " + min);
                System.out.println("index" + index);
            }
        }

/*6. ** Написать метод, в который передается не пустой одномерный целочисленный
 массив, метод должен вернуть true, если в массиве есть место,
 в котором сумма левой и правой части массива равны.
 Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
 checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
  эти символы в массив не входят.;*/
        System.out.print("Решение_6: ");
//
        System.out.print(" - ");
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 1, 1}));
        System.out.println("\nРешение_7: ");
        modifyArray(new int[]{2, 2, 2}, 5);
    }

        static boolean checkBalance(int[] arr6) {
          int left = 0, right = 0;
          for (int i = 0; i < arr6.length + 1; i++) {
            left = 0;
            right = 0;
            for (int j = 0; j < i; j++) {
                left += arr6[j];
            }
            for (int j = i; j < arr6.length; j++) {
                right += arr6[j];
            }
            if (left == right) return true;
          }
            return false;
        }

/*7. ** Написать метод, которому на вход подается одномерный массив и
число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементымассива на n позиций.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.;*/


           static void modifyArray(int[] arr7, int n) {
            System.out.print("BEFORE: ");
             for (int i : arr7) {
             System.out.print(i + " ");
          }
           System.out.print("(n = " + n + ")");

          if (n > 0) {
            for (int i = 0; i < n; i++) {
            // Right
              int tmp = arr7[arr7.length - 1];
               for (int j = arr7.length - 1; j > 0; j--) {
                arr7[j] = arr7[j - 1];
               }
                    arr7[0] = tmp;
            }
          } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
            // Left
            int tmp = arr7[0];
            for (int j = 0; j < arr7.length - 1; j++) {
                arr7[j] = arr7[j + 1];
            }
            arr7[arr7.length - 1] = tmp;
        }
      }
          System.out.print("\nAFTER:  ");
          for (int i : arr7) {
        System.out.print(i + " ");
      }
    }


}

