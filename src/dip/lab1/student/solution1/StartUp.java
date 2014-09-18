package dip.lab1.student.solution1;

import java.text.NumberFormat;

public class StartUp {

    public static void main(String[] args) {
        //creating employee objects
        Employee hourly = new HourlyEmployee(13.00, 2080);
        Employee hourly2 = new HourlyEmployee(15.75, 2080);
        Employee salaried = new SalariedEmployee(30000, 5000);
        Employee salaried2 = new SalariedEmployee(50000, 2000);

        //create an object of the HRService class and passing in emloyee objects
        //HRService manage = new HRService();
        //HRService manage2 = new HRService(salaried);
        
        //
        HRService manage;
        
        // Create a collection that we can process as a group --
        // demands polymorphic behavior
        Employee[] employees = {hourly, hourly2, salaried, salaried2};
        
        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // Test input/output by looping over collection in a way that
        // doesn't break if we add/subtract employees from array
        for(int i=0; i < employees.length; i++) {
            //test System.out.println(employees[i]);
            //intialize the manage variable with an employee
            manage = new HRService(employees[i]);
            System.out.println("");
            System.out.println("Employee " + (i+1) + " compensation:" +
            //System.out.println("wage:" + manage.getEmployeeWage());
            nf.format(manage.getEmployeeWage()));
        }
        
        //Outputting the annual wages of an hourly & salaried employee
        //could output this in actual money format
        //System.out.println("Hourly employee's annual wage: " + manage.getEmployeeWage());
        //System.out.println("Salaried employee's annual wage: " + manage2.getEmployeeWage());
        
    }

}
