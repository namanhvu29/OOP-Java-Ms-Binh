public class SavingAccount extends Account {

    // Declare
    protected double interest;
    protected int term;

    // Contructor
    public SavingAccount() {

    }

    public SavingAccount(String accountNo, String ownerName, String accountType, double amount, double interest, int term) {
        super(accountNo, ownerName, accountType, amount);
        this.interest = interest;
        this.term = term;
    }

    // Setter and Getter
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    // Calculate Interesting
    public void CalculateInterest() {
        amount = amount + amount * interest * term;
        System.out.println("amount after interest and term is: " + amount);
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


}