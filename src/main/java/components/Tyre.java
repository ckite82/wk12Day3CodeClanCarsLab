package components;

public class Tyre {

    private String brand;
    private int tyreSize;

    public Tyre(String brand, int tyreSize) {
        this.brand = brand;
        this.tyreSize = tyreSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }
}
