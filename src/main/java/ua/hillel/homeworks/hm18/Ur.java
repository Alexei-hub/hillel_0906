package ua.hillel.homeworks.hm18;

public class Ur extends Client {
    public Ur(double balance) {
        super(balance);
    }

    @Override
    public void putMoney(double sum) {
        setBalance(getBalance() + sum);
    }

    @Override
   public void getMoney(double sum) {
        setBalance(getBalance() - sum);
    }

    @Override
    public void about() {
        System.out.println("Юридическое лицо");
        System.out.println("Условие депозита: Без комиссии");
        System.out.println("Условие вывода средств: 1% комиссии");
        System.out.println("Баланс: " + getBalance());
    }

    @Override
    public void showUserBalance() {
        super.showUserBalance();
        //реализация
    }
}
