package BillsBurgers;

public class VeggieBurg extends HamBurger {  // additionNames / pricing 1-4 are in Parent class Hamburger and don't need to be created here.
    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;


    public VeggieBurg(String meat, Double price) {              // Inheritance constructor that allows some input on instantiation/ occurrence
        super( "healthy", "Wheat", meat, price);        //  Items in () can be instantiated. Items in super override and default for Class.
    }



    @Override
    public void addAddition1(String name, double price) {
        super.addAddition1(name, price);
    }

    @Override
    public void addAddition2(String name, double price) {
        super.addAddition2(name, price);
    }

    @Override
    public void addAddition3(String name, double price) {
        super.addAddition3(name, price);
    }

    @Override
    public void addAddition4(String name, double price) {
        super.addAddition4(name, price);
    }



    public void addAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addAddition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if (this.addition5Name != null) {
            hamburgerPrice += this.addition5Price;
            System.out.println("Added " + this.addition5Name + " for an extra " + this.addition5Price);
        }
        if (this.addition6Name != null) {
            hamburgerPrice += this.addition6Price;
            System.out.println("Added " + this.addition6Name + " for an extra " + this.addition6Price);
        }
        return hamburgerPrice;
    }
}
