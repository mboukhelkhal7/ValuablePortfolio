package com.Pluralsight;

public class House extends FixedAsset {

    private int yearBuilt;
    private int squarefeet;
    private int bedroom;

    public House(String name, double marketValue, int yearBuilt, int squarefeet, int bedroom) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squarefeet = squarefeet;
        this.bedroom = bedroom;
    }

    public int getYearBuilt(){ return yearBuilt;}
    public int getSquarefeet(){return squarefeet;}
    public int getBedroom(){ return bedroom;}
}
