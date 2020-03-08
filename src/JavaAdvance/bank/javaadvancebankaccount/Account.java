package JavaAdvance.bank.javaadvancebankaccount;

public class Account {


    private String number;
    protected int balance;
    private Client client;

    public Account(String number, int balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
        if(client == null){
            throw new NullPointerException("Brak klienta");
        }
    }

    public void deposit(int cash) {
        balance += cash;
    }

    public int withdraw(int cash) throws  NegatiweWithdrawExeption{
        if (cash < 0) {
            throw new NegatiweWithdrawExeption("Próba wypłaty mniej niż 0");
        }
        if (canWithdraw(cash)) {
            balance -= cash;
            return cash;
        } else {
            return 0;
        }
    }

    public int getBalance() {
        return balance;
    }

    public boolean transfer(Account target, int amount) {
        if (amount >0) {
            balance -= amount;
            target.balance += amount;
            return true;
        }
        throw new IllegalArgumentException("Kwota nie może być ujemna");

    }

    public String toString() {
        System.out.println(super.toString());
        return "Stan konta " + number + " to: " + balance ;
    }

    private boolean checkNoMinusBalanse(int cash) {
        return balance >= cash;
    }

    private boolean canWithdraw(int cash) {
        return balance >= cash;
    }


}
