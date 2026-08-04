package experiment3;

public class RDAccount extends Account {
    int noOfMonths;
    int ageOfAccHolder;
    private final int compoundingFreq = 4;

    RDAccount(double monthlyDeposit, int tenureInMonths, int age) {
        amount = monthlyDeposit;
        noOfMonths = tenureInMonths;
        ageOfAccHolder = age;
        calculateInterest();
    }

    double calculateInterestAmount() {
        double _amount = 0;
        for (int i = 1; i <= noOfMonths; i++) {
            if (i % compoundingFreq != 0) {
                _amount += amount;
                continue;
            }
            _amount *= (1 + interestRate / 100);
            _amount += amount;
        }
        return _amount - amount * noOfMonths;
    }

    double calculateMaturityAmount() {
        return (amount * noOfMonths) + calculateInterestAmount();
    }

    void calculateInterest() {
        int noOfMonths = compoundingFreq;
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
