package ru.netology.account.accounts;

public class SimpleAccount extends Account {
    private long balance;

    public SimpleAccount(long balance) {
        super(balance);
        this.balance = balance;

    }

    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" add_1_Accept ");
            return true;
        } else {
            System.out.println(" add1_Недостаточно средств1, или меньше 0 ");
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if ((amount > 0) && (amount <= balance)) {
            balance -= amount;
            System.out.println(" pay_1_Accept ");
            return true;

        } else {
            System.out.println(" Pay1_Недостаточно средств1, или меньше 0 ");
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (!((amount > 0) && (amount <= balance)) || !account.add(amount)) {
            System.out.println(" 1Transfer_Недостаточно средств1, или меньше 0 ");

            return false;
        } else {
            System.out.println(" 1_Transfer Accept ");
            this.pay(amount);
            //account.add(amount);
            return true;
        }
    }

    @Override
    public long getBalance() {
        return balance;
    }
}
