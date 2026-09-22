package experiment3;

public class FDAccount extends Account {
    int noOfMonths;
    int ageOfAccHolder;

    FDAccount(double amount, int tenureInMonths, int age) {
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
            interestRate = 7.5;
        } else if (noOfMonths > 36) {
            interestRate = 7;
        } else if (noOfMonths > 24) {
            interestRate = 6.5;
        } else if (noOfMonths > 12) {
            interestRate = 6;
        } else if (noOfMonths > 6) {
            interestRate = 5;
        } else if (noOfMonths > 3) {
            interestRate = 3.5;
        } else {
            interestRate = 3;
        }
        if (ageOfAccHolder >= 60) {
            interestRate += 0.5;
        }
    }
}
