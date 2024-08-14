package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int payDay;
    private String email;
    private String phone;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name, int payDay, String email, String phone) {
        this.name = name;
        this.payDay = payDay;
        this.email = email;
        this.phone = phone;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double payroll() {
        double total = 0.0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public int getPayDay() {
        return payDay;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}