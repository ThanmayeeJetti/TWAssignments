class BharatBank {
    private int accountBalance;
    private final String accountType;

    BharatBank(int accountBalance, String accountType) {
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public double getInterest() {
        int interestSavingsAccount = 3;
        int interestCurrentAccount = 0;
        double duration = 0.25;
        int interestRate = ((this.accountType.equalsIgnoreCase("current")) ? interestCurrentAccount : interestSavingsAccount);
        return (double) this.accountBalance * interestRate * duration / 100;
    }

    public void depositMoney(int deposit) {
        this.accountBalance = this.accountBalance + deposit;
    }

    public void withdrawMoney(int withdraw) {
        this.accountBalance = this.accountBalance - withdraw;
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        BharatBank gopalAccount = new BharatBank(50000, "current");
        BharatBank amritaAccount = new BharatBank(100000, "savings");
        gopalAccount.depositMoney(10000);
        amritaAccount.withdrawMoney(45000);
       
        System.out.println("Amrita: " + amritaAccount.getInterest());
        System.out.println("Gopal: " + gopalAccount.getInterest());
    }
}