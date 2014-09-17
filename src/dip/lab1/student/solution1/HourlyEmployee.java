
package dip.lab1.student.solution1;


public class HourlyEmployee implements Employee {
    
    private double hourlyRate;          //the hourly rate an employee earns
    private double totalHrsForYear;     //total number of hours employee worked in a year
    private double employeeAnnualPay;   //variable to store the pay an hourly employee earns in a year
    
    //constructor that passes in hourly rate and hours worked for a year
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }
    
    //method to get the pay for an hourly employee
    @Override
    public double getPay() {
        employeeAnnualPay = (hourlyRate * totalHrsForYear);
        
        return employeeAnnualPay;
    }
    
    //getters and setters for properties
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {    
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    

    
    
    
}
