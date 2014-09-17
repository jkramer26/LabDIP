
package dip.lab1.student.solution1;


public class SalariedEmployee implements Employee {
    
    private double annualSalary;        //the annual salary an employee has
    private double annualBonus;         //the bonus amount an employee could have
    private double employeeAnnualPay;   //variable that stores how much salariedEMployee earns in a year
    
    //constructor that passes in how annual salary and bonus for a salaried employee
    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    //method to calculate and return how much a salaried employee earns in a year
    @Override
    public double getPay() {
        employeeAnnualPay = (annualSalary + annualBonus);
        
        return employeeAnnualPay;
    }
    
    //getters and setters for properties
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getEmployeeAnnualPay() {
        return employeeAnnualPay;
    }

    
    
}
