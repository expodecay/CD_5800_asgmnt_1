package Question_1;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours_worked;

    public HourlyEmployee(String first_name, String last_name, String social_security_number, double wage, double number_of_hours_worked) {
        super(first_name, last_name, social_security_number);

        this.wage                   = wage;
        this.hours_worked = number_of_hours_worked;
    }

    public double getWage(){
        return this.wage;
    }

    public double getNumber_of_hours_worked() {
        return hours_worked;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setNumber_of_hours_worked(double number_of_hours_worked) {
        this.hours_worked = number_of_hours_worked;
    }
}
