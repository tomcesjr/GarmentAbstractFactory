package edu.farmingdale;

public class Main {
    public static void main(String[] args) {

        // Professional Outfit
        GarmentFactory professionalFactory = new ProfessionalFactory();
        Top proTop = professionalFactory.createTop();
        Pants proPants = professionalFactory.createPants();
        Shoes proShoes = professionalFactory.createShoes();

        System.out.println("Professional Outfit:");
        proTop.wear();
        proPants.wear();
        proShoes.wear();

        System.out.println();

        // Casual Outfit
        GarmentFactory casualFactory = new CasualFactory();
        Top casualTop = casualFactory.createTop();
        Pants casualPants = casualFactory.createPants();
        Shoes casualShoes = casualFactory.createShoes();

        System.out.println("Casual Outfit:");
        casualTop.wear();
        casualPants.wear();
        casualShoes.wear();

        System.out.println();

        // Party Outfit
        GarmentFactory partyFactory = new PartyFactory();
        Top partyTop = partyFactory.createTop();
        Pants partyPants = partyFactory.createPants();
        Shoes partyShoes = partyFactory.createShoes();

        System.out.println("Party Outfit:");
        partyTop.wear();
        partyPants.wear();
        partyShoes.wear();
    }
}

