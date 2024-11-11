package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    static int[][] matrix;
    static int n, m;
    static Scanner scanner = new Scanner(System.in);

    public static void createMatrix() {
        System.out.print("Enter number of rows (n): ");
        n = scanner.nextInt();
        System.out.print("Enter number of columns (m): ");
        m = scanner.nextInt();
        matrix = new int[n][m];
    }

    public static void fillMatrix() {
        System.out.println("Enter values for the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void printMatrix() {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void calculateSum() {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("Total of elements: " + sum);
    }

    public static void searchValue() {
        System.out.print("Enter a value to search: ");
        int value = scanner.nextInt();
        boolean found = false;

        for (int[] row : matrix) {
            for (int item : row) {
                if (item == value) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found ? "Value exists in the matrix." : "Value not found in the matrix.");
    }

    public static void sortMatrix() {
        int[] temp = new int[n * m];
        int k = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                temp[k++] = value;
            }
        }
        Arrays.sort(temp);

        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = temp[k++];
            }
        }
        System.out.println("Matrix sorted in ascending order.");
    }

    public static void menu() {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1 - Print Matrix");
            System.out.println("2 - Search a Value");
            System.out.println("3 - Calculate Total of Elements");
            System.out.println("4 - Sort Matrix Ascending");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> printMatrix();
                case 2 -> searchValue();
                case 3 -> calculateSum();
                case 4 -> sortMatrix();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        createMatrix();
        fillMatrix();
        menu();
    }
}

