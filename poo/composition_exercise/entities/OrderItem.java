package poo.composition_exercise.entities;

import java.text.DecimalFormat;

public class OrderItem {
    private static DecimalFormat df = new DecimalFormat(".00");
    
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.toString());
        sb.append("Quantity: " + this.getQuantity() + ", ");
        sb.append("Subtotal: $" + df.format(this.subTotal()));
        
        return sb.toString();
    }

    public double subTotal() {
        return quantity * price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
