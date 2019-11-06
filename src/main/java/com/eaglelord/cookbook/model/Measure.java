package com.eaglelord.cookbook.model;

public class Measure{
    private boolean unit;
    private double quantity;

    public Measure(boolean unit, double quantity) {
        this.unit = unit;
        this.quantity = quantity;
    }

    public boolean isUnit() {
        return unit;
    }

    public void setUnit(boolean unit) {
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
