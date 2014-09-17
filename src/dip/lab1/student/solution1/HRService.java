
package dip.lab1.student.solution1;


public class HRService {
    //create an instance variable of the abstraction class, Employee (Has-a relationship)
    Employee employee;
    
    //constructor
    public HRService(Employee employee) {
        this.employee = employee;
    }
    
    //method to get an employees annual wage
    public double getWage() {
        return employee.getWage();
    }
    
    //getter and setters...ask why these are needed
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
