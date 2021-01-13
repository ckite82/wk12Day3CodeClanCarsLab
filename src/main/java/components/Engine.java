package components;

public class Engine {

    private int engineSize;
    private String fuelType;

    public Engine(int engineSize, String fuelType) {
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
