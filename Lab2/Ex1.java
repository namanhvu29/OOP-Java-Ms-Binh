package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    static int[] array = new int[10];
    static Scanner scanner = new Scanner(System.in);

    public static void fillArray() {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray() {
        System.out.println("Array elements:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void searchValue() {
        System.out.print("Enter a value to search: ");
        int value = scanner.nextInt();
        boolean found = false;

        for (int i : array) {
            if (i == value) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Value exists in the array." : "Value not found in the array.");
    }

    public static void findMax() {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum value in the array: " + max);
    }

    public static void calculateSum() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum of all elements: " + sum);
    }

    public static void sortDescending() {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Array sorted in descending order.");
    }

    public static void menu() {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1 - Print Array");
            System.out.println("2 - Search a Value");
            System.out.println("3 - Find Maximum Value");
            System.out.println("4 - Calculate Sum of Elements");
            System.out.println("5 - Sort Array Descending");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> printArray();
                case 2 -> searchValue();
                case 3 -> findMax();
                case 4 -> calculateSum();
                case 5 -> sortDescending();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        fillArray();
        menu();
    }
}
