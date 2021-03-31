package JavaFile;

import java.io.*;

public class Employeetest {
    public static void main(String[] args){
        Employee empone=new Employee("luv");
        Employee emptwo=new Employee("hon");

        empone.empAge(21);
        empone.empDesignation("software");
        empone.empSalary(5000);
        empone.printEmployee();
    }
}
