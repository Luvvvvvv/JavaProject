package JavaFile;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDsign) {
        designation = empDsign;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(designation);
        System.out.println(salary);
    }
}
