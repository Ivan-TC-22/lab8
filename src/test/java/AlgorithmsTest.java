import org.junit.jupiter.api.Test;

import com.lab8.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {
    @Test
    public void testFindMinPositive_success() {
        int[] array = {3, 7, 2, 5, 10, 8};
        assertEquals(2, Algorithms.findMinPositive(array));
    }

    @Test
    public void testFindMinPositive_noPositiveElements() {
        int[] array = {-3, -7, -2, -5, -4, -10};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.findMinPositive(array);
        });
        assertEquals("Array cannot contain negative values.", exception.getMessage());
    }

    @Test
    public void testFindMinPositive_emptyArray() {
        int[] array = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.findMinPositive(array);
        });
        assertEquals("Array cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testFindMinPositive_nullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.findMinPositive(null);
        });
        assertEquals("Array cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testSumNegativeElements_success() {
        int[] array = {-3, -7, -2, -5, -4};
        assertEquals(-21, Algorithms.sumNegativeElements(array));
    }

    @Test
    public void testSumNegativeElements_noNegativeElements() {
        int[] array = {3, 7, 2, 5, 4};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.sumNegativeElements(array);
        });
        assertEquals("Array cannot contain positive values.", exception.getMessage());
    }

    @Test
    public void testSumNegativeElements_emptyArray() {
        int[] array = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.sumNegativeElements(array);
        });
        assertEquals("Array cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testSumNegativeElements_nullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.sumNegativeElements(null);
        });
        assertEquals("Array cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testCalculateFibonacci_success() {
        assertEquals(55, Algorithms.calculateFibonacci(10));
    }

    @Test
    public void testCalculateFibonacci_invalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.calculateFibonacci(-1);
        });
        assertEquals("N must be greater than 0.", exception.getMessage());
    }

    @Test
    public void testCalculateCurrent_success() {
        assertEquals(5.0, Algorithms.calculateCurrent(220, 44), 0.001);
    }

    @Test
    public void testCalculateCurrent_zeroResistance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.calculateCurrent(220, 0);
        });
        assertEquals("Resistance cannot be zero.", exception.getMessage());
    }

    @Test
    public void testCalculateCurrent_negativeVoltage() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Algorithms.calculateCurrent(-220, 44);
        });
        assertEquals("Voltage cannot be negative.", exception.getMessage());
    }
}