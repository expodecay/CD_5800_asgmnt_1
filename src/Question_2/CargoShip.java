package Question_2;

public class CargoShip extends Ship{
    private int cargo_capacity;

    public CargoShip(String name, String year, int cargo_capacity) {
        super(name, year);
        this.cargo_capacity = cargo_capacity;
    }

    public int getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String print_ship_info(){
        return "..............................\nShip Name: " +  this.getShip_name() + "\nCargo Capacity : " + this.getCargo_capacity() ;
    }
}
