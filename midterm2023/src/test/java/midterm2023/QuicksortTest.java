package midterm2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest {

    @Test
    void sortAverageCase() {
        Integer[] a1 = {87, 42, 19, 63, 8, 56, 91, 27, 73, 13};
        Integer[] expected = {8, 13, 19, 27, 42, 56, 63, 73, 87, 91};
        Quicksort.sort(a1);
        assertArrayEquals(expected, a1);
    }
    @Test
    void sortWorstCase() {
        Integer[] a1 = {1, 1, 1, 1, 2, 1, 1, 1, 1};
        Integer[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 2};
        Quicksort.sort(a1);
        assertArrayEquals(expected, a1);
    }

    @Test
    void sortWorstCase2() {
        Integer[] a1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Quicksort.sort(a1);
        assertArrayEquals(expected, a1);
    }

}









