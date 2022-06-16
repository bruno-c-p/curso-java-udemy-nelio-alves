package poo.basic.converter;

import java.text.DecimalFormat;

import utils.Messages;

public class CurrencyConverterMain {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");

        double dollar = Messages.readDouble("Dollar price? ");

        double quantity = Messages.readDouble("How many dollars will be bought? ");

        double valorConvertido = CurrencyConverter.dollarConverter(dollar, quantity);

        Messages.showMSG("Amount to be paid in reais = " + df.format(valorConvertido));

    }
}
