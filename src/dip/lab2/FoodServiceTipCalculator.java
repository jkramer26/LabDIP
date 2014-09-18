package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @Jessica Kramer
 */
public class FoodServiceTipCalculator implements TipCalculatorSource {
    //might want to change this from final because you might want to alter this sometimes to be a different value
    //violates non-rigid or portable best practice
    private double MIN_BILL = 0.00;
    //this should also not be final because you may want the message to change  
    private String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    //these rates should also not be final because the rates for each may want to be altered
    private double GOOD_RATE = 0.20;
    private double FAIR_RATE = 0.15;
    private double POOR_RATE = 0.10;
    private double bill;
    
    //this is a composition 
    private ServiceQuality serviceQuality;
    
    //constructor that validates input by calling methods 
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    
    //have name redone so it matches other method name
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }
    
    //this shouldn't be final. Bill amount will vary
    public void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    //for testing the class
    public static void main(String[] args) {
        FoodServiceTipCalculator test = new FoodServiceTipCalculator(ServiceQuality.FAIR, 35);
        
        System.out.println("Tip for this class: " + test.getTip());
        
        
    }
}
