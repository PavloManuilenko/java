class BarTest extends spock.lang.Specification {

    def "should return string of empty bar"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return string of bar with one added waiter"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName: Alex, years old: 30\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return string of bar with full staff of waiter even if try to hire more waiter than bar can hold"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        for (int i = 0; i < 20; i++) {
            bar.hireEmployee("Waiter", (byte)(30 + i), "waiter")
        }
        bar.hireEmployee("WaiterOver", (byte)50, "waiter")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\""
        for (int i = 49; i > 29; i--) {
            expected += "\nName: Waiter, years old: " + i
        }
        expected += "\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return string of bar with one added barman + default bailiwick cocktail"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Bob", (byte)40, "Barman")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName: Bob, years old: 40, bailiwick cocktail: Beer\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }


    def "should return string of bar with full staff of barmen even if try to hire more barmen than bar can hold"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        for (int i = 0; i < 10; i++) {
            bar.hireEmployee("Waiter", (byte)(35 + i), "barman")
        }
        bar.hireEmployee("BarmanOver", (byte)50, "barman")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\""
        for (int i = 49; i > 29; i--) {
            expected += "\nName: Waiter, years old: " + i
        }
        expected += "\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }


}
