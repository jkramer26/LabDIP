
package dip.lab1.student.solution1;

//abstraction class that low and high level classes depend on
public interface Employee {
    //abstract method to get pay for employees
    //this name should be getAnnualWages rather than getWages
    //if you were just doing getWages then should pass in an enum value
    //this way you can have a getAnnualWages, getMonthlyWages, getBiWeeklyWages... methods
    public abstract double getAnnualWages();
}
