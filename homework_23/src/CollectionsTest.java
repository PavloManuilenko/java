import org.junit.Test;

import java.util.ArrayList;
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

}