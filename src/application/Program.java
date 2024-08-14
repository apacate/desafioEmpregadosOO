package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departmentName = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine();  // Consumir a quebra de linha

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        sc.nextLine();  // Consumir a quebra de linha

        Department dept = new Department(departmentName, payDay, email, phone);

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionário " + i + ":");

            System.out.print("Nome: ");
            String employeeName = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            sc.nextLine();  // Consumir a quebra de linha

            Employee emp = new Employee(employeeName, salary);
            dept.addEmployee(emp);
        }

        showReport(dept);
        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.printf("Departamento %s = R$ %.2f%n", dept.getName(), dept.payroll());
        System.out.println("Pagamento realizado no dia " + dept.getPayDay());
        System.out.println("Funcionários:");

        for (Employee emp : dept.getEmployees()) {
            System.out.println(emp.getName());
        }

        System.out.println("Para dúvidas favor entrar em contato: " + dept.getEmail());
    }
}