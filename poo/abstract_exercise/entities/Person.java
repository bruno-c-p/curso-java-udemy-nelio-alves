package poo.abstract_exercise.entities;

import java.text.DecimalFormat;

public abstract class Person {
    
    private static DecimalFormat df = new DecimalFormat("0,000.00");
    private String name;
    private Double anualIncome;
    
    public Person() {
    }

    public Person(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    @Override
    public String toString() {
        return this.name + " $ " + df.format(taxCalculation());
    }

    public abstract Double taxCalculation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
