import java.util.Objects;

public class Customer {
    private final String customerId;
    private final String name;

    public Customer(String customerId, String name) {
        this.customerId = validateStringParameter(customerId, "Customer ID");
        this.name = validateStringParameter(name, "Name");
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    private String validateStringParameter(String value, String parameterName) {
        return Objects.requireNonNull(value, parameterName + " cannot be null");
    }
}
