package exercise1;

public class Account {
    int id;
    int amount;

    public Account() {
    }

    public Account(int id) {
        this.id = id;
    }

    public Account (int id, int amount){
        this.id = id;
        this.amount = amount;
    }

    int getID(){
        return this.id;
    }

    int getAmount(){
        return this.amount;
    }
}
