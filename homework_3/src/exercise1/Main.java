package exercise1;

public class Main {
    public static void main(String[] args){
        Account user1 = new Account(){
        };
        Account user2 = new Account(1){
        };
        Account user3 = new Account(2, 25){
        };

        System.out.println("User 1\nID: " + user1.getID() + "\nAmoun: " + user1.getAmount());
        System.out.println("\nUser 2\nID: " + user2.getID() + "\nAmoun: " + user2.getAmount());
        System.out.println("\nUser 3\nID: " + user3.getID() + "\nAmoun: " + user3.getAmount());
    }
}
