public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Dummy implementation for demonstration purposes
        return new Customer(id, "John Doe");
    }
}
