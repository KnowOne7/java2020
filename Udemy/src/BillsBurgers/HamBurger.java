package BillsBurgers;

public class HamBurger {
    private String name;
    private String roll;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public HamBurger(String name, String roll, String meat, Double price) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
    }

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizedHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.roll + " roll price is " + this.price);

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;


    }
}



//
//    public void getPrice(){
//        System.out.println(getClass().getSimpleName() + ":\t" + this.price);
//        if(addition1Name) {
//            this.price += .75;
//            System.out.println("Cheese:\t 0.75");
//        }
//        if(bacon) {
//            this.price += 1.00;
//            System.out.println("Bacon:\t 1.00");
//        }
//        if (lettuce){
//            this.price += .5;
//            System.out.println("Lettuce:\t 0.50");
//        }
//        if(tomato) {
//            this.price += .6;
//            System.out.println("Tomato:\t 0.50");
//        }
//        System.out.println("Total= \t" + this.price);
//
//
//    }






//    public String printPrice(){
//        System.out.print("It is $" + getClass().getSimpleName().getPrice() + " for your ");
//        if(hamburger.isCheese()) System.out.print("cheese ");
//        System.out.println(hamburger.getMeat() + " burger on " + hamburger.getRoll() + ".");
//    }