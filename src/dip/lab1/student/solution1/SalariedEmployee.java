
package dip.lab1.student.solution1;

//low-level class that implements the employee abstraction
public class SalariedEmployee implements Employee {
    
    private double annualSalary;        //the annual salary an employee has
    private double annualBonus;         //the bonus amount an employee could have
    private double employeeAnnualWage;   //variable that stores how much salariedEMployee earns in a year
    
    //constructor that passes in how annual salary and bonus for a salaried employee & validates input
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    
    //method to calculate and return how much a salaried employee earns in a year
    @Override
    //could really just return calculation like return annualSalary + annualBonus
    public double getAnnualWages() {
        employeeAnnualWage = (annualSalary + annualBonus);
        
        return employeeAnnualWage;
    }
    
    //getters and setters for properties
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if(annualSalary < 0) {
            throw new IllegalArgumentException();
        }
        
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        if(annualBonus < 0) {
            throw new IllegalArgumentException();
        }
        
        this.annualBonus = annualBonus;
    }
    
    //only want getter for this since you want to calculate the wage
    public double getEmployeeAnnualWage() {
        return employeeAnnualWage;
    }

    
    
}
