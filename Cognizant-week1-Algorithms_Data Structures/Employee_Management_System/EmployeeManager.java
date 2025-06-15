package Employee_Management_System;

public class EmployeeManager {
    Employee[] employees;
    int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
        } else {
            System.out.println("Employee array is full.");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void showAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1]; 
                }
                employees[--size] = null; 
                return;
            }
        }
        System.out.println("Employee ID not found.");
    }
}
