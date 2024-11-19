import java.util.Scanner;

public class ATM {

    Scanner sc = new Scanner(System.in);
    Account acc = new Account();

    // Withdraw
    public void withdraw(Account acc) {
        System.out.print("Enter money to withdraw: ");
        double money = sc.nextDouble();
        if ( money < acc.getAmount()) {
            // System.out.println(acc.getAmount() - money);
            acc.withdraw(money);
        }
        
    }

    // Deposit
    public void deposit(Account ac) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        ac.deposit(amount);
    }

    // View
    public void viewAmount(Account ac) {
        ac.viewAmount();
    }

    // Tranfer
    public void transferMoney(Account acc1, Account acc2) {

        System.out.println("Choose way to get money \n acc1:(acc1 --> acc2) \n acc2:(acc2 --> acc1) ");
        String a1 = "acc1";
        String a2 = "acc2";
        String acc = sc.nextLine();
        System.out.println("acc1 --> acc2");

        System.out.println("Enter amount of money to transfer: ");
        double amount = sc.nextDouble();

        if (acc.equalsIgnoreCase(a1)) {
            if (acc1.getAmount() >= amount) {
                acc1.withdraw(amount);
                acc2.deposit(amount);
                System.out.println("Amount of money in acc1 has been send to acc2: " + amount);
                System.out.println("Transfer money sucessfull");
            }
            else {
                System.out.println("Error in transfer money!");
            }
        }
        else if ( acc.equalsIgnoreCase(a2)) {
            if (acc2.getAmount() >= amount) {
                acc2.withdraw(amount);
                acc1.deposit(amount);
                System.out.println("Amount of money in acc2 has been send to acc1: " + amount);
                System.out.println("Transfer money sucessfull");
            }
            else {
                System.out.println("Error in transfer money!");
            }
        }



    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        Account acc1 = new Account("001", "Nam Anh", "Tiet kiem", 10000);
        Account acc2 = new Account("002", "Khanh", "Tin dung", 50000);
        // atm.viewAmount(acc1);
        // atm.viewAmount(acc2);
        // atm.deposit(acc1);
        // atm.withdraw(acc1);
        // atm.transferMoney(acc1, acc2);
    }


}
