package ru.netology.account.accounts;

public class CreditAccount extends Account {
    public CreditAccount(long balance, long limit) {
        super(balance);
        this.balance = balance;
        this.limit = limit;
        if (balance > limit) {
            System.out.println("Внимание. Превышено допустимое  значене баланса");
        }
    }

    @Override
    public boolean pay(long amount) {
        if ((amount > 0) && (amount <= balance)) {
            balance -= amount;
            System.out.println(" pay_2_Accept ");
            return true;


        } else {
            System.out.println("pay2_Превышен баланс, или меньше 0");
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (!((amount > 0) && (amount <= balance)) || !account.add(amount)) {
            System.out.println(" 2Transfer_Недостаточно средств2, или меньше 0 ");

            return false;
        } else {
            System.out.println(" 2_Transfer Accept ");
            this.pay(amount);
            //account.add(amount);
            return true;
        }
    }


    @Override
    public boolean add(long amount) {
        if ((amount > 0) && (balance + amount <= limit)) {
            balance += amount;
            System.out.println(" add_2_Accept ");
            return true;
        } else {
            System.out.println("add2_Превышен лимит, или меньше 0");
            return false;
        }
    }

    @Override
    public long getBalance() {
        return balance;

    }
}
