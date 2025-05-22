package com.Pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }
    public double getValue(){
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }
    public Valuable getMostValuable(){
        if (assets.isEmpty()) return null;
        Valuable most = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > most.getValue()) {
                most = asset;
            }
        }
        return most;
    }
    public Valuable getLeastValuable() {
        if (assets.isEmpty()) return null;

        Valuable least = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < least.getValue()) {
                least = asset;
            }
        }
        return least;
    }
}
