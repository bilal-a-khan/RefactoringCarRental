package org.example;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CustomerTests {

    Customer uut;

    @BeforeEach
    public void setUp() {
        uut = new Customer("Test");
    }

    @AfterEach
    public void tearDown() {
        uut = null;
    }


    @ParameterizedTest
    @CsvSource({"0.0,0"})
    public void emptyStatementTest(double expectedTotalAmount, int expectedFrequentRenterPoints) {

        String actualResult = uut.statement();

        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"STANDARD,1,200,1"})
    public void standardCar1DayTest(CarType type, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", type), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"STANDARD,3,600,1"})
    public void standardCar3DayTest(CarType type, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", type), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"LUXURY,1,500,1"})
    public void luxuryCar1DayTest(CarType type, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", type), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"LUXURY,2,500,2"})
    public void luxuryCar3DayTest(CarType carType, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", carType), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"COMPACT,1,150,1"})
    public void compactCar1DayTest(CarType type, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", type), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n" +
                "\t" + "car1" + "\t" + expectedTotalAmount + "\n" +
                "Amount owed is " + expectedTotalAmount + "\n" +
                "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"COMPACT,4,300,1"})
    public void compactCar4DayTest(CarType type, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", type), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"STANDARD,1,200," +
            "LUXURY,1,500," +
            "700.0 ,2"})
    public void multipleCarTest(CarType type1, int daysRented1, double expectedAmount1,
                                CarType type2, int daysRented2, double expectedAmount2,
                                double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", type1), daysRented1));
        uut.addRental(new Rental(new Car("car2", type2), daysRented2));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedAmount1 + "\n";
        expectedResult += "\t" + "car2" + "\t" + expectedAmount2 + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
