import org.junit.Test;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;

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
    public void testOfArraysCloneViaCopyOf() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>(3);

        for (int i = 3; i > 0; i--) {
            numbers.add(i);
        }

        //when
        Integer[] temp = new Integer[numbers.size()];
        temp = numbers.toArray(temp);

        Integer[] numbersNew = Arrays.copyOf(temp, temp.length);

        String expected = numbers.toString();
        String actual = numbersNew.toString();


        //then
        assertEquals(expected, actual);
    }


}