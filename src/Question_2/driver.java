package Question_2;

public class driver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Default Ship", "2001");
        ships[1] = new CruiseShip("CruiseShip", "2002", 100);
        ships[2] = new CargoShip("cargoShip", "2003", 200);

        for(Ship item : ships){
            System.out.println(item.print_ship_info());
        }
    }
}
