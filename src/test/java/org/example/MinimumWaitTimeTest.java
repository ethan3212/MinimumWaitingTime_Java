package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumWaitTimeTest {
    @Test
    void TestCase1() {
        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase2() {
        int[] queries = new int[] {2, 1, 1, 1};
        int expected = 6;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase3() {
        int[] queries = new int[] {1, 2, 4, 5, 2, 1};
        int expected = 23;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase4() {
        int[] queries = new int[] {25, 30, 2, 1};
        int expected = 32;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase5() {
        int[] queries = new int[] {1, 1, 1, 1, 1};
        int expected = 10;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase6() {
        int[] queries = new int[] {7, 9, 2, 3};
        int expected = 19;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase7() {
        int[] queries = new int[] {4, 3, 1, 1, 3, 2, 1, 8};
        int expected = 45;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase8() {
        int[] queries = new int[] {2};
        int expected = 0;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase9() {
        int[] queries = new int[] {7};
        int expected = 0;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase10() {
        int[] queries = new int[] {8, 9};
        int expected = 8;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase11() {
        int[] queries = new int[] {1, 9};
        int expected = 1;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase12() {
        int[] queries = new int[] {5, 4, 3, 2, 1};
        int expected = 20;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase13() {
        int[] queries = new int[] {1, 2, 3, 4, 5};
        int expected = 20;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase14() {
        int[] queries = new int[] {1, 1, 1, 4, 5, 6, 8, 1, 1, 2, 1};
        int expected = 81;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }

    @Test
    void TestCase15() {
        int[] queries = new int[] {17, 4, 3};
        int expected = 10;
        var actual = Main.minimumWaitingTime(queries);
        assertEquals(actual, expected);
    }
}