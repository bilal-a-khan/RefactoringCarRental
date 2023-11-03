package org.example;

public class StandardPriceStrategy extends PriceStrategy {
    @Override
    CarType getCarType() {
        return CarType.STANDARD;
    }

    @Override
    double getCharge(int numberOfDaysRented) {
        double thisAmount = numberOfDaysRented * 200;
        if (numberOfDaysRented > 3) {
            thisAmount += (numberOfDaysRented - 3) * 150;
        }
        return thisAmount;
    }
}
