public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * hi.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        String ans = "Motor Bike:\n";
        ans += "\tBrand: " + brand + "\n";
        ans += "\tModel: " + model + "\n";
        ans += "\tRegistration Number: " + registrationNumber + "\n";
        ans += "\tHas Side Car: " + hasSidecar + "\n";
        ans += "\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n";
        return ans;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
} 