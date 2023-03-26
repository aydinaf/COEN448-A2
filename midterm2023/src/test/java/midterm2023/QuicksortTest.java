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

    @Test
    public void sort1Element() {
        Integer[] A = {1};
        Quicksort.sort(A);
        assertArrayEquals(new Integer[]{1}, A);
    }

    @Test
    public void sortSameElements() {
        Integer[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Quicksort.sort(A);
        assertArrayEquals(new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, A);
    }

    @Test
    public void sortAlreadySorted() {
        Integer[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Quicksort.sort(A);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, A);
    }

    @Test
    public void sortReverseOrder() {
        Integer[] A = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Quicksort.sort(A);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, A);
    }

    @Test
    public void sortRandomElements() {
        Integer[] A = {3, 7, 2, 6, 1, 9, 10, 8, 5, 4};
        Quicksort.sort(A);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, A);
    }

    @Test
    public void sortNegative() {
        Integer[] A = {3, -7, 2, 6, -9, 1, 10, -8, 5, 4};
        Quicksort.sort(A);
        assertArrayEquals(new Integer[]{-9, -8, -7, 1, 2, 3, 4, 5, 6, 10}, A);
    }
}
