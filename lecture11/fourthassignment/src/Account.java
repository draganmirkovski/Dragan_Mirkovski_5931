public class Account {
    private String bank;
    private double amount;

    public Account(String bank, double amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public String getBank() {
        return bank;
    }

    public double getAmount() {
        return amount;
    }

    public void add(double plus) {
        amount += plus;
    }

    public void withdraw(double minus) {
        if (minus <= amount) {
            amount -= minus;
        } else {
            throw new CustomException("Insufficient amount!");
//            throw new RuntimeException("Custom exception");
//            System.out.println("Insufficient funds!");
        }
    }
}