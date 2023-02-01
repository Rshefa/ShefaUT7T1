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

    public boolean swap (int first, int second){
        if (first < inventory.size() && second < inventory.size()){
            Car car1 = inventory.get(first);
            Car car2 = inventory.get(second);
            inventory.set(first, car2);
            inventory.set(second, car1);
            return true;
        } else {
            return false;
        }
    }

}
