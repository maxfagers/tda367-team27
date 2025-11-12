package org.team27.stocksim.market;


public class Stock extends Instrument {
    private double price;

    public Stock(String symbol, String name, double tickSize, int lotSize) {
        super(symbol, name, tickSize, lotSize);
    }

    @Override
    public double getCurrentPrice() {
        return price;
    }

}
