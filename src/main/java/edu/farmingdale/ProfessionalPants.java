package edu.farmingdale;

public class ProfessionalPants implements Pants {
    @Override
    public void wear() {
        System.out.println("Wearing Professional Pants.");
    }

    @Override
    public Shoes createShoes() {
        return null;
    }
}
