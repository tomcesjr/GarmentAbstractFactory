package edu.farmingdale;

public class CasualPants implements Pants {
    @Override
    public void wear() {
        System.out.println("Wearing Casual Pants.");
    }

    @Override
    public Shoes createShoes() {
        return null;
    }
}
