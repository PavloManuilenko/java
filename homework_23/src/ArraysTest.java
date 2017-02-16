import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public void testOfIntSorting() {
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
    public void testOfBooleanSorting() {
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

}