package ru.netology.account.accounts;

import org.junit.Assert;
import org.junit.Test;

public class CreditAccountTest {


    @Test
    public void pay() {
//boolean expected;
//long actual;
        Account simpleAccount = new SimpleAccount(3);
        Account creditAccount = new CreditAccount(25, 30);
        long amount = 2;
        // creditAccount.transfer(simpleAccount, 7);
        boolean actual = creditAccount.pay(amount);
        boolean expexted = ((amount > 0) && (amount <= creditAccount.balance));
        if ((amount > 0) && (amount <= creditAccount.balance)) {
            creditAccount.balance -= amount;
            System.out.println(" pay_2_Accept ");
            // expected=creditAccount.balance;


        } else {
            System.out.println("pay2_Превышен баланс, или меньше 0");

        }
        Assert.assertEquals(expexted, actual);
    }

    @Test
    public void transfer() {
        Account simpleAccount = new SimpleAccount(14);
        Account creditAccount = new CreditAccount(10, 18);
        long amount = 13;
        boolean actual = creditAccount.add(amount);
        boolean expected = simpleAccount.pay(amount);
        boolean delta = simpleAccount.transfer(creditAccount, amount);
        if (!((amount > 0) && (amount <= simpleAccount.balance)) || !creditAccount.add(amount)) {

            System.out.println(" 2Transfer_Недостаточно средств2, или меньше 0 ");


        } else {
            System.out.println(" 2_Transfer Accept ");
            simpleAccount.pay(amount);
            //account.add(amount);

        }
        // Assert.assertEquals(expexted,actual);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void add() {
    }

    @Test
    public void getBalance() {
    }
}