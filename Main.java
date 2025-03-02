import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        //创建一个账户
        System.out.println("请输入账户持有者ID");
        int accountID = input.nextInt();
        System.out.println("请输入初始余额");
        double initialBlance = input.nextDouble();

        BankAccount account = new BankAccount(accountID, initialBlance);
        bank.addAccount(account);

        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 存款");
            System.out.println("2. 取款");
            System.out.println("3. 查询余额");
            System.out.println("4. 退出");

            int choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("请输入存款金额");
                    double depositAnount = input.nextDouble();
                    account.deposit(depositAnount);
                    break;
                case 2:
                    System.out.println("请输入取款金额");
                    double withdrawAnount = input.nextDouble();
                    account.withdraw(withdrawAnount);
                    break;
                case 3:
                    account.getBalance();
                    break;
                case 4:
                    System.out.println("正在退出系统");
                    input.close();
                    return;
                default:
                    System.out.println("无效选项，请重新选择");
            }
        }
    }
}
