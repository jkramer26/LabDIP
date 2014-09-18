
package dip.lab1.student.solution1;

//low-level class that implements the employee abstraction
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;          //the hourly rate an employee earns
    private double totalHrsForYear;     //total number of hours employee worked in a year
    private double employeeAnnualWage;   //variable to store the pay an hourly employee earns in a year
    
    //constructor that passes in hourly rate and hours worked for a year & validates input
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    //method to get the pay for an hourly employee
    @Override
    public double getWage() {
        employeeAnnualWage = (hourlyRate * totalHrsForYear);
        
        return employeeAnnualWage;
    }
    
    //getters and setters for properties
    public double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }
    
    //only want getter for this since you want to calculate the wage
    public double getEmployeeAnnualWage() {
        return employeeAnnualWage;
    }

    

    
    
    
}
