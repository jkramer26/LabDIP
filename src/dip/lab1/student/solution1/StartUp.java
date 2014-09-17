package dip.lab1.student.solution1;

public class StartUp {

    public static void main(String[] args) {
        //creating employee objects
        Employee hourly = new HourlyEmployee(13.00, 2080);
        Employee salaried = new SalariedEmployee(30000, 5000);

        //create an object of the HRService class and passing in emloyee objects
        HRService manage = new HRService(hourly);
        HRService manage2 = new HRService(salaried);

        //Outputting the annual wages of an hourly & salaried employee
        System.out.println("Hourly employee's annual wage: " + manage.getWage());
        
        System.out.println("Salaried employee's annual wage: " + manage2.getWage());
        
    }

}
