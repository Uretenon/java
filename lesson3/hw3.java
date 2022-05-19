package ru.gb.lesson3;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class hw3 {
    public static void printArray(int @NotNull [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void printMatrix(int @NotNull [] @NotNull [] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int generateRandomNumber(int max) {
        return (int) Math.round(Math.random() * (double) max);
    }

    public static void taskNumber(int count) {
        System.out.println("\n\nTask " + count + ":\n");
    }

    public static void arrayTask1(int length) {
        int[] arr = new int[length];
        int i;
        System.out.println("Given array:");
        for (i = 0; i < length; ++i) {
            arr[i] = generateRandomNumber(1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("\nInversed array: ");

        for (i = 0; i < length; ++i) {
            if (arr[i] == 0) {
                arr[i] = 1;
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void arrayTask2(int length) {
        int[] arr = new int[length];
        int count = 1;
        for (int i = 0; i < length; i++) {
            arr[i] = count;
            count++;
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrayTask3() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i;
        System.out.println("Initial array:");
        printArray(arr);
        System.out.println("\nAnswer: ");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        printArray(arr);
    }

    public static void arrayTask4(int size) {
        int[][] matrix = new int[size][size];

        int i;
        int j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                matrix[i][j] = generateRandomNumber(9);
            }
        }
        printMatrix(matrix);
        System.out.println();

        for (i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        printMatrix(matrix);
    }

    public static int[] arrayTask5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void arrayTask6(int length) {
        int[] arr = new int[length];


        int i;
        for (i = 0; i < length; i++) {
            arr[i] = generateRandomNumber(100);
        }
        printArray(arr);
        int min = arr[1];
        int max = arr[1];

        for (i = 0; i < length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }

            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }

    public static boolean arrayTask7(int @NotNull [] arr) {
        int sum1 = 0, sum2 = 0, sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            sum2 = sumTotal - sum1;
            if (sum1 == sum2)
                return true;
        }
        return false;
    }

    public static void arrayTask8(int[] arr, int n) {
        int buffer;
        int i;
        int j;
        if (n > 0) {
            for (i = 0; i < n; i++) {
                for (j = arr.length - 1; j > 0; j--) {
                    buffer = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = buffer;
                }
            }
        } else if (n < 0) {
            for (i = 0; i > n; i--) {
                for (j = 0; j < arr.length - 1; j++) {
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        printArray(arr);
    }


    public static void main(String[] args) {
        taskNumber(1);
        arrayTask1(6);
        taskNumber(2);
        arrayTask2(100);
        taskNumber(3);
        arrayTask3();
        taskNumber(4);
        arrayTask4(5);
        taskNumber(5);
        printArray(arrayTask5(6, -3));
        taskNumber(6);
        arrayTask6(5);
        taskNumber(7);
        System.out.println("Array: 2, 2, 2, 1, 2, 2, 10, 1");
        System.out.println(arrayTask7(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        taskNumber(8);
        int[] arr1 = new int[]{2, 3, 4, 5, 6, 7};
        System.out.println("Task 8 initial array:");
        printArray(arr1);
        System.out.println("\nTask 8 rotation to the right(n = 3):");
        arrayTask8(arr1, 3);
        System.out.println("\nTask 8 rotation to the left(n = -4):");
        arrayTask8(arr1, -4);
    }
}
