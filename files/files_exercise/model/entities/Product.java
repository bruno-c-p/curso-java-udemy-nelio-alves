package files.files_exercise.model.entities;

import java.text.DecimalFormat;

public class Product {

    private static DecimalFormat df = new DecimalFormat(".00");
    private String name;
    private Double price;
    private Double quantity;

    public Product() {
    }

    public Product(String name, Double price, Double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.name + ", " + df.format(this.total());
    }

    public double total() {
        return price * quantity;
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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
