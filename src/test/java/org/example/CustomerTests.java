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
    @CsvSource({"2,1,200,1"})
    public void standardCar1DayTest(int priceCode, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", priceCode), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"2,3,600,1"})
    public void standardCar3DayTest(int priceCode, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", priceCode), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"3,1,500,1"})
    public void luxuryCar1DayTest(int priceCode, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", priceCode), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"3,2,500,2"})
    public void luxuryCar3DayTest(int priceCode, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", priceCode), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"1,1,150,1"})
    public void compactCar1DayTest(int priceCode, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", priceCode), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"1,4,300,1"})
    public void compactCar4DayTest(int priceCode, int daysRented, double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", priceCode), daysRented));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedTotalAmount + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"1,4,300," +
            "3,2,500," +
            "800.0 ,3"})
    public void multipleCarTest(int priceCode1, int daysRented1, double expectedAmount1,
                                int priceCode2, int daysRented2, double expectedAmount2,
                                double expectedTotalAmount, int expectedFrequentRenterPoints) {

        uut.addRental(new Rental(new Car("car1", priceCode1), daysRented1));
        uut.addRental(new Rental(new Car("car2", priceCode2), daysRented2));
        String actualResult = uut.statement();


        String expectedResult = "Rental Record for " + uut.getName() + "\n";
        expectedResult += "\t" + "car1" + "\t" + expectedAmount1 + "\n";
        expectedResult += "\t" + "car2" + "\t" + expectedAmount2 + "\n";
        expectedResult += "Amount owed is " + expectedTotalAmount + "\n";
        expectedResult += "You earned " + expectedFrequentRenterPoints + " frequent renter points";

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
