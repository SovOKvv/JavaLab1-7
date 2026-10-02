import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==========================================");
            System.out.println("   ЛАБОРАТОРНАЯ РАБОТА №1 — ВАРИАНТ 7");
            System.out.println("==========================================");
            System.out.println("1. Задание 1 (Методы: 1, 4, 5, 8, 9)");
            System.out.println("2. Задание 2 (Условия: 3, 5, 7, 8, 10)");
            System.out.println("3. Задание 3 (Циклы: 2, 4, 6, 9, 10)");
            System.out.println("4. Задание 4 (Массивы: 1, 3, 6, 7, 8)");
            System.out.println("0. Выход");
            System.out.print("Выберите блок заданий: ");

            int choice = app.readInt(scanner);

            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (choice) {
                case 1 -> app.menuTask1(scanner);
                case 2 -> app.menuTask2(scanner);
                case 3 -> app.menuTask3(scanner);
                case 4 -> app.menuTask4(scanner);
                default -> System.out.println("Ошибка: неверный пункт меню!");
            }
        }
    }


    private int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка ввода! Введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка ввода! Введите вещественное число: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private int[] readArray(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = readInt(scanner);
        while (size <= 0) {
            System.out.print("Размер массива должен быть больше 0. Повторите ввод: ");
            size = readInt(scanner);
        }
        int[] arr = new int[size];
        System.out.println("Введите " + size + " элементов массива через пробел:");
        for (int i = 0; i < size; i++) {
            arr[i] = readInt(scanner);
        }
        return arr;
    }

    private void menuTask1(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 1 ---");
        System.out.println("1. fraction (Дробная часть)");
        System.out.println("2. isPositive (Есть ли позитив)");
        System.out.println("3. is2Digits (Двузначное)");
        System.out.println("4. isDivisor (Делитель)");
        System.out.println("5. isEqual (Равенство)");
        System.out.print("Выберите задачу: ");

        int task = readInt(scanner);
        switch (task) {
            case 1 -> {
                System.out.print("Введите число x (например, 5.25): ");
                double x = readDouble(scanner);
                System.out.printf("Результат: %.4f\n", fraction(x));
            }
            case 2 -> {
                System.out.print("Введите целое число x: ");
                int x = readInt(scanner);
                System.out.println("Результат: " + isPositive(x));
            }
            case 3 -> {
                System.out.print("Введите целое число x: ");
                int x = readInt(scanner);
                System.out.println("Результат: " + is2Digits(x));
            }
            case 4 -> {
                System.out.print("Введите число a: ");
                int a = readInt(scanner);
                System.out.print("Введите число b: ");
                int b = readInt(scanner);
                System.out.println("Результат: " + isDivisor(a, b));
            }
            case 5 -> {
                System.out.print("Введите a: ");
                int a = readInt(scanner);
                System.out.print("Введите b: ");
                int b = readInt(scanner);
                System.out.print("Введите c: ");
                int c = readInt(scanner);
                System.out.println("Результат: " + isEqual(a, b, c));
            }
            default -> System.out.println("Неверный номер задачи.");
        }
    }


    private void menuTask2(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 2 ---");
        System.out.println("1. is35 (Тридцать пять)");
        System.out.println("2. max3 (Тройной максимум)");
        System.out.println("3. sum2 (Двойная сумма)");
        System.out.println("4. age (Возраст)");
        System.out.println("5. printDays (Вывод дней недели)");
        System.out.print("Выберите задачу: ");

        int task = readInt(scanner);
        switch (task) {
            case 1 -> {
                System.out.print("Введите число x: ");
                int x = readInt(scanner);
                System.out.println("Результат: " + is35(x));
            }
            case 2 -> {
                System.out.print("Введите x: ");
                int x = readInt(scanner);
                System.out.print("Введите y: ");
                int y = readInt(scanner);
                System.out.print("Введите z: ");
                int z = readInt(scanner);
                System.out.println("Максимум: " + max3(x, y, z));
            }
            case 3 -> {
                System.out.print("Введите x: ");
                int x = readInt(scanner);
                System.out.print("Введите y: ");
                int y = readInt(scanner);
                System.out.println("Результат: " + sum2(x, y));
            }
            case 4 -> {
                System.out.print("Введите возраст: ");
                int x = readInt(scanner);
                System.out.println("Результат: " + age(x));
            }
            case 5 -> {
                System.out.print("Введите день недели (например, четверг): ");
                String day = scanner.next();
                printDays(day.toLowerCase());
            }
            default -> System.out.println("Неверный номер задачи.");
        }
    }


    private void menuTask3(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 3 ---");
        System.out.println("1. reverseListNums (Числа наоборот)");
        System.out.println("2. pow (Степень числа)");
        System.out.println("3. equalNum (Одинаковость)");
        System.out.println("4. rightTriangle (Правый треугольник)");
        System.out.println("5. guessGame (Угадайка)");
        System.out.print("Выберите задачу: ");

        int task = readInt(scanner);
        switch (task) {
            case 1 -> {
                System.out.print("Введите число x: ");
                int x = readInt(scanner);
                System.out.println("Результат: " + reverseListNums(x));
            }
            case 2 -> {
                System.out.print("Введите основание x: ");
                int x = readInt(scanner);
                System.out.print("Введите показатель степени y (>=0): ");
                int y = readInt(scanner);
                System.out.println("Результат: " + pow(x, y));
            }
            case 3 -> {
                System.out.print("Введите число x: ");
                int x = readInt(scanner);
                System.out.println("Результат: " + equalNum(x));
            }
            case 4 -> {
                System.out.print("Введите высоту треугольника x: ");
                int x = readInt(scanner);
                rightTriangle(x);
            }
            case 5 -> guessGame(scanner);
            default -> System.out.println("Неверный номер задачи.");
        }
    }


    private void menuTask4(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 4 ---");
        System.out.println("1. findFirst (Поиск первого значения)");
        System.out.println("2. maxAbs (Поиск максимального по модулю)");
        System.out.println("3. reverse (Реверс на месте)");
        System.out.println("4. reverseBack (Возвратный реверс)");
        System.out.println("5. concat (Объединение массивов)");
        System.out.print("Выберите задачу: ");

        int task = readInt(scanner);
        switch (task) {
            case 1 -> {
                int[] arr = readArray(scanner);
                System.out.print("Введите искомое число x: ");
                int x = readInt(scanner);
                System.out.println("Индекс первого вхождения: " + findFirst(arr, x));
            }
            case 2 -> {
                int[] arr = readArray(scanner);
                System.out.println("Максимальное по модулю значение: " + maxAbs(arr));
            }
            case 3 -> {
                int[] arr = readArray(scanner);
                System.out.println("Исходный массив: " + Arrays.toString(arr));
                reverse(arr);
                System.out.println("Измененный массив: " + Arrays.toString(arr));
            }
            case 4 -> {
                int[] arr = readArray(scanner);
                int[] rev = reverseBack(arr);
                System.out.println("Исходный массив: " + Arrays.toString(arr));
                System.out.println("Новый реверсированный массив: " + Arrays.toString(rev));
            }
            case 5 -> {
                System.out.println("--- Первый массив ---");
                int[] arr1 = readArray(scanner);
                System.out.println("--- Второй массив ---");
                int[] arr2 = readArray(scanner);
                int[] result = concat(arr1, arr2);
                System.out.println("Объединенный массив: " + Arrays.toString(result));
            }
            default -> System.out.println("Неверный номер задачи.");
        }
    }

