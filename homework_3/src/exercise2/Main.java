package exercise2;

public class Main {
    public static void main (String[] args){

        //Sharks
        Shark reefShark = new Shark(true, "Primitive sea stuff", (byte) 0, "Reef shark"){
        };
        System.out.println("\nShark one:\nType: "+ reefShark.getTypeOfShark());
        System.out.println("Food: "+ reefShark.getEats());
        System.out.println("Number of legs: " + reefShark.getNoOfLegs());
        System.out.println("Vegetarian: "+ reefShark.isVegetarian());

        Shark whiteShark = new Shark("Different sea animals"){
        };
        System.out.println("\nShark two:\nType: "+ whiteShark.getTypeOfShark());
        System.out.println("Food: "+ whiteShark.getEats());
        System.out.println("Number of legs: " + whiteShark.getNoOfLegs());
        System.out.println("Vegetarian: "+ whiteShark.isVegetarian());

        Shark whiteShark2 = new Shark(){
        };
        System.out.println("\nShark tree:\nType: "+ whiteShark2.getTypeOfShark());
        System.out.println("Food: "+ whiteShark2.getEats());
        System.out.println("Number of legs: " + whiteShark2.getNoOfLegs());
        System.out.println("Vegetarian: "+ whiteShark2.isVegetarian());

        //Eagles
        Eagle americanEagle = new Eagle(false,"small and middle animals", (byte) 2, 10){
        };
        System.out.println("\nEagle one\nVegetarian: " + americanEagle.isVegetarian());
        System.out.println("Food: " + americanEagle.getEats());
        System.out.println("Number of legs: " + americanEagle.getNoOfLegs());
        System.out.println("Lifetime: " + americanEagle.getLifetime() + " years");

        Eagle berkut = new Eagle(false,"rodents, etc.", (byte) 2){
        };
        System.out.println("\nEagle two\nVegetarian: " + berkut.isVegetarian());
        System.out.println("Food: " + berkut.getEats());
        System.out.println("Number of legs: " + berkut.getNoOfLegs());
        System.out.println("Lifetime: " + berkut.getLifetime() + " years");

        Eagle  regularEagle = new Eagle("small and middle animals, etc."){
        };
        System.out.println("\nEagle three\nVegetarian: " + regularEagle.isVegetarian());
        System.out.println("Food: " + regularEagle.getEats());
        System.out.println("Number of legs: " + regularEagle.getNoOfLegs());
        System.out.println("Lifetime: " + regularEagle.getLifetime() + " years");

        Eagle  regularEagle2 = new Eagle(){
        };
        System.out.println("\nEagle four\nVegetarian: " + regularEagle2.isVegetarian());
        System.out.println("Food: " + regularEagle2.getEats());
        System.out.println("Number of legs: " + regularEagle2.getNoOfLegs());
        System.out.println("Lifetime: " + regularEagle2.getLifetime() + " years");

        //Cows
        Cow burenka = new Cow(true, "Grass", (byte) 4, false){
        };
        System.out.println("\nCow one\nVegetarian: " + burenka.isVegetarian());
        System.out.println("Food: " + burenka.getEats());
        System.out.println("Number of legs: " + burenka.getNoOfLegs());
        System.out.println("Hoof: " + burenka.isHoof());

        Cow mashka = new Cow(true, "Grass", (byte) 4){
        };
        System.out.println("\nCow two\nVegetarian: " + mashka.isVegetarian());
        System.out.println("Food: " + mashka.getEats());
        System.out.println("Number of legs: " + mashka.getNoOfLegs());
        System.out.println("Hoof: " + mashka.isHoof());

        Cow borya = new Cow(true){
        };
        System.out.println("\nCow three\nVegetarian: " + borya.isVegetarian());
        System.out.println("Food: " + borya.getEats());
        System.out.println("Number of legs: " + borya.getNoOfLegs());
        System.out.println("Hoof: " + borya.isHoof());

        Cow marusya = new Cow(){
        };
        System.out.println("\nCow four\nVegetarian: " + marusya.isVegetarian());
        System.out.println("Food: " + marusya.getEats());
        System.out.println("Number of legs: " + marusya.getNoOfLegs());
        System.out.println("Hoof: " + marusya.isHoof());
    }
}