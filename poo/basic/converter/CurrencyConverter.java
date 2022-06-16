package poo.basic.converter;

public class CurrencyConverter {

    private static final double iof = 1.06;

    public static double dollarConverter(double dollarPrice, double amount) {
        return dollarPrice * amount * iof;
    }
}
