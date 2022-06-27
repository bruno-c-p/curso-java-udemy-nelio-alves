package poo.abstract_exercise.entities;

public class LegalPerson extends Person {

    private Integer numberOfEmployees;

    public LegalPerson() {
    }

    public LegalPerson(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double taxCalculation() {

        if (this.numberOfEmployees > 10) {

            return this.getAnnualIncome() * 0.14;

        } else {

            return this.getAnnualIncome() * 0.16;
        }
    }

    public Integer getnumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setnumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
