package ua.dp.levelup.set;

import java.util.Comparator;

public class HomeFilters {

    public static Comparator<Home> streetComparator() {
        return new Comparator<Home>() {
            @Override
            public int compare(Home o1, Home o2) {
                int homeNumbers = Integer. compare(o1.getNumbers(), o2.getNumbers());
                int streetNames = o1.getStreetName().compareToIgnoreCase(o2.getStreetName());
                if (homeNumbers == 0 && streetNames ==0) return 0;
                else if (homeNumbers == 0) return streetNames;
                else return homeNumbers;
            }
        };
    }

}