//    Методы из первой задачи (1, 4, 5, 8, 9)

    public double fraction (double x) {
        return x % 1;
    }

    public boolean isPositive (int x) {
        return x > 0;
    }

    public boolean is2Digits (int x) {
        return String.valueOf(x).length() == 2;
    }

    public boolean isDivisor (int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    public boolean isEqual (int a, int b, int c) {
        return (a == b) && (a == c);
    }

//    Методы из второй задачи (3, 5, 7, 8, 10)

    public boolean is35 (int x) {
        boolean is3 = (x % 3 == 0);
        boolean is5 = (x % 5 == 0);

        return  (is3 || is5) && !(is3 && is5);
    }

    public int max3 (int x, int y, int z) {
        int max = x;

        if (max < y) {max = y;}
        if (max < z) {max = z;}

        return max;
    }

    public int sum2 (int x, int y) {
        int sum = x + y;

        if (10 <= sum && sum <= 19) {sum = 20;}

        return sum;
    }

    public String age (int x) {
        if (x % 10 == 1 && x != 11) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && !(x == 12 || x == 13 || x == 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public void printDays (String x) {
        switch (x) {
            case "понедельник":
                System.out.println("вторник");
            case "вторник":
                System.out.println("среда");
            case "среда":
                System.out.println("четверг");
            case "четверг":
                System.out.println("пятница");
            case "пятница":
                System.out.println("суббота");
            case "суббота":
                System.out.println("воскресенье");
            case "воскресенье":
                break;
            default:
                System.out.println("это не день недели");
                break;

        }
    }

//    Методы из третей задачи (2, 4, 6, 9, 10)

    public String reverseListNums (int x) {
        String result = "";

        while (x >= 0) {
            result += x + " ";
            x--;
        }

        return result;
    }

    public int pow (int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    public boolean equalNum (int x) {
        int FirstNum = x % 10;
        x /= 10;

        while (x > 0) {
            int CurrentNum = x % 10;

            if (CurrentNum != FirstNum) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public void rightTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void guessGame(Scanner scanner) {
        Random random = new Random();

        int targetNumber = random.nextInt(10);
        int attempts = 0;
        int userGuess;

        System.out.println("Введите число от 0 до 9:");

        do {
            userGuess = readInt(scanner); // Использование безопасного считывания
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + attempts + " попытки");
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        } while (userGuess != targetNumber);
    }

    //    Методы из четвертой задачи (1, 3, 6, 7, 8)

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxElement)) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public void reverse(int[] arr) {
        if (arr == null) return;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public int[] reverseBack(int[] arr) {
        if (arr == null) return new int[0];
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] concat(int[] arr1, int[] arr2) {
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];

        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }
}