import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AListTest {

    AList list;

    @Before
    public void SetUp() {
        list = new AList();
    }

    @Test
    public void shouldAddElementAndReturnSizeOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.addLast(5);
        int actual = list.size();

        //then
        assertEquals("Error! Actual should 1", expected, actual);
    }

    @Test
    public void shouldCheckThatListIsEmpty() throws Exception {
        //given
        int expected = 0;

        //when
        int actual = list.size();

        //then
        assertEquals("Error! Actual should 0", expected, actual);
    }

    @Test
    public void shouldAddElementsAndReturnSizeTwo() throws Exception {
        //given
        int expected = 2;

        //when
        list.addLast(5);
        list.addLast(6);
        int actual = list.size();

        //then
        assertEquals("Error! Actual should 2", expected, actual);
    }

    @Test
    public void shouldAddMoreElementsIntoEndThanInitialSize() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.addLast(i + 1);
        }
        int actual = list.size();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldReturnLastAddedElement() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.addLast(i + 1);
        }
        int lastAddedIndex = list.size() - 1;
        int actual = list.get(lastAddedIndex);

        //then
        assertEquals("Error! Wrong last added index", expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetZeroElementAndThrowException() {
        //when
        list.get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetElevenElementAndThrowException() {
        //when
        list.get(11);
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetNegativeElementAndThrowException() {
        //when
        list.get(-1);
    }

    @Test
    public void shouldRemoveElementFromEmptyList() throws Exception {
        //given
        int expected = 0;

        //when
        list.removeLast();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }

    @Test
    public void shouldRemoveAddedElementFromList() throws Exception {
        //given
        int expected = 0;

        //when
        list.addLast(1);
        list.removeLast();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }

    @Test
    public void shouldRemoveSecondElementFromList() throws Exception {
        //given
        int expected = 1;

        //when
        list.addLast(1);
        list.addLast(2);
        list.removeLast();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }


    @Test
    public void shouldIncreaseArrayLength() throws Exception {
        //given
        int expected = (int)(8 * 1.5);

        //when
        for (int i = 0; i < 9; i++) {
            list.addLast(i + 1);
        }
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 12", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLength() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.addLast(i + 1);
        }
        list.removeLast();
        list.removeLast();
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLengthToTen() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.addLast(i + 1);
        }
        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.removeLast();
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldAddElementsIntoBeginAndEndOfArrayAndReturnSizeTwo() throws Exception {
        //given
        int expected = 2;

        //when
        list.addFirst(1);
        list.addLast(2);
        int actual = list.size();

        //then
        assertEquals("Error! Actual should be 2", expected, actual);
    }

    @Test
    public void shouldAddTwoElementsIntoBeginAndEndOfArrayAndReturnSizeThree() throws Exception {
        //given
        int expected = 3;

        //when
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        int actual = list.size();

        //then
        assertEquals("Error! Actual should be 3", expected, actual);
    }


    @Test
    public void shouldAddMoreElementsIntoBeginThanInitialSize() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.addFirst(i + 1);
        }
        int actual = list.size();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldReturnLastAddedIntoBeginElement() throws Exception {
        //given
        int expected = 11;
        int actual;
        //when
        for (int i = 0; i < 11; i++) {
            list.addFirst(i + 1);
            actual = list.get(i);
        }
        actual = list.get(0);

        //then
        assertEquals("Error! Wrong last added index", expected, actual);
    }

    //TEMP
    //
    //

    @Test
    public void shouldRemoveFirstElementFromEmptyList() throws Exception {
        //given
        int expected = 0;

        //when
        list.removeFirst();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }

    @Test
    public void shouldRemoveAddedFirstElementFromList() throws Exception {
        //given
        int expected = 0;

        //when
        list.addFirst(1);
        list.removeFirst();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementFromList() throws Exception {
        //given
        int expected = 1;

        //when
        list.addFirst(1);
        list.addFirst(2);
        list.removeFirst();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }

    @Test
    public void shouldIncreaseArrayLengthIfUseAddIntoBegin() throws Exception {
        //given
        int expected = (int)(8 * 1.5);

        //when
        for (int i = 0; i < 9; i++) {
            list.addFirst(i + 1);
        }
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLengthIfUseAddIntoBegin() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.addFirst(i + 1);
        }
        list.removeFirst();
        list.removeFirst();
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should be 10", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLengthToTenIfUseAddIntoBegin() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.addLast(i + 1);
        }
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldAddElementByIndex() throws Exception {
        //given
        int expected = 5;

        //when
        for (int i = 0; i < 5; i++) {
            list.addLast(i + 1);
        }
        list.addByIndex(5, 2);
        int actual = list.get(2);

        //then
        assertEquals("Error! Actual should be 5", expected, actual);
    }

    @Test
    public void shouldAddElementByIndexToTen() throws Exception {
        //given
        int expected = 100;

        //when
        for (int i = 0; i < 15; i++) {
            list.addLast(i + 1);
        }
        list.addByIndex(100, 10);
        int actual = list.get(10);

        //then
        assertEquals("Error! Actual should be 5", expected, actual);
    }

    @Test
    public void shouldAddElementByIndexToZeroIndex() throws Exception {
        //given
        int expected = 25;

        //when
        for (int i = 0; i < 10; i++) {
            list.addLast(i + 1);
        }
        list.addByIndex(25, 0);
        int actual = list.get(0);

        //then
        assertEquals("Error! Actual should be 25", expected, actual);
    }

    @Test
    public void shouldAddElementByIndexToLastIndex() throws Exception {
        //given
        int expected = 25;

        //when
        for (int i = 0; i < 10; i++) {
            list.addLast(i + 1);
        }
        list.addByIndex(25, 10);
        int actual = list.get(10);

        //then
        assertEquals("Error! Actual should be 25", expected, actual);
    }

    @Test
    public void shouldRemoveElemByIndex() throws Exception {
        //given
        int expected = 5;

        //when
        for (int i = 0; i < 10; i++) {
            list.addLast(i + 1);
        }
        list.removeByIndex(3);
        int actual = list.get(3);

        //then
        assertEquals("Error! Actual should be 6", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElemByIndex() throws Exception {
        //given
        int expected = 2;

        //when
        for (int i = 0; i < 10; i++) {
            list.addLast(i + 1);
        }
        list.removeByIndex(0);
        int actual = list.get(0);

        //then
        assertEquals("Error! Actual should be 2", expected, actual);
    }

    @Test
    public void shouldRemoveLastElemByIndex() throws Exception {
        //given
        int expected = 0;

        //when
        for (int i = 0; i < 10; i++) {
            list.addLast(i + 1);
        }
        list.removeByIndex(9);
        int actual = list.get(9);

        //then
        assertEquals("Error! Actual should be ", expected, actual);
    }


    @Test
    public void shouldIncreaseArrayLengthIfUseAddByIndex() throws Exception {
        //given
        int expected = (int)(8 * 1.5);

        //when
        for (int i = 0; i < 9; i++) {
            list.addByIndex(i + 1, i);
        }
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }
/*
    @Test
    public void shouldDecreaseArrayLengthIfUseAddIntoBegin() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.addFirst(i + 1);
        }
        list.removeFirst();
        list.removeFirst();
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should be 10", expected, actual);
    }
    */

}