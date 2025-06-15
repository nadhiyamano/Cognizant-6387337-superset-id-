package Employee_Management_System;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Alice", "Developer", 60000));
        manager.addEmployee(new Employee(2, "Bob", "Manager", 80000));
        manager.addEmployee(new Employee(3, "Charlie", "Tester", 50000));

        System.out.println("All Employees:");
        manager.showAllEmployees();

        System.out.println("\nSearching for Employee ID 2:");
        System.out.println(manager.searchEmployee(2));

        System.out.println("\nDeleting Employee ID 1...");
        manager.deleteEmployee(1);

        System.out.println("\nAll Employees After Deletion:");
        manager.showAllEmployees();
    }
}

