package JavaAdvance.bank.account;

public class CreditAccount extends Account {
    public CreditAccount(String number, int balance, Client client) {
        super(number, balance, client);
    }


    @Override
    public int withdraw(int cash) {
        super.balance -= cash;
        return cash;
    }
}
