package PBay;

public class User {

    private String name;
    private double accountBalance;

    public User(String name){
        this.name = name;
        accountBalance = 0;
    }

    public String getName(){return name;}

    public double getAccountBalance(){return accountBalance;}

    public double updateBalance(double add){
        accountBalance = accountBalance + add;
        return accountBalance;
    }

    public String toString(){
        return name + "'s balance is $" + accountBalance;
        //“Mike Trout’s balance is $35.17”
    }
}
