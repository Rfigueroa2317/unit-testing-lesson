public class Car {

    private String make;
    private String mode;
    private String year;
    private String color;
    private double mileage;
    private boolean isElectric;

    public Car(String make, String model, String year, String color, double mileage, boolean isElectric) {
        this.make = make;
        this.mode = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }

    public Car(){}

    public static void setMileage(String s) {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return mode;
    }

    public void setModel(String mode) {
        this.mode = mode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage = 0.0;
    }

    public void setMileage() {
        this.mileage = mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
