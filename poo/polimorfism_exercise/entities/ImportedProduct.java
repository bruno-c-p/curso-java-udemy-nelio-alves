package poo.polimorfism_exercise.entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String toString() {
        return super.toString() + this.priceTag();
    }

    @Override
    public String priceTag() {
        return " $ " + this.getDf().format(this.getPrice())
                + " (Customs fee: $ " + this.getDf().format(this.getCustomsFee()) + ")";
    }

    public double totalPrice() {
        return this.getPrice() + this.getCustomsFee();
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
