import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {

        // Считали размер масива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число элементов массива");
        int n = scanner.nextInt();

        // Заполнили массив данными
        int[] arr = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        sortAndDisplay(arr);
        displayMinMax(arr);
        displayDpecialNumbers(arr);
        calculateAndDisplaySum(arr);
    }

    public static void sortAndDisplay(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        System.out.print("Элементы по возрастанию ");
        for (int i : sorted) System.out.print(i + " ");
//        for (int i = 0; i < sorted.length; i++) {
//            System.out.print(sorted[i] + " ");
//        }
        System.out.println();
        System.out.print("Элементы по убыванию ");
        for (int i = sorted.length - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void displayMinMax(int[] arr) {
        System.out.println("Максимальный элемент " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Минимальный элемент " + Arrays.stream(arr).min().getAsInt());
    }

    public static void displayDpecialNumbers(int[] arr) {
        System.out.println("Все отрицательные числа исходного массива arr ");
        Arrays.stream(arr).filter(element -> element < 0).forEach(System.out::println);

        System.out.println("Все четные числа исходного массива arr ");
        Arrays.stream(arr).filter(element -> element % 2 == 0).forEach(System.out::println);

        System.out.println("Все числа делящиеся на 3 исходного массива arr ");
        Arrays.stream(arr).filter(element -> element % 3 == 0).forEach(System.out::println);
    }

    public static void calculateAndDisplaySum(int[] arr) {
        try {
            long sum = Arrays.stream(arr).mapToLong(element -> (long) element).sum();
            System.out.println(" Сумма элементов исходного массива arr " + sum);
        } catch (ArithmeticException error) {
            System.out.println(" Сумма элементов первышает размерность типа long " + error.getStackTrace());
        }
    }
}
