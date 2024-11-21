import java.util.Scanner;
public abstract class Account {

    // Declare attributes
    String accountNo, ownerName, accountType;
    double amount;
    Scanner sc = new Scanner(System.in);

    // Contructor
    public Account() {
        // System.out.println("Contructor without parameter");
        accountNo = "";
        ownerName = "";
        accountType = "";
        amount = 0;
    }

    public Account(String accountNo, String ownerName, String accountType, double amount) {
        // System.out.println("Contructor with full of parameter");
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.accountType = accountType;
        this.amount = amount;
    }

    // Setter
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter
    public String getAccountNo() {
        return accountNo;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getAmount() {
        return amount;
    }

    // Deposit
    public void deposit(double money) {

    }
    // public void deposit(double money) {
    //     // System.out.println("Your money you want to put in: ");
    //     // money = sc.nextInt();
    //     if ( money > 0) {
    //         amount = amount + money;
    //         System.out.println("Total money: " + this.amount);
    //     }
    //     else {
    //         System.out.println("Money must be positive");
    //     }
    // }

    // Withdraw
    public void withdraw(double money) {
        
    }
    // public void withdraw(double money) {
    //     if ( money > 0) {
    //         amount = amount - money;
    //         System.out.println("Total money: " + this.amount);
    //     }
    //     else {
    //         System.out.println("Money left");
    //     }
    // }

    //View Amount
    public void viewAmount() {
        System.out.println("-- -- -- --");
        System.out.println("Account No: " + accountNo);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + amount);
        System.out.println("-- -- -- --");
    } 

}