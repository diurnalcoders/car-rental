import java.util.Objects;

public class Car {
    private final String carId;
    private final String brand;
    private final String model;
    private final double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = Objects.requireNonNull(carId, "Car ID cannot be null");
        this.brand = Objects.requireNonNull(brand, "Brand cannot be null");
        this.model = Objects.requireNonNull(model, "Model cannot be null");
        if (basePricePerDay < 0) {
            throw new IllegalArgumentException("Base price per day cannot be negative");
        }
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {

        return carId;
    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {

        return model;
    }

    public double calculatePrice(int rentalDays) {
        if (rentalDays < 0) {
            throw new IllegalArgumentException("Rental days cannot be negative");
        }
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable() {

        return isAvailable;
    }

    public void rent() {
        if (!isAvailable) {
            throw new IllegalStateException("Car is not available for rent");
        }
        isAvailable = false;
    }

    public void returnCar() {
        if (isAvailable) {
            throw new IllegalStateException("Car is already available");
        }
        isAvailable = true;
    }
}
