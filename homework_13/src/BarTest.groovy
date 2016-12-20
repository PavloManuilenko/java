class BarTest extends spock.lang.Specification {

    def "should return string of bar"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\n"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }
}
