public class Account {

    private String id;
    private String name;
    private int balance;


    Account() {

    }

    public void Account(String id, String name) {
        this.name=name;
        this.id=id;

    }


public void Account (String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;

}

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id){
        this.id=id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        if (amount > 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    public int debit (int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeds balance");
        }
        return this.balance;
    }

    public int transferTo (Account another, int amount){
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Transfer amount exceeds balance");
        }
        return this.balance;
    }

public String toString (){
        return "Account id is "+id+" Name "+name+" your Balance is "+balance;
}
}


