public class Transaction extends Account {

    // Deposit
    public void deposit(double money) {
        // System.out.println("Your money you want to put in: ");
        // money = sc.nextInt();
        if ( money > 0) {
            amount = amount + money;
            System.out.println("Total money: " + this.amount);
        }
        else {
            System.out.println("Money must be positive");
        }
    }

    // Withdraw
    public void withdraw(double money) {
        if ( money > 0) {
            amount = amount - money;
            System.out.println("Total money: " + this.amount);
        }
        else {
            System.out.println("Money left");
        }
    }
    
}