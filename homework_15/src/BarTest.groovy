class BarTest extends spock.lang.Specification {

    //toString of Bar
    def "should return string of empty bar"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    //waiters
    def "should return string of bar with one added waiter"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)

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
            bar.hireEmployee("Waiter", (byte)(30 + i), "waiter", bar)
        }
        bar.hireEmployee("WaiterOver", (byte)50, "waiter", bar)

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

    //barmen
    def "should return string of bar with one added barman + default bailiwick cocktail"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Bob", (byte)40, "Barman", bar)

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
            bar.hireEmployee("Barman", (byte)(35 + i), "barman", bar)
        }
        bar.hireEmployee("BarmanOver", (byte)45, "barman", bar)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\""
        for (int i = 44; i > 34; i--) {
            expected += "\nName: Barman, years old: " + i + ", bailiwick cocktail: Beer"
        }
        expected += "\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return string of bar with one added barman with bailiwick cocktail"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Tom", (byte)22, "Barman", bar)
        bar.setBailiwickCocktail("B-52", 0)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName: Tom, years old: 22, bailiwick cocktail: B-52\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return string of bar with full staff of barmen with bailiwick cocktails"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        for (int i = 0; i < 10; i++) {
            bar.hireEmployee("Barman", (byte)(35 + i), "barman", bar)
            bar.setBailiwickCocktail("B-5" + i, i)
        }
        bar.hireEmployee("BarmanOver", (byte)45, "barman", bar)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\""
        for (int i = 44; i > 34; i--) {

            expected += "\nName: Barman, years old: " + i + ", bailiwick cocktail: B-" + (i+15)
        }
        expected += "\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    //waiters & barmen
    def "should return string of bar with full staff of barmen and waiters"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        for (int i = 0; i < 20; i++) {
            bar.hireEmployee("Waiter", (byte)(30 + i), "waiter", bar)
        }
        for (int i = 0; i < 10; i++) {
            bar.hireEmployee("Barman", (byte)(35 + i), "barman", bar)
        }

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\""
        for (int i = 44; i > 34; i--) {
            expected += "\nName: Barman, years old: " + i + ", bailiwick cocktail: Beer"
        }
        for (int i = 49; i > 29; i--) {
            expected += "\nName: Waiter, years old: " + i
        }
        expected += "\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    //firing
    def "should return only string of bar if fired one existing waiter"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        bar.fireEmployee("Alex", "waiter")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return string of bar with one waiter after firing of all other staff"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        for (int i = 0; i < 20; i++) {
            bar.hireEmployee("Waiter", (byte)(30 + i), "waiter", bar)
        }
        for (int i = 0; i < 19; i++) {
            bar.fireEmployee("Waiter", "waiter")
        }

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName: Waiter, years old: 30\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return only string of bar if fired one existing barman"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Tom", (byte)30, "barman", bar)
        bar.fireEmployee("Tom", "barman")

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should return string of bar with one barman after firing of all other staff"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        for (int i = 0; i < 10; i++) {
            bar.hireEmployee("Barman", (byte)(30 + i), "barman", bar)
        }
        for (int i = 0; i < 9; i++) {
            bar.fireEmployee("Barman", "barman")
        }

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName: Barman, years old: 30, bailiwick cocktail: Beer\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    //drinks
    def "should add to storage one drink"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink darkBeer = new Drink("Dark Beer", 50)
        bar.addToStorage(darkBeer)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName of drink: Dark Beer, count of item: 50\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        actual == expected
    }

    def "should add to storage all drinks fom menu"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink lager = new Drink("Lager", 90)
        Drink darkBeer = new Drink("Dark Beer", 80)
        Drink whiskey = new Drink("Whiskey", 70)
        Drink rum = new Drink("Rum", 60)
        Drink vodka = new Drink("Vodka", 50)

        bar.addToStorage(lager)
        bar.addToStorage(darkBeer)
        bar.addToStorage(whiskey)
        bar.addToStorage(rum)
        bar.addToStorage(vodka)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName of drink: Vodka, count of item: 50" +
                "\nName of drink: Rum, count of item: 60\nName of drink: Whiskey, count of item: 70" +
                "\nName of drink: Dark Beer, count of item: 80" +
                "\nName of drink: Lager, count of item: 90\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should refill the drink which just added to storage"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink darkBeer = new Drink("Dark Beer", 50)
        bar.addToStorage(darkBeer)

        Drink refillDarkBeer = new Drink("Dark Beer", 50)
        bar.addToStorage(refillDarkBeer)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName of drink: Dark Beer, count of item: 100\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "should refill storage for all drinks fom menu"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink lager = new Drink("Lager", 90)
        Drink darkBeer = new Drink("Dark Beer", 80)
        Drink whiskey = new Drink("Whiskey", 70)
        Drink rum = new Drink("Rum", 60)
        Drink vodka = new Drink("Vodka", 50)

        bar.addToStorage(lager)
        bar.addToStorage(darkBeer)
        bar.addToStorage(whiskey)
        bar.addToStorage(rum)
        bar.addToStorage(vodka)

        bar.addToStorage(lager)
        bar.addToStorage(darkBeer)
        bar.addToStorage(whiskey)
        bar.addToStorage(rum)
        bar.addToStorage(vodka)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName of drink: Vodka, count of item: 100" +
                "\nName of drink: Rum, count of item: 120\nName of drink: Whiskey, count of item: 140" +
                "\nName of drink: Dark Beer, count of item: 160" +
                "\nName of drink: Lager, count of item: 180\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    def "try to add to storage more drinks than in menu"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink lager = new Drink("Lager", 90)
        Drink darkBeer = new Drink("Dark Beer", 80)
        Drink whiskey = new Drink("Whiskey", 70)
        Drink rum = new Drink("Rum", 60)
        Drink vodka = new Drink("Vodka", 50)
        Drink water = new Drink("Water", 50)

        bar.addToStorage(lager)
        bar.addToStorage(darkBeer)
        bar.addToStorage(whiskey)
        bar.addToStorage(rum)
        bar.addToStorage(vodka)
        bar.addToStorage(water)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName of drink: Vodka, count of item: 50" +
                "\nName of drink: Rum, count of item: 60\nName of drink: Whiskey, count of item: 70" +
                "\nName of drink: Dark Beer, count of item: 80" +
                "\nName of drink: Lager, count of item: 90\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        expected == actual
    }

    //takeOrder
    def "should take one order"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        bar.waiters[0].takeOrder("Dark Beer", 1)
        def expected = "Order number: 1, name of drink: Dark Beer, count of item: 1"
        def actual = bar.orders[0].toString()

        then: "verify"
        actual == expected
    }

    def "should take max-possible orders"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        for (int i = 0; i < bar.orders.length; i++) {
            bar.waiters[0].takeOrder("Dark Beer", 1)
        }
        def expected = 0
        def actual = bar.volumeOfOrders

        then: "verify"
        actual == expected
    }

    def "try to take more than max-possible orders"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        for (int i = 0; i < bar.orders.length; i++) {
            bar.waiters[0].takeOrder("Dark Beer", 1)
        }
        def expected = "Sorry, we can't accept a new order, please wait for a while."
        def actual = bar.waiters[0].takeOrder("Dark Beer", 1)

        then: "verify"
        actual == expected
    }

    def "exception if try to order more item of dink than bar has"() {
        when: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)
        bar.waiters[0].takeOrder("Dark Beer", 2)

        then: "verify"
        thrown OrderDrinkOverException;
    }

    def "try to order 0 item"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        def expected = "Sorry, but order like this is impossible to order."
        def actual = bar.waiters[0].takeOrder("Dark Beer", 0)

        then: "verify"
        actual == expected
    }

    def "try to order -1 item"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        def expected = "Sorry, but order like this is impossible to order."
        def actual = bar.waiters[0].takeOrder("Dark Beer", -1)

        then: "verify"
        actual == expected
    }

    //completeOrder
    def "should remove one added order from order list"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        bar.waiters[0].takeOrder("Dark Beer", 1)
        bar.barmen[0].completeOrder("Dark Beer", 1)
        def expected = null
        def actual = bar.orders[0]

        then: "verify"
        actual == expected
    }

    def "should make count of item smaller if complete one order"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink darkBeer = new Drink("Dark Beer", 2)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        bar.waiters[0].takeOrder("Dark Beer", 1)
        bar.waiters[0].takeOrder("Dark Beer", 1)
        bar.barmen[0].completeOrder("Dark Beer", 1)
        def expected = "Name of drink: Dark Beer, count of item: 1"
        def actual = bar.drinks[0].toString()

        then: "verify"
        actual == expected
    }

    def "should delete drink if it was finished"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink darkBeer = new Drink("Dark Beer", 1)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        bar.waiters[0].takeOrder("Dark Beer", 1)
        bar.barmen[0].completeOrder("Dark Beer", 1)
        def expected = null
        def actual = bar.drinks[0]

        then: "verify"
        actual == expected
    }

    def "should delete one (first) drink if it was finished from full storage"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink Beer1 = new Drink("Beer1", 1)
        Drink Beer2 = new Drink("Beer2", 1)
        Drink Beer3 = new Drink("Beer3", 1)
        Drink Beer4 = new Drink("Beer4", 1)
        Drink Beer5 = new Drink("Beer5", 1)
        bar.addToStorage(Beer1)
        bar.addToStorage(Beer2)
        bar.addToStorage(Beer3)
        bar.addToStorage(Beer4)
        bar.addToStorage(Beer5)

        when: "creation of expecting"
        bar.waiters[0].takeOrder("Beer1", 1)
        bar.barmen[0].completeOrder("Beer1", 1)
        def expected = "[Name of drink: Beer2, count of item: 1, Name of drink: Beer3, count of item: 1," +
                " Name of drink: Beer4, count of item: 1, Name of drink: Beer5, count of item: 1, null]"
        def actual = bar.drinks.toString();

        then: "verify"
        actual == expected
    }

    def "should delete one (last) drink if it was finished from full storage"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink Beer1 = new Drink("Beer1", 1)
        Drink Beer2 = new Drink("Beer2", 1)
        Drink Beer3 = new Drink("Beer3", 1)
        Drink Beer4 = new Drink("Beer4", 1)
        Drink Beer5 = new Drink("Beer5", 1)
        bar.addToStorage(Beer1)
        bar.addToStorage(Beer2)
        bar.addToStorage(Beer3)
        bar.addToStorage(Beer4)
        bar.addToStorage(Beer5)

        when: "creation of expecting"
        bar.waiters[0].takeOrder("Beer5", 1)
        bar.barmen[0].completeOrder("Beer5", 1)
        def expected = "[Name of drink: Beer1, count of item: 1, Name of drink: Beer2, count of item: 1," +
                " Name of drink: Beer3, count of item: 1, Name of drink: Beer4, count of item: 1, null]"
        def actual = bar.drinks.toString();

        then: "verify"
        actual == expected
    }

    def "should complete all orders from max order list"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink darkBeer = new Drink("Dark Beer", 30)
        bar.addToStorage(darkBeer)

        when: "creation of expecting"
        for (int i = 0; i < bar.orders.length; i++) {
            bar.waiters[0].takeOrder("Dark Beer", 1)
        }
        for (int i = 0; i < bar.orders.length; i++) {
            bar.barmen[0].completeOrder("Dark Beer", 1)
        }
        def expected = bar.orders.length - bar.volumeOfOrders
        def actual = 0

        then: "verify"
        actual == expected
    }

    def "should complete different orders (except one) from order list"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink lager = new Drink("Lager", 2)
        Drink darkBeer = new Drink("Dark Beer", 2)
        Drink whiskey = new Drink("Whiskey", 2)
        Drink rum = new Drink("Rum", 2)
        Drink vodka = new Drink("Vodka", 2)
        bar.addToStorage(lager)
        bar.addToStorage(darkBeer)
        bar.addToStorage(whiskey)
        bar.addToStorage(rum)
        bar.addToStorage(vodka)
        when: "creation of expecting"
        bar.waiters[0].takeOrder("Lager", 1)
        bar.waiters[0].takeOrder("Dark Beer", 1)
        bar.waiters[0].takeOrder("Whiskey", 1)
        bar.waiters[0].takeOrder("Rum", 1)
        bar.waiters[0].takeOrder("Vodka", 1)
        bar.waiters[0].takeOrder("Lager", 1)
        bar.waiters[0].takeOrder("Dark Beer", 1)
        bar.waiters[0].takeOrder("Whiskey", 1)
        bar.waiters[0].takeOrder("Rum", 1)
        bar.waiters[0].takeOrder("Vodka", 1)
        bar.barmen[0].completeOrder("Lager", 1)
        bar.barmen[0].completeOrder("Dark Beer", 1)
        bar.barmen[0].completeOrder("Whiskey", 1)
        bar.barmen[0].completeOrder("Rum", 1)
        bar.barmen[0].completeOrder("Vodka", 1)
        bar.barmen[0].completeOrder("Dark Beer", 1)
        bar.barmen[0].completeOrder("Whiskey", 1)
        bar.barmen[0].completeOrder("Rum", 1)
        bar.barmen[0].completeOrder("Vodka", 1)
        def expected = 1
        def actual = bar.orders.length - bar.volumeOfOrders
        then: "verify"
        actual == expected
    }

    //takeTips & divideTips
    def "should add tips to the Bar"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        when: "creation of expecting"
        bar.waiters[0].takeTips(50)
        def expected = 50
        def actual = bar.tips
        then: "strings compare"
        actual == expected
    }

    def "should add sum to the Bar if take tips used"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        when: "creation of expecting"
        bar.waiters[0].takeTips(50)
        bar.waiters[0].takeTips(100)
        def expected = 150
        def actual = bar.tips
        then: "strings compare"
        actual == expected
    }

    def "should return 0 tips if it was divided"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        bar.hireEmployee("Tom", (byte)25, "waiter", bar)
        bar.hireEmployee("Peter", (byte)35, "barman", bar)
        when: "creation of expecting"
        bar.waiters[0].takeTips(100)
        bar.waiters[1].takeTips(100)
        bar.divideTips()
        def expected = 0
        def actual = bar.tips
        then: "strings compare"
        actual == expected
    }

    def "should divide tips for all staff"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        bar.hireEmployee("Tom", (byte)25, "waiter", bar)
        bar.hireEmployee("Peter", (byte)35, "barman", bar)
        when: "creation of expecting"
        bar.waiters[0].takeTips(150)
        bar.waiters[1].takeTips(150)
        bar.divideTips()
        def expected = 300 / 3
        def actual = bar.tipsForEach;
        then: "strings compare"
        actual == expected
    }

    def "should return exception if tips = 0"() {
        when: "creation of expecting"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        bar.waiters[0].takeTips(0)
        then: "strings compare"
        thrown NegativeTipsException;
    }

    def "should return exception if tips < 0"() {
        when: "creation of expecting"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        bar.waiters[0].takeTips(-1)
        then: "strings compare"
        thrown NegativeTipsException;
    }

    //max bar's kind of item toString
    def "should return string of complete bar"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Tom", (byte)25, "waiter", bar)
        bar.hireEmployee("Peter", (byte)35, "barman", bar)
        Drink beer = new Drink("Beer", 2)
        bar.addToStorage(beer)
        bar.waiters[0].takeOrder("Beer", 1)
        bar.waiters[0].takeTips(50)
        when: "creation of expecting"
        def expected = "Bar: \"The Blue Oyster\"\nName: Peter, years old: 35, bailiwick cocktail: Beer\nName: Tom, years old: 25\nName of drink: Beer, count of item: 2\n\nTips: 50"
        def actual = bar.toString()

        then: "strings compare"
        actual == expected
    }

    //getDrinkCount
    def "should return one drink's count"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink beer = new Drink("Beer", 17)
        bar.addToStorage(beer)

        when: "creation of expecting string"
        def expected = 17
        def actual = bar.getDrinkCount("Beer")

        then: "strings compare"
        actual == expected
    }

    def "should return one of some drink's count"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink beer = new Drink("Beer", 17)
        Drink lager = new Drink("Lager", 25)
        Drink wine = new Drink("Wine", 10)
        bar.addToStorage(beer)
        bar.addToStorage(lager)
        bar.addToStorage(wine)

        when: "creation of expecting string"
        def expected = 25
        def actual = bar.getDrinkCount("Lager")

        then: "strings compare"
        actual == expected
    }

    def "should return flag if drink is absent"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink lager = new Drink("Lager", 25)
        bar.addToStorage(lager)

        when: "creation of expecting string"
        def expected = -1
        def actual = bar.getDrinkCount("Lage")

        then: "strings compare"
        actual == expected
    }

    def "should return flag if drink was finished"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Pity", (byte)18, "waiter", bar)
        bar.hireEmployee("Rob", (byte)25, "barman", bar)
        Drink lager = new Drink("Lager", 1)
        bar.addToStorage(lager)

        when: "creation of expecting"
        bar.waiters[0].takeOrder("Lager", 1)
        bar.barmen[0].completeOrder("Lager", 1)

        def expected = -1
        def actual = bar.getDrinkCount("Lager")

        then: "strings compare"
        actual == expected
    }

    //getDrinkByName
    def "should return Drink by name"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink beer = new Drink("Beer", 17)
        bar.addToStorage(beer)

        when: "creation of expecting string"
        def expected = beer
        def actual = bar.getDrinkByName("Beer")

        then: "strings compare"
        actual == expected
    }

    def "should return Drink by name from max-list of drinks" () {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink beer = new Drink("Beer", 5)
        Drink lager = new Drink("Lager", 10)
        Drink wine = new Drink("Wine", 15)
        Drink voter = new Drink("Voter", 20)
        Drink juice = new Drink("Juice", 25)
        bar.addToStorage(beer)
        bar.addToStorage(lager)
        bar.addToStorage(wine)
        bar.addToStorage(juice)
        bar.addToStorage(voter)

        when: "creation of expecting string"
        def expected = voter
        def actual = bar.getDrinkByName("Voter")

        then: "strings compare"
        actual == expected
    }

    def "should return null if Drink wasn't found"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Drink beer = new Drink("Beer", 17)
        bar.addToStorage(beer)

        when: "creation of expecting string"
        def expected = null
        def actual = bar.getDrinkByName("Bee")

        then: "strings compare"
        actual == expected
    }

    //NotExistBarException
    def "exception if bar not exist"() {
        when: "bar is null"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", null)

        then:
        thrown NotExistBarException;
    }

    //Different kind of drink
    def "should add to storage each kind of drink"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        Beer beer = new Beer(1)
        CocaCola cola = new CocaCola(2)
        Juice juice = new Juice(3)
        Vodka vodka = new Vodka(4)
        bar.addToStorage(beer)
        bar.addToStorage(cola)
        bar.addToStorage(juice)
        bar.addToStorage(vodka)

        when: "creation of expecting string"
        def expected = "Bar: \"The Blue Oyster\"\nName of drink: Vodka, count of item: 4, volume: 0.7, price: 100" +
                "\nName of drink: Juice, count of item: 3, volume: 0.5, price: 15" +
                "\nName of drink: Coca-Cola, count of item: 2, volume: 0.3, price: 10" +
                "\nName of drink: Beer, count of item: 1, volume: 0.5, price: 25\n\nTips: 0"
        def actual = bar.toString()

        then: "strings compare"
        actual == expected
    }

    //method of calculating the amount of the order
    def "should return the amount of the possible order"() {
        given: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        Beer beer = new Beer(2)
        Juice juice = new Juice(2)
        CocaCola cola = new CocaCola(2)
        bar.addToStorage(beer)
        bar.addToStorage(juice)
        bar.addToStorage(cola)

        when: "creation of expecting string"
        def expected = 30
        def actual = bar.waiters[0].calcTheAmountOfTheOrder("juice", 2)

        then: "compare actual and expected"
        actual == expected
    }

    def "should return the exception if drink was not found when try to calc amount of the possible order"() {
        when: "bar initialize"
        Bar bar = new Bar("The Blue Oyster")
        bar.hireEmployee("Alex", (byte)30, "waiter", bar)
        Beer beer = new Beer(1)
        bar.addToStorage(beer)
        bar.waiters[0].calcTheAmountOfTheOrder("juice", 1)

        then:
        thrown DrinkNotFoundException
    }
}