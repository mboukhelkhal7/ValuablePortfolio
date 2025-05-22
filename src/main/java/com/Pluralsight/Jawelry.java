package com.Pluralsight;

public class Jawelry extends FixedAsset{
    private double karat;

    public Jawelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat(){
        return karat;
    }
}
