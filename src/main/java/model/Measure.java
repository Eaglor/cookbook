package model;

public class Measure{
    private boolean unit;
    private double quantity;

    private Measure measure(boolean unit, double quantity){
        this.unit = unit;
        this.quantity = quantity;
    }

}
