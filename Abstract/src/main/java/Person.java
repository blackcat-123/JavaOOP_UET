import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private String address;
    private List<Vehicle> vehicleList;


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrantionNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            String data = vehicleList.get(i).getRegistrationNumber();
            if (Objects.equals(data, registrantionNumber)) {
                vehicleList.remove(i);
                return;
            }
        }
    }

    /**
     * hi.
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() < 1) {
            return name + " has no vehicle!";
        } else {
            String ans = name + " has:\n\n";
            for (Vehicle vehicle : vehicleList) {
                ans += vehicle.getInfo();
            }
            return ans;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {

    }
} 