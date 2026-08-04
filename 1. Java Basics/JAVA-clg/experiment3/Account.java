package experiment3;

public abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterestAmount();

    abstract double calculateMaturityAmount();

    abstract void calculateInterest();
}