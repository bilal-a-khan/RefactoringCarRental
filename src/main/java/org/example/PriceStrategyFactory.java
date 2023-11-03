package org.example;

import static org.example.Car.*;

public class PriceStrategyFactory {
    public static PriceStrategy getPriceStrategy(CarType type) {

        return switch (type) {
            case COMPACT -> new CompactPriceStrategy();
            case STANDARD -> new StandardPriceStrategy();
            case LUXURY -> new LuxuryPriceStrategy();
        };
    }
}
