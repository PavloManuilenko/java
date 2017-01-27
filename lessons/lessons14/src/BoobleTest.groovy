import spock.lang.Specification

import static org.junit.Assert.assertArrayEquals

class BoobleTest extends Specification {

    def "BubbleSort test 1"() {
        int[] actual = [1, 5, 6, 8, 9, 10, 2, 3, 4, 7];
        int[] expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

        when:
        Booble.sort(actual)

        then:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test 2"() {
        int[] actual = [1];
        int[] expected = [1];

        when:
        Booble.sort(actual)

        then:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test 3"() {
        int[] actual = [4, 0, 2];
        int[] expected = [0, 2, 4];

        when:
        Booble.sort(actual)

        then:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test 4"() {
        int[] actual = [4, 0, -2];
        int[] expected = [-2, 0, 4];

        when:
        Booble.sort(actual)

        then:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test 5"() {
        int[] actual = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
        int[] expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

        when:
        Booble.sort(actual)

        then:
        assertArrayEquals(expected, actual)
    }
}