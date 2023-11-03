package org.example;

public class LuxuryPriceStrategy extends PriceStrategy {
    @Override
    CarType getCarType() {
        return CarType.LUXURY;
    }

    @Override
    double getCharge(int numberOfDaysRented) {
        return 500;
    }

    @Override
    int getFrequentRenterPoints(int numberOfDaysRented) {
        if ((getCarType() == CarType.LUXURY) && numberOfDaysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
