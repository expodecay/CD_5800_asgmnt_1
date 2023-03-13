package Question_2;

public class Ship {

    private String ship_name;
    private String ship_year;

    public Ship(String name, String year){
        this.ship_name = name;
        this.ship_year = year;
    }

    public String getShip_name() {
        return ship_name;
    }

    public String getShip_year() {
        return ship_year;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public void setShip_year(String ship_year) {
        this.ship_year = ship_year;
    }

    public String print_ship_info(){
        return "..............................\nShip Name: " +  this.getShip_name() + "\nShip year : " + this.getShip_year();
    }
}
