package org.team27.stocksim.market;

public abstract class Instrument {
    protected final String symbol;
    protected final String name;
    protected final double tickSize;
    protected final int lotSize;


    public Instrument(String symbol, String name, double tickSize, int lotSize) {
        this.symbol = symbol;
        this.name = name;
        this.tickSize = 0.01;
        this.lotSize = 100;
    }
    public String getSymbol() {return symbol;}
    public String getName() {return name;}
    public double getTickSize() {return tickSize;}
    public int getLotSize() {return lotSize;}

    public abstract double getCurrentPrice();

}
