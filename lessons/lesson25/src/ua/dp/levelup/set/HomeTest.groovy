package ua.dp.levelup.set
import spock.lang.Specification

class HomeTest extends Specification {

    List<Home> list = Arrays.asList(
       new Home(1, "Street1", 2, 4),
       new Home(2, "Street2", 2, 4),
       new Home(3, "Street3", 2, 4),
       new Home(4, "Street4", 2, 4),
       new Home(5, "Street5", 2, 4),
       new Home(6, "Street6", 2, 4),
       new Home(2, "Lenina", 2, 4),
       new Home(8, "Street8", 2, 4),
       new Home(2, "Lenina", 2, 4),
       new Home(10, "Street10", 2, 4),
    );

    def 'check streetName comporator'() {
        when:
        Set<Home> homeSet = new TreeSet<>(streetComporator());

        then:
        homeSet.size() == 6
    }

}
