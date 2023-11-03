package org.example;

public class Rental {
    Car car;
    private int daysRented;

    public Rental(Car car, int daysRented) {
        this.car = car;
        this.daysRented = daysRented;
    }

    public Car getCar() {
        return car;
    }

    public int getDaysRented() {
        return daysRented;
    }

}
