package experiment3;

public class SBAccount extends Account {
    int noOfMonths;
    int ageOfAccHolder;

    SBAccount(double amount, int tenureInMonths, int age) {
        super.amount = amount;
        noOfMonths = tenureInMonths;
        ageOfAccHolder = age;
        calculateInterest();
    }

    double calculateInterestAmount() {
        double interestAmount = 0;
        interestAmount = amount * (Math.pow(1 + (interestRate / 100), noOfMonths / 12) - 1);
        return interestAmount;
    }

    double calculateMaturityAmount() {
        return amount + calculateInterestAmount();
    }

    void calculateInterest() {
        if (noOfMonths > 60) {
            interestRate = 4;
        } else if (noOfMonths > 36) {
            interestRate = 3.5;
        } else if (noOfMonths > 24) {
            interestRate = 3;
        } else if (noOfMonths > 12) {
            interestRate = 2.5;
        } else if (noOfMonths > 6) {
            interestRate = 2;
        } else if (noOfMonths > 3) {
            interestRate = 1.5;
        } else {
            interestRate = 1;
        }
        if (ageOfAccHolder >= 60) {
            interestRate += 0.5;
        }
    }
}
