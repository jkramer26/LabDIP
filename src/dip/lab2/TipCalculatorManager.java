/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

public class TipCalculatorManager {
    
    //composition has-a relationship
    //way to implement abstract class
    //use this abstraction so you can have any kind of source
    private TipCalculatorSource source;
    
    //constructor that passes in tipcalculatorSource object
    public TipCalculatorManager(TipCalculatorSource source) {
        this.source = source;
    }
    
    //method that grabs the calculated tip and then outputs it
    public void doTipCalculation() {
        System.out.println("The tip is: " + source.getTip());
    }
    
    //getter and setter
    //not exactly sure why I should have these. 
    public TipCalculatorSource getSource() {
        return source;
    }

    public void setSource(TipCalculatorSource source) {
        this.source = source;
    }
    
    
}
