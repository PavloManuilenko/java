import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test extends Main {


    String[] args = new String[] {"true"};

    @Test
    public void shouldReturnDaysInJanuary() {
        //given
        int expected = 31;

        //when
        int actual = daysOfMonth((byte) 1, args);

        //then
        assertEquals("Error! 31 days in January.", expected, actual);
    }

    @Test
    public void shouldReturnDaysInFebruaryForLeapYear() {
        //given
        int expected = 29;

        //when
        int actual = daysOfMonth((byte) 2, args);

        //then
        assertEquals("Error! 29 days in February if it's a Leap year.", expected, actual);
    }

    @Test
    public void shouldReturnDaysInFebruaryForNonLeapYear() {
        //given
        int expected = 28;

        //when
        args[0] = "false";
        int actual = daysOfMonth((byte) 2, args);

        //then
        assertEquals("Error! 28 days in February if it is No a Leap year.", expected, actual);
    }

    @Test
    public void shouldReturnSumOfDaysForLeapYear() {
        //given
        int expected = 366;

        //when
        args[0] = "true";
        int actual = 0;
        for (byte i = 1; i <= 12; i++) {
            actual += daysOfMonth(i, args);
        }

        //then
        assertEquals("Error! Expected: 366 days.", expected, actual);
    }

    @Test
    public void shouldReturnSumOfDaysForNonLeapYear() {
        //given
        int expected = 365;

        //when
        args[0] = "false";
        int actual = 0;
        for (byte i = 1; i <= 12; i++) {
            actual += daysOfMonth(i, args);
        }

        //then
        assertEquals("Error! Expected: 365 days.", expected, actual);
    }
}