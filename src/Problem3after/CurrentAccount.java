package Problem3after;

public class CurrentAccount  implements  WithdrawableAccount{
    private double balance;
    public CurrentAccount(double balance){
        this.balance=balance;
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
