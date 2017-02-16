import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void testOfIntArraysToString() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>(3);

        for (int i = 3; i > 0; i--) {
            numbers.add(i);
        }

        //when
        String expected = "[3, 2, 1]";
        String actual = numbers.toString();

        //then
        assertEquals("Arrays - test of toString", expected, actual);
    }

    @Test
    public void testOfBooleanArraysToString() {
        //given
        ArrayList<Boolean> booleans = new ArrayList<>(2);

        for (int i = 0; i < 2; i++) {
            booleans.add(true);
        }

        //when
        String expected = "[true, true]";
        String actual = booleans.toString();

        //then
        assertEquals("Arrays - test of toString", expected, actual);
    }

    @Test
    public void testOfStringArraysToString() {
        //given
        ArrayList<String> words = new ArrayList<>(2);

        words.add("Test:");
        words.add("testOfStringArraysToString");

        //when
        String expected = "[Test:, testOfStringArraysToString]";
        String actual = words.toString();

        //then
        assertEquals("Arrays - test of toString", expected, actual);
    }

    @Test
    public void testOfDoubleArraysToString() {
        //given
        ArrayList<Double> numbers = new ArrayList<>(2);

        for (int i = 0; i < 2; i++) {
            numbers.add(i + 0.5);
        }

        //when
        String expected = "[0.5, 1.5]";
        String actual = numbers.toString();

        //then
        assertEquals("Arrays - test of toString", expected, actual);
    }

    @Test
    public void testOfIntArrayCloneViaCopyOf() {
        //given
        int[] arr1 = new int[]{10, 20, 30, 40, 50};

        //when
        int[] arr2 = Arrays.copyOf(arr1, 5);

        String expected = Arrays.toString(arr1);
        String actual = Arrays.toString(arr2);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleArrayCloneViaCopyOf() {
        //given
        double[] arr1 = new double[]{10.5, 20.2, 30.8, 40.72, 50.5};

        //when
        double[] arr2 = Arrays.copyOf(arr1, 5);

        String expected = Arrays.toString(arr1);
        String actual = Arrays.toString(arr2);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStringArrayCloneViaCopyOf() {
        //given
        String[] arr1 = new String[]{"Test", "1", "2", "3"};

        //when
        String[] arr2 = Arrays.copyOf(arr1, 4);

        //then
        assertEquals(arr1, arr2);
    }

    @Test
    public void testOfIntArrayCopyOfFullViaCopyOfRange() {
        //given
        int[] arr1 = new int[]{10, 20, 30, 40, 50};

        //when
        int[] arr2 = Arrays.copyOfRange(arr1, 0, 5);

        String expected = Arrays.toString(arr1);
        String actual = Arrays.toString(arr2);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntArrayCopyOfBeginViaCopyOfRange() {
        //given
        int[] arr1 = new int[]{10, 20, 30, 40, 50};

        //when
        int[] arr2 = Arrays.copyOfRange(arr1, 0, 3);

        String expected = "[10, 20, 30]";
        String actual = Arrays.toString(arr2);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntArrayCopyOfEndViaCopyOfRange() {
        //given
        int[] arr1 = new int[]{10, 20, 30, 40, 50};

        //when
        int[] arr2 = Arrays.copyOfRange(arr1, 2, 5);

        String expected = "[30, 40, 50]";
        String actual = Arrays.toString(arr2);

        //then
        assertEquals(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionUsingCopyOfRange() throws IllegalArgumentException {
        int[] arr1 = new int[]{10, 20, 30};
        int[] arr2 = Arrays.copyOfRange(arr1, 3, 1);
    }

    @Test
    public void testOfIntCollectionSorting() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>(3);

        for (int i = 3; i > 0; i--) {
            numbers.add(i);
        }

        //when
        Collections.sort(numbers);
        String expected = "[1, 2, 3]";
        String actual = numbers.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBooleanCollectionSorting() {
        //given
        ArrayList<Boolean> booleans = new ArrayList<>(2);

            booleans.add(true);
            booleans.add(false);
            booleans.add(false);
            booleans.add(true);

        //when
        Collections.sort(booleans);
        String expected = "[false, false, true, true]";
        String actual = booleans.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStringCollectionSorting() {
        //given
        ArrayList<String> words = new ArrayList<>(2);

        words.add("C");
        words.add("D");
        words.add("A");
        words.add("B");

        //when
        Collections.sort(words);
        String expected = "[A, B, C, D]";
        String actual = words.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBinarySearchInIntCollection() {
        //given
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i+1;
        }

        //when
        int expected = 4;
        int actual = Arrays.binarySearch(numbers, 5);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBinarySearchInIntCollectionWhenElementWasntFound () {
        //given
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i+1;
        }

        //when
        int expected = -1;
        int actual = Arrays.binarySearch(numbers, 0);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBinarySearchInStringCollectionWhenElementWasntFound () {
        //given
        String[] numbers = new String[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = "Word #" + i;
        }

        //when
        int expected = 2;
        int actual = Arrays.binarySearch(numbers, "Word #2");

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntArraysFilling() {
        //given
        int[] arr1 = new int[3];

        //when
        Arrays.fill(arr1, 120);
        String expected = "[120, 120, 120]";
        String actual = Arrays.toString(arr1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBooleanArraysFilling() {
        //given
        boolean[] arr1 = new boolean[3];

        //when
        Arrays.fill(arr1, true);
        String expected = "[true, true, true]";
        String actual = Arrays.toString(arr1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleArraysFilling() {
        //given
        double[] arr1 = new double[3];

        //when
        Arrays.fill(arr1, 10.2);
        String expected = "[10.2, 10.2, 10.2]";
        String actual = Arrays.toString(arr1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntArraysEquals() {
        //given
        int[] arr1 = new int[3];
        int[] arr2 = new int[]{120, 120, 120};

        //when
        Arrays.fill(arr1, 120);

        //then
        assertTrue(Arrays.equals(arr1, arr2));
    }

    @Test
    public void testOfBooleanArraysEquals() {
        //given
        boolean[] arr1 = new boolean[3];
        boolean[] arr2 = new boolean[3];

        //when
        Arrays.fill(arr1, true);
        Arrays.fill(arr2, true);

        //then
        assertTrue(Arrays.equals(arr1, arr2));

    }

    @Test
    public void testOfDoubleArraysEquals() {
        //given
        double[] arr1 = new double[3];
        double[] arr2 = new double[3];

        //when
        Arrays.fill(arr1, 10.2);
        Arrays.fill(arr2, 10.2);

        //then
        assertTrue(Arrays.equals(arr1, arr2));
    }

    @Test
    public void testOfIntArraysAsList() {
        //given
        int[] numbers = new int[] {1, 2, 3};
        List<int[]> list = Arrays.asList(numbers);

        //when
        String expected = "[" + Arrays.toString(numbers) + "]";
        String actual = Arrays.deepToString(list.toArray());

        //then
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBooleanArraysAsList() {
        //given
        boolean[] booleans = new boolean[] {true, false, true};
        List<boolean[]> list = Arrays.asList(booleans);

        //when
        String expected = "[" + Arrays.toString(booleans) + "]";
        String actual = Arrays.deepToString(list.toArray());

        //then
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStringArraysAsList() {
        //given
        String[] words = new String[] { "one", "two", "three"};
        List<String> list = Arrays.asList(words);

        //when
        String expected = list.toString();
        String actual = Arrays.toString(words);

        //then
        assertEquals(expected, actual);
    }

}