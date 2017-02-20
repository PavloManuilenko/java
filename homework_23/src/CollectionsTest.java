import org.junit.Test;

import java.util.*;

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

    @Test
    public void testOfIntListIndexOfSubList() {
        //given
        List<Integer> listA = new ArrayList(5);
        List<Integer> listB = new ArrayList(5);

        //when
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        listB.add(1);
        listB.add(2);

        int expected = 0;
        int actual = Collections.indexOfSubList(listA, listB);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListIndexOfSubList() {
        //given
        List<Double> listA = new ArrayList(5);
        List<Double> listB = new ArrayList(5);

        //when
        listA.add(5.1D);
        listA.add(5.11D);
        listA.add(5.12D);
        listA.add(5.13D);
        listA.add(5.14D);


        listB.add(5.12D);
        listB.add(5.13D);
        listB.add(5.14D);

        int expected = 2;
        int actual = Collections.indexOfSubList(listA, listB);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStringListLastIndexOfSubList() {
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
        listB.add("E");

        int expected = 2;
        int actual = Collections.lastIndexOfSubList(listA, listB);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntListLastIndexOfSubList() {
        //given
        List<Integer> listA = new ArrayList(5);
        List<Integer> listB = new ArrayList(5);

        //when
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        listB.add(1);
        listB.add(2);

        int expected = 0;
        int actual = Collections.lastIndexOfSubList(listA, listB);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListLastIndexOfSubList() {
        //given
        List<Double> listA = new ArrayList(5);
        List<Double> listB = new ArrayList(5);

        //when
        listA.add(5.1D);
        listA.add(5.11D);
        listA.add(5.12D);
        listA.add(5.13D);
        listA.add(5.14D);


        listB.add(5.12D);
        listB.add(5.13D);
        listB.add(5.14D);

        int expected = 2;
        int actual = Collections.lastIndexOfSubList(listA, listB);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleEnumerationToList() {
        //given
        List arrList = new ArrayList();
        Vector vector = new Vector();

        //when
        vector.add(5.1D);
        vector.add(5.2D);
        vector.add(5.3D);

        Enumeration<Double> enumeration = vector.elements();

        arrList = Collections.list(enumeration);

        String expected = "[5.1, 5.2, 5.3]";
        String actual = arrList.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStringEnumerationToList() {
        //given
        List arrList = new ArrayList();
        Vector vector = new Vector();

        //when
        vector.add("A");
        vector.add("B");
        vector.add("C");

        Enumeration<String> enumeration = vector.elements();

        arrList = Collections.list(enumeration);

        String expected = "[A, B, C]";
        String actual = arrList.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfBooleanEnumerationToList() {
        //given
        List arrList;
        Vector vector = new Vector();

        //when
        vector.add(true);
        vector.add(false);
        vector.add(true);

        Enumeration<Boolean> enumeration = vector.elements();

        arrList = Collections.list(enumeration);

        String expected = "[true, false, true]";
        String actual = arrList.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntListMaxElem() {
        //given
        List<Integer> list = new ArrayList(5);

        //when
        list.add(0);
        list.add(2);
        list.add(-3);
        list.add(4);
        list.add(0);

        int expected = 4;
        int actual = Collections.max(list, null);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListMaxElem() {
        //given
        List<Double> list = new ArrayList(5);

        //when
        list.add(0D);
        list.add(2.5D);
        list.add(-3.1D);
        list.add(2.6D);
        list.add(2.59D);

        Double expected = 2.6D;
        Double actual = Collections.max(list, null);

        //then
        assertEquals(expected, actual);
    }

    @Test (expected = NoSuchElementException.class)
    public void testOfEmptyListMaxElem() {
        List<Double> list = new ArrayList(5);

        Double actual = Collections.max(list, null);
    }

    @Test
    public void testOfIntListMinElem() {
        //given
        List<Integer> list = new ArrayList(5);

        //when
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(3);
        list.add(-2);

        int expected = -2;
        int actual = Collections.min(list, null);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListMinElem() {
        //given
        List<Double> list = new ArrayList(5);

        //when
        list.add(0.1D);
        list.add(0.11D);
        list.add(-0.1D);
        list.add(-0.11D);
        list.add(0D);

        Double expected = -0.11D;
        Double actual = Collections.min(list, null);

        //then
        assertEquals(expected, actual);
    }

    @Test (expected = NoSuchElementException.class)
    public void testOfEmptyListMinElem() {
        List<Double> list = new ArrayList(5);

        Double actual = Collections.min(list, null);
    }

    @Test
    public void testOfIntListNCopies() {
        //given
        List<Integer> list = Collections.nCopies(5, 100);

        //when
        String  expected = "[100, 100, 100, 100, 100]";
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStrListNCopies() {
        //given
        List<String> list = Collections.nCopies(3, "Test");

        //when
        String  expected = "[Test, Test, Test]";
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testOfEmptyListNCopies() {
        List<Integer> list = Collections.nCopies(-1, 1);
    }

    @Test
    public void testOfIntListReplaceAll() {
        //given
        List<Integer> list = new ArrayList<>(3);
        list.add(0);
        list.add(2);
        list.add(3);

        //when
        String  expected = "[1, 2, 3]";
        Collections.replaceAll(list, 0, 1);
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListReplaceAll() {
        //given
        List<Double> list = new ArrayList<>(3);
        list.add(1.1D);
        list.add(1.11D);
        list.add(1.3D);


        //when
        String  expected = "[1.1, 1.2, 1.3]";
        Collections.replaceAll(list, 1.11D, 1.2D);
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStrListReplaceAll() {
        //given
        List<String> list = new ArrayList<>(4);
        list.add("Z");
        list.add("B");
        list.add("C");
        list.add("Z");

        //when
        String  expected = "[A, B, C, A]";
        Collections.replaceAll(list, "Z", "A");
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntListReverse() {
        //given
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);

        //when
        String  expected = "[3, 2, 1]";
        Collections.reverse(list);
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListReverse() {
        //given
        List<Double> list = new ArrayList<>(3);
        list.add(1.01D);
        list.add(1.02D);
        list.add(1.03D);


        //when
        String  expected = "[1.03, 1.02, 1.01]";
        Collections.reverse(list);
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStrListReverse() {
        //given
        List<String> list = new ArrayList<>(4);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //when
        String  expected = "[D, C, B, A]";
        Collections.reverse(list);
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfIntListReverseOrderAndSort() {
        //given
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);

        //when
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(list, comparator);
        String  expected = "[3, 2, 1]";
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfDoubleListReverseOrderAndSort() {
        //given
        List<Double> list = new ArrayList<>(3);
        list.add(1.01D);
        list.add(1.02D);
        list.add(1.03D);


        //when
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(list, comparator);
        String  expected = "[1.03, 1.02, 1.01]";
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testOfStrListReverseOrderAndSort() {
        //given
        List<String> list = new ArrayList<>(4);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //when
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(list, comparator);
        String  expected = "[D, C, B, A]";
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

}