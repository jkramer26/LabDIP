/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

public class TipCalculatorManager {
    
    //composition has-a relationship
    //way to implement abstract class
    //is an instance variable. 
    private TipCalculatorSource source;
    
    //constructor that passes in tipcalculatorSource object
    public TipCalculatorManager(TipCalculatorSource source) {
        this.source = source;
    }
    
    //method that grabs the calculated tip and then outputs it
    //have names be a bit more specific
    public double getCalculatedTip() {
        return source.getTip();
    }
    
    //getter and setter
    //not exactly sure why I should have these. 
    //should have so you can alter the source in a program like a gui
    //Ex. If you have a baggae you can change it to a food
    public TipCalculatorSource getSource() {
        return source;
    }

    public void setSource(TipCalculatorSource source) {
        this.source = source;
    }
    
    
}
