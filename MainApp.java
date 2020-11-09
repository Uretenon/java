import java.lang.Math;

public class MainApp {
    public static int generateRandomNumber(int max) {
        return (int) Math.round((Math.random() * max));
    }

    public static int[] arrayTask1(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generateRandomNumber(1);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nInversed array: ");
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else arr[i] = 0;
        }
        return arr;
    }

    public static int[] arrayTask2(int length) {
        int[] arr = new int[length];
        for (int i = 1; i < length; i++) {
            arr[i] = arr[i-1] + 3;
        }
        return arr;
    }

    public static int[] arrayTask3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println("\nAnswer: ");
        for (int i = 0; i < 12; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        return arr;
    }

    public static int[][] arrayTask4(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = generateRandomNumber(100);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    public static void arrayTask5(int length) {
        int[] arr = new int[length];
        int min = 100;
        int max = 0;
        for (int i = 0; i < length; i++) {
            arr[i] = generateRandomNumber(100);
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nMinimum element is: "+min);
        System.out.println("Maximum element is: "+max);
    }
    public static boolean arrayTask6(int length) {
        boolean t = false;
//        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
//        если лень тыкать рандом до true и хочется проверить на вашем примере,
//        то закоментите рандом(строчки 79 - 83), откоментите строчку 76 и удалите
//        length в строчке 74 и его значение в строчке 139.
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generateRandomNumber(10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {
            int sum2=0;
            sum1 += arr[i];
            for (int j = arr.length - 1; j > i; j--) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) {
                 t = true;
            }
        }
        return t;
    }
    public static void arrayTask7(int[] arr, int n) {
        int buffer;
       if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = arr.length - 1; j > 0; j--) {
                    buffer = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = buffer;
                }
            }

        }
        else if (n < 0) {
            for (int i = 0; i > n; i--) {
                for (int j = 0; j < arr.length - 1; j++) {
                    buffer = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buffer;
                }

            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {

        System.out.println("task 1:");
        int length1 = 5;
        int[] arr01 = arrayTask1(length1);
        for (int i = 0; i < length1; i++) {
            System.out.print(arr01[i] + " ");
        }
        System.out.println();
        System.out.println("\ntask 2:");
        int length2 = 8;
        int[] arr02 = arrayTask2(length2);
        for (int i = 0; i < length2; i++) {
            System.out.print(arr02[i] + " ");
        }
        System.out.println();
        System.out.println("\ntask 3:");
        int[] arr03 = arrayTask3();
        for (int i = 0; i < 12; i++) {
            System.out.print(arr03[i] + "\t");
        }
        System.out.println("\n\ntask 4:");
        int size4 = 10;
        int[][] matr03 = arrayTask4(size4);
        for (int i = 0; i < size4; i++) {
            for (int j = 0; j < size4; j++) {
                System.out.print(matr03[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nask 5:");
        arrayTask5(10);
        System.out.println();
        System.out.println("Task 6:");
        System.out.println("Answer:" + arrayTask6(10));
        System.out.println("\nTask 7 initial array:");
        int[] arr1 = {2, 3, 4, 5, 6, 7};
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println("\nTask 7 rotation to the right(n = 3):");
        arrayTask7(arr1, 3);
        System.out.println("\nTask 7 rotation to the left(n = -4):");
        arrayTask7(arr2, -4);

    }
}