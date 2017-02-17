import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class CollectionsTest {

    @Test
    public void testOfStringListCopy() {
        //given
        List<String> listA = new ArrayList<String>(3);
        List<String> listB = new ArrayList<String>(3);

        //when
        listA.add("one");
        listA.add("two");
        listA.add("three");

        listB.add("1");
        listB.add("2");
        listB.add("3");

        Collections.copy(listB, listA);

        //then
        assertEquals(listA, listB);






    }

    @Test
    public void testOfStringListCopyToLargerList() {
        //given
        List<String> listA = new ArrayList<String>(3);
        List<String> listB = new ArrayList<String>(6);

        //when
        listA.add("one");
        listA.add("two");
        listA.add("three");

        listB.add("1");
        listB.add("2");
        listB.add("3");
        listB.add("4");
        listB.add("5");
        listB.add("6");

        Collections.copy(listB, listA);

        String expected = "[one, two, three, 4, 5, 6]";

        //then
        assertEquals(expected, listB.toString());






    }

    @Test
    public void testOfIntListCopy() {
        //given
        List<Integer> listA = new ArrayList<Integer>(3);
        List<Integer> listB = new ArrayList<Integer>(3);

        //when
        listA.add(1);
        listA.add(2);
        listA.add(3);

        listB.add(10);
        listB.add(20);
        listB.add(30);

        Collections.copy(listB, listA);

        //then
        assertEquals(listA, listB);






    }

    @Test
    public void testOfStringListDisjointIfThereIsDuplicate() {
        //given
        List<String> listA = new ArrayList(3);
        List<String> listB = new ArrayList(3);

        //when
        listA.add("one");
        listA.add("two");
        listA.add("three");

        listB.add("1");
        listB.add("two");
        listB.add("3");

        //then
        assertFalse(Collections.disjoint(listA, listB));
    }

    @Test
    public void testOfStringListDisjointIfThereIsNoDuplicate() {
            //given
            List<String> listA = new ArrayList(3);
            List<String> listB = new ArrayList(3);

            //when
            listA.add("one");
            listA.add("two");
            listA.add("three");

            listB.add("1");
            listB.add("2");
            listB.add("3");

            //then
            assertTrue(Collections.disjoint(listA, listB));



    }

    @Test
    public void testOfIntListDisjointIfThereIsNoDuplicate() {
            //given
            List<Integer> listA = new ArrayList(3);
            List<Integer> listB = new ArrayList(3);

            //when
            listA.add(1);
            listA.add(2);
            listA.add(3);

            listB.add(4);
            listB.add(5);
            listB.add(6);

            //then
            assertTrue(Collections.disjoint(listA, listB));



    }

    @Test
    public void testOfIntListFilling() {
        //given
        List<Integer> list = new ArrayList(2);

        //when
        list.add(0);
        list.add(0);
        Collections.fill(list, 120);
        String expected = "[120, 120]";
        String actual = Arrays.deepToString(list.toArray());

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBooleanListFilling() {
        //given
        List<Boolean> list = new ArrayList(2);

        //when
        list.add(false);
        list.add(false);
        Collections.fill(list, true);
        String expected = "[true, true]";
        String actual = Arrays.deepToString(list.toArray());

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListFilling() {
        //given
        List<Double> list = new ArrayList(2);

        //when
        list.add(0D);
        list.add(0D);
        Collections.fill(list, 5.2);
        String expected = "[5.2, 5.2]";
        String actual = Arrays.deepToString(list.toArray());

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void positiveTestOfIntListFrequency() {
        //given
        List<Integer> list = new ArrayList(2);

        //when
        list.add(10);
        list.add(20);
        list.add(30);
        int expected = 1;
        int actual = Collections.frequency(list, 30);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void negativeTestOfIntListFrequency() {
        //given
        List<Integer> list = new ArrayList(2);

        //when
        list.add(10);
        list.add(20);
        list.add(30);
        int expected = 0;
        int actual = Collections.frequency(list, 40);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListFrequency() {
        //given
        List<Double> list = new ArrayList(2);

        //when
        list.add(8.2D);
        list.add(7.56D);
        int expected = 1;
        int actual = Collections.frequency(list, 7.56);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStringListIndexOfSubList() {
        //given
        List<String> listA = new ArrayList(5);
        List<String> listB = new ArrayList(5);

        //when
        listA.add("A");
        listA.add("B");
        listA.add("C");
        listA.add("D");
        listA.add("E");

        listB.add("C");
        listB.add("D");

        int expected = 2;
        int actual = Collections.indexOfSubList(listA, listB);

        //then
        assertEquals(expected, actual);
    }


}