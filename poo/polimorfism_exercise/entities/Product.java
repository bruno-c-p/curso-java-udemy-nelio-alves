package poo.polimorfism_exercise.entities;

import java.text.DecimalFormat;

public class Product {

    private DecimalFormat df = new DecimalFormat(".00");
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + this.priceTag();
    }

    public String priceTag() {
        return " $ " + df.format(this.getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public DecimalFormat getDf() {
        return df;
    }
}
