package poo.abstract_exercise.entities;

public class NaturalPerson extends Person {

    private Double healthExpenditures;

    public NaturalPerson() {
    }

    public NaturalPerson(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxCalculation() {

        double basicTax;
        
		if (getAnualIncome() < 20000.0) {

			basicTax = getAnualIncome() * 0.15;

		} else {

			basicTax = getAnualIncome() * 0.25;
		}

		basicTax -= getHealthExpenditures() * 0.5;

		if (basicTax < 0.0) {
			basicTax = 0.0;
		}

		return basicTax;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
