package ua.hillel.homeworks.hm18;

public abstract class Client {

    public Client(double balance) {
        this.balance = balance;
    }

    private double balance;

    abstract public void putMoney(double sum);

    abstract public void getMoney(double sum);

    abstract public void about();

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void showUserBalance() {
        System.out.println("Current user balance is " + getBalance() + "$.");
    }

}
