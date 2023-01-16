package HW2;

import java.util.Arrays;

public class MathOperation {

    static int[] arr = {-1, 4, 8, 10, -15, 0, 3, 7, 9, 2};
    public static void main(String[] args) {
        System.out.println("sum: " + sum(arr));
        System.out.println("min: " + min(arr));
        System.out.println("max: " + max(arr));
        System.out.println("maxPositive: " + maxPositive(arr));
        System.out.println("multiplication: " + multiplication(arr));
        System.out.println("secondLargest: " + secondLargest(arr));
        int[] twoNumbers = modulus(arr);
        System.out.println("modulus: " + twoNumbers[0] +";" + twoNumbers[1]);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public static int multiplication(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }

    private static int getModule(int num) {
        if (num < 0) {
            return -num;
        }
        return num;
    }

    public static int[] modulus(int[] array) {
        int[] result = new int[2];
        result[0] = getModule(array[0]);
        result[1] = getModule(array[array.length - 1]);
        return result;
    }

    public static int secondLargest(int[] array) {
        /*
         more elegant
         Arrays.sort(array);
         return array[1];
        */
        int max = array[0];
        int secondLargest = max;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            }
        }
        return secondLargest;
    }
}
