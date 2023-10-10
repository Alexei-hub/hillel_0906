package ua.hillel.homeworks.hm18;

public class Ind extends Client {


    public Ind(double balance) {
        super(balance);
    }

    @Override
    public void putMoney(double sum) {

    }

    @Override
    public void getMoney(double sum) {

    }

    @Override
    public void about() {
        System.out.println("Физическое Лицо");
        System.out.println("Условие депозита: Без комиссии");
        System.out.println("Условие вывода средств: Без комиссии");
        System.out.println("Баланс: " + getBalance());
    }
}
