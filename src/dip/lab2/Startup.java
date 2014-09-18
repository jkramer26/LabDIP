package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @Jessica Kramer
 */
public class Startup {
    
 
    public static void main(String[] args) {
        
        //creating an object of the foodservce... class and passing in values
        //cant use higher level class for this... not positive why
        FoodServiceTipCalculator foodService = new FoodServiceTipCalculator(ServiceQuality.FAIR, 35);
        //cerating an object of the baggageservice... class and passing in values
        BaggageServiceTipCalculator baggageService = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5);
        
        //creating an object of the tipcalculator manager class and passing in foodService object
        TipCalculatorManager manage = new TipCalculatorManager(foodService);
        manage.doTipCalculation();
        
        
        TipCalculatorManager manage2 = new TipCalculatorManager(baggageService);
        manage2.doTipCalculation();
    }

}
