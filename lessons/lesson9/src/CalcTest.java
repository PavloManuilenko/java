import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void shouldSumIntwithoutExceptions() {
        //given
        int a = 5, b = 7;
        int expected = a + b;
        //when
        int actual = Calc.sum(a, b);
        //then
        assertEquals(expected, actual);
    }
}
