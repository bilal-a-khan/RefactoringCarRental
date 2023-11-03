package org.example;

import static org.example.CarType.LUXURY;

public class Car {
    CarType type;

    private String makeModel;


    public Car(String makeModel, CarType carType) {
        this.makeModel = makeModel;
        this.type = carType;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public CarType getCarType() {
        return type;
    }

    int getFrequentRenterPoints(Rental rental) {
        if ((rental.getCar().getCarType() == LUXURY) && rental.getDaysRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }

    double getPrice(Rental rental) {
        PriceStrategy priceStrategy = PriceStrategyFactory.getPriceStrategy(rental.getCar().getCarType());
        return priceStrategy.getCharge(rental.getDaysRented());

    }
}
