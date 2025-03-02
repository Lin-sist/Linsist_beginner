import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    //添加账户
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    //查找账户
    public BankAccount getAccountById(int accountID) {
        for (BankAccount account : accounts) {
            if (account.getAccountHolderID() == accountID) {
                return account;
            }
        }
        return null;
    }
}
