package BillsBurgers;

public class Deluxe extends HamBurger {


    public Deluxe(String name, String roll, String meat, Double price) {  // Would use this constructor if wanted to build to occurrence with choices.
        super(name, roll, meat, price);                                     // See veggie Burger
    }

    public Deluxe() {
        super("Deluxe", "Sesame", "Double Quarter Pounder", 5.99);// Use if there are no options in Build
        super.addAddition1("Chips", 3.);
        super.addAddition2("Soda", 1.99);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot Add to deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("");
    }
}
