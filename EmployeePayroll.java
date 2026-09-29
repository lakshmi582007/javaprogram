interface SalaryOperations {
    void calculateGrossSalary();
    void calculateNetSalary();
    void displayDetails();
}
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person implements SalaryOperations {

    int empId;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;
    double netSalary;
    Employee(int empId, String name, int age, double basicSalary) {
        super(name, age);
        this.empId = empId;
        this.basicSalary = basicSalary;
    }
    public void calculateGrossSalary() {
        hra = basicSalary * 0.20;   // 20% HRA
        da = basicSalary * 0.10;    // 10% DA
        grossSalary = basicSalary + hra + da;
    }
    public void calculateNetSalary() {
        double tax = grossSalary * 0.10; // 10% Tax
        netSalary = grossSalary - tax;
    }

    public void displayDetails() {
        System.out.println("\n----- Employee Payroll Details -----");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary  : " + netSalary);
    }
}
public class EmployeePayroll {
    public static void main(String[] args) {

        Employee emp = new Employee(104, "Lakshmi", 18, 50000);

        emp.calculateGrossSalary();
        emp.calculateNetSalary();
        emp.displayDetails();
    }
}