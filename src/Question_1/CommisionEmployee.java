package Question_1;

public class CommisionEmployee extends Employee{
    private double comission_rate;
    private double gross_sales;

    public CommisionEmployee(String first_name, String last_name, String social_security_number, double comission_rate, double gross_sales) {
        super(first_name, last_name, social_security_number);

        this.comission_rate = comission_rate;
        this.gross_sales    = gross_sales;
    }

    public double getComission_rate() {
        return comission_rate;
    }

    public double getGross_sales(){
        return gross_sales;
    }

    public void setComission_rate(double comission_rate){
        this.comission_rate= comission_rate;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }
}
