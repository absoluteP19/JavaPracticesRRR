package Practice4_1.Task6;

public class Employer {
    private String firstName;
    private String lastName;
    private Double income;

    public Employer(String firstName, String lastName, Double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public Double getIncome() {
        return income;
    }
}