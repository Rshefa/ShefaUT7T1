import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar (Car carToAdd){
        inventory.add(carToAdd);
    }
}
