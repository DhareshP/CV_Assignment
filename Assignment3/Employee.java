package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public Integer id;
    public String name;
    public double salary;

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void diaplaayDetails(){
       System.out.println("Employee ID: " + id + " Employee Name: " + name + " Employee Salary: " + salary);
    }

    public static void main(String[] args) {

    Employee e1 = new Employee(01 , "Ajay" , 25000.00);
    Employee e2 = new Employee(02 , "Vijay" , 30000.00);
    Employee e3 = new Employee(03 , "Sanjay" , 35000.00);
    
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(e1);
    employeeList.add(e2);
    employeeList.add(e3);  

    for(int i = 0; i< employeeList.size(); i++){
        employeeList.get(i).diaplaayDetails();    
    }
}
}
