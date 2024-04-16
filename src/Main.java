import ru.netology.account.accounts.Account;
import ru.netology.account.accounts.CreditAccount;
import ru.netology.account.accounts.SimpleAccount;

class Main {
    public static void main(String[] args) {

        Account simpleAccount = new SimpleAccount(3);
        Account creditAccount = new CreditAccount(10, 100);

        //creditAccount.transfer(simpleAccount, 7);
        simpleAccount.transfer(creditAccount, 4);
        // simpleAccount.add(2);
        //simpleAccount.pay(3);
        // creditAccount.add(3);
        // System.out.println(simpleAccount.transfer(creditAccount, 5));
        System.out.println(simpleAccount.getBalance());
        System.out.println(creditAccount.getBalance());

    }
}