package poo.abstract_exercise.entities;

public class NaturalPerson extends Person {

    private Double healthExpenditures;

    public NaturalPerson() {
    }

    public NaturalPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxCalculation() {

        double basicTax;
        
		if (getAnnualIncome() < 20000.0) {

			basicTax = getAnnualIncome() * 0.15;

		} else {

			basicTax = getAnnualIncome() * 0.25;
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
