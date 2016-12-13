import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        list.add(5);
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
        list.add(5);
        list.add(6);
        int actual = list.size();

        //then
        assertEquals("Error! Actual should 2", expected, actual);
    }

    @Test
    public void shouldAddMoreElementsThanInitialSize() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        int actual = list.size();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldRerurnLastAddedElement() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
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
        list.remove();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }

    @Test
    public void shouldRemoveAddedElementFromList() throws Exception {
        //given
        int expected = 0;

        //when
        list.add(1);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("Error!", expected, actual);
    }

    @Test
    public void shouldRemoveSecondElementFromList() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove();
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
            list.add(i + 1);
        }
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLength() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
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
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        int actual = list.getArrLength();

        //then
        assertEquals("Error! Actual should 11", expected, actual);
    }
}