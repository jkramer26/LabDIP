
package dip.lab1.student.solution1;


public class HRService {
    //create an instance variable of the abstraction class, Employee (Has-a relationship)
    //be sure to have variables be private
    private Employee employee;
    
    //constructor
    public HRService(Employee employee) {
        this.employee = employee;
    }
    
    //method to get an employees annual wage
    //this should be getEmployeeAnnualWage instead of EmployeeWage
    //it is more specific and people will know what it is then
    public double getEmployeeAnnualWage() {
        return employee.getAnnualWages();
    }
    
    //getter and setters...ask why these are needed
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
