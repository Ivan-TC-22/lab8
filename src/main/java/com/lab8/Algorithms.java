package com.lab8;

public class Algorithms {

    public static int findMinPositive(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int min = array[0];
        for (int num : array) {
            if (num < 0) {
                throw new IllegalArgumentException("Array cannot contain negative values.");
            } else if (num < min) {
                min = num;
            }
            
        }
        return min; 
    }

    public static int sumNegativeElements(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int sum = 0;
        for (int num : array) {
            if (num < 0) {
                sum += num;
            } else {
                throw new IllegalArgumentException("Array cannot contain positive values.");
            }
        }
        return sum;
    }

    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be greater than 0.");
        }

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        long prev = 1, current = 1;
        for (int i = 3; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    public static double calculateCurrent(double voltage, double resistance) {
        if (resistance == 0) {
            throw new IllegalArgumentException("Resistance cannot be zero.");
        }

        if (voltage < 0) {
            throw new IllegalArgumentException("Voltage cannot be negative.");
        }

        return voltage / resistance;
    }
}
