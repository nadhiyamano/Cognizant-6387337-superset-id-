package Implementing_Dependency_Injection;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
     
        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.printCustomerDetails(1);
        service.printCustomerDetails(2);
        service.printCustomerDetails(3);
    }
}

