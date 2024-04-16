package ru.netology.account.accounts;

import ru.netology.account.balance.CheckBalance;

public abstract class Account implements CheckBalance {

    long balance;
    long limit;

    Account(long balance) {
        this.balance = balance;
    }


    public abstract boolean transfer(Account account, long amount);

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    

}
