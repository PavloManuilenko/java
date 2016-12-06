public class Main {

    public static void main(String[] args) {

        Country country1 = new Country();
        Country country2 = new Country();

        country1.setName("Ukraine");
        country2.setName("Ukraine");
        country1.setPopulation(40000000);
        country2.setPopulation(40000000);

        boolean ans = country1.equals(country2);

        System.out.println("equals: " + ans);
    }
}
