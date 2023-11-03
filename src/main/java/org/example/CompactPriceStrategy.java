package org.example;

public class CompactPriceStrategy extends PriceStrategy {
    @Override
    CarType getCarType() {
        return CarType.COMPACT;
    }

    @Override
    double getCharge(int numberOfDaysRented) {
        double thisAmount = 150;
        if (numberOfDaysRented > 3) {
            thisAmount += (numberOfDaysRented - 3) * 150;
        }
        return thisAmount;
    }
}
