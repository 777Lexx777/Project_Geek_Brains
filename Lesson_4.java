package Lesson_4;
//крестики нолики
import java.util.Random;
import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        final char playerSign = 'X';
        final char computerSign = 'Y';

        char[][] field = initField();
        String winnerName;

        drawField(field);

        do {
            // TODO Проверка на ничью
             //for (char y = 9; y >= field.length; y--) {
             //   if (y != '-');{
//                if ( field [0][0] != '-' && field [0][1] != '-' && field [0][2] != '-' &&
//                field [1][0] != '-' && field [1][1] != '-' && field [1][2] != '-' &&
//                field [2][0] != '-' && field [2][1] != '-' && field [2][2] != '-' ){
                   // System.out.println("You have a draw.");
                 //   break;
            //    }


            // Ход игрока
            doPlayerMove(field, playerSign);
            // Перерисовка поля, чтобы увидеть поставленные фишки
            drawField(field);

            // Проверка на победу
            if (checkWin(field, playerSign)) {
                winnerName = "Player";
                break;
            }

            // Ход компьютера
            doAIMove(field, computerSign);
            // Перерисовка поля, чтобы увидеть поставленные фишки
            drawField(field);

            // Проверка на победу
            if (checkWin(field, computerSign)){
                winnerName = "Computer";
                break;
            }
        } while (true);

        System.out.println("Sir, congratulations!");
        System.out.println("You are winner Mr. " + winnerName);
    }


    static void doAIMove(char[][] field, char sign) {
        Random random = new Random();
        System.out.println("Computer's move...");


        // Вводим координаты Х, Y
        int xVal = random.nextInt(3);
        int yVal = random.nextInt(3);


        // Если значение по координатам занято, то делаем перегенерацию координат, пока не найдем свободные
        while (field[xVal][yVal] != '-') {
            xVal = random.nextInt(3);
            yVal = random.nextInt(3);
        }

        System.out.println(String.format("Computer's X-value: %s", xVal));
        System.out.println(String.format("Computer's Y-value: %s", yVal));

        field[xVal][yVal] = sign;
    }

    static void doPlayerMove(char[][] field, char sign) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 2;
        System.out.println("Sir, you move...");

        // Вводим координаты Х, Y
        System.out.println("Please enter X-value [1-3]");
        int xVal = scanner.nextInt() - 1;
        System.out.println("Please enter Y-value [1-3]");
        int yVal = scanner.nextInt() - 1;

        // TODO проверка на диапазон значений, чтобы не выйти за пределы массива
        while ((xVal < min || xVal > max) || (yVal < min || yVal > max)) {
            System.out.println("\nYou are out of range,");
            if (xVal < min || xVal > max) {
                System.out.println("Please enter X-value [1-3]");
                xVal = scanner.nextInt() - 1;
            }
            if (yVal < min || yVal > max) {
                System.out.println("Please enter Y-value [1-3]");
                yVal = scanner.nextInt() - 1;
            }
            System.out.println("===================");
        }
        // Если значение по координатам занято, то повторяем ввод координат, пока не найдем свободные
        while (field[xVal][yVal] != '-') {
            System.out.println(String.format("Field[%s][%s] is already occupied", xVal + 1, yVal + 1));
            System.out.println("Please enter X-value [1-3]");
            xVal = scanner.nextInt() - 1;

            System.out.println("Please enter Y-value [1-3]");
            yVal = scanner.nextInt() - 1;
        }

        field[xVal][yVal] = sign;
    }

    // Проверка победы
    static boolean checkWin(char[][] field, char sign) {
        // По горизонтали
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }
        // TODO По вертикали
        for (int j = 0; j < field.length; j++) {
            if (field[0][j] == sign && field[1][j] == sign && field[2][j] == sign) {
                return true;
            }
        }
        // TODO По диагонали
        for (int z = 0; z < field.length; z++) {
            if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
                return true;
            }
        }
        for (int x = 0; x < field.length; x++) {
            if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
                return true;
            }
        }
        return false;

    }

    // Отрисока пока как матрицы
    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] initField(){
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
    }
}
