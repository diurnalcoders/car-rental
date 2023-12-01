import java.util.Objects;

public class Rental {
    private final Car car;
    private final Customer customer;
    private final int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = Objects.requireNonNull(car, "Car cannot be null");
        this.customer = Objects.requireNonNull(customer, "Customer cannot be null");
        validateNonNegativeDays(days);
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {

        return days;
    }

    private void validateNonNegativeDays(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("Rental days cannot be negative");
        }
    }
}
