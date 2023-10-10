package ua.hillel.homeworks.hm18;

public class Viz extends Client {
    public Viz(double balance) {
        super(balance);
    }

    @Override
    public void putMoney(double sum) {
        setBalance(getBalance() + sum - 15);
    }

    @Override
    public void getMoney(double sum) {
        setBalance(getBalance() - sum - 15);
    }

    @Override
    public void about() {
        System.out.println("Индивидуальный Предприниматель");
        System.out.println("Условие депозита: 1% комиссии при сумме < 1000");
        System.out.println("Условие депозита: 0,5% комиссии, если сумма >= 1000");
        System.out.println("Условие вывода средств: Без комиссии");
        System.out.println("Баланс: " + getBalance());
    }
}
