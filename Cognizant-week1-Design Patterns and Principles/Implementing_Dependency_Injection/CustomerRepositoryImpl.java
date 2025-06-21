package Implementing_Dependency_Injection;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        if (id == 1) {
            return "Customer{id=1, name='John Doe'}";
        } else if (id == 2) {
            return "Customer{id=2, name='Jane Smith'}";
        }
        return "Customer not found";
    }
}

