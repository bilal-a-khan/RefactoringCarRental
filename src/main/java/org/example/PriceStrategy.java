package org.example;

public abstract class PriceStrategy {

    abstract CarType getCarType();

    abstract double getCharge(int numberOfDaysRented);

    int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
