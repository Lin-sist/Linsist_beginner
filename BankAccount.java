public class BankAccount {
    //创建一个类BankAccount包括两个成员变量accountHolder和balance（属性）；
    private int accountHolderID;
    private double balance;

    //构造函数：初始化账户持有者的ID和账户余额；
    public BankAccount(int accountHolderID, double balance) {
        this.accountHolderID = accountHolderID;
        this.balance =balance;
    }

    public int getAccountHolderID() {
        return accountHolderID;
    }

    //存款方法，amount用于接受所存取的金额
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功,当前余额：" + balance);
        } else {
            System.out.println("存款失败,请重新存取");
        }
    }
    //取款方法
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("取款成功，当前余额:" + balance);
        } else {
            System.out.println("余额不足或取款金额低于0元");
        }
    }
    //查询余额方法
    public void getBalance() {
        System.out.println("当前余额为:" + balance);
    }
}
