package Question_2;

public class CruiseShip extends Ship{
    private int max_passengers;

    public CruiseShip(String name, String year, int max_passengers) {
        super(name, year);
        this.max_passengers = max_passengers;
    }

    public int getMax_passengers() {
        return max_passengers;
    }

    public void setMax_passengers(int max_passengers){
        this.max_passengers = max_passengers;
    }

    @Override
    public String print_ship_info(){
        return "..............................\nShip Name : " +  this.getShip_name() + "\nMaximum number of passengers : " + this.getMax_passengers();
    }
}
