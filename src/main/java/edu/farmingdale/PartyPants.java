package edu.farmingdale;

public class PartyPants implements Pants {
    @Override
    public void wear() {
        System.out.println("Wearing Party Pants.");
    }

    @Override
    public Shoes createShoes() {
        return null;
    }
}
