import Array.Array1;

import java.util.Scanner;

public class main {


   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   }
}
















//   public int[] readIntegers(int count) {
//      int[] array = new int[count];
//      System.out.println(" Enter " + count + " numbers.\r");
//      for (int i = 0; i < count; i++) {
//         array[i] = scanner.nextInt();
//      }
//      return array;
//   }

   


         // Array1.runArray();

//      int[] myIntArray = new int[25];
////      myIntArray[5] = 50;
////      double[] myDoubleArray = new double[10];
////      System.out.println(myIntArray[5]);
//
//      for(int i =0; i < myIntArray.length; i ++){
//         myIntArray[i] = (1+i) * 10;
//         System.out.println(myIntArray[i]);
//      }
//



//}















       // BillsBurgers
//       HamBurger hamburger = new HamBurger("Deluxe", "Sesame", "Beef", 1.99);
//
//     //double price = hamburger.itemizedHamburger();
//
//        hamburger.addAddition1("tomato", .5);
//        hamburger.addAddition2("cheese", .75);
//        hamburger.addAddition3("bacon", 1.0);
//        hamburger.addAddition4("lettuce", .6);
//
//        System.out.println("Total Burger price is " + hamburger.itemizedHamburger());
//
//        VeggieBurg veggieBurg = new VeggieBurg("Veggie", 2.99);
//
//        veggieBurg.addAddition1("tomato", .5);
//        veggieBurg.addAddition2("cheese", .75);
//        veggieBurg.addAddition3("bacon", 1.0);
//        veggieBurg.addAddition4("lettuce", .6);
//
//        veggieBurg.addAddition5("pickle", .5);
//        veggieBurg.addAddition6("onion", .75);
//
//
//        System.out.println("Total Burger price is " + veggieBurg.itemizedHamburger());
//
//
//        Deluxe deluxe = new Deluxe();
//
//        System.out.println("Total Burger price is " + deluxe.itemizedHamburger());
//
//
//        hamburger.setBacon(true);
//        hamburger.setCheese(true);
//        hamburger.setLettuce(true);
//        hamburger.setTomato(true);
//
//        hamburger.getPrice();
//
//        VeggieBurg veggieburger = new VeggieBurg("Wheat", "Veggie", 2.99);



//        System.out.print("It is $" + hamburger.getPrice() + " for your ");
//                        if(hamburger.isCheese()) System.out.print("cheese ");
//                        System.out.println(hamburger.getMeat() + " burger on " + hamburger.getRoll() + ".");
        //System.out.println("It is $" + hamburger.getPrice() );
        //System.out.println("It is $" + String.format("%.2f", hamburger.getPrice() ));














// Outlander - inheritance
//        Outlander outlander = new Outlander(36);
//        outlander.steer(45);
//        outlander.accelerate(30);
//        outlander.accelerate(20);
//        outlander.accelerate(-45);
//

//// Polymorphism.Vehicle.PolyCar;
//        PolyCar car = new PolyCar(8, "chevy");
//        car.startEngine();
//        car.accelerate();
//        car.brake();
//
//        CRV crv = new CRV(4, "Homda");
//        crv.startEngine();
//        crv.accelerate();
//        crv.brake();
//        //System.out.println(engine, wheels);
//
//        Mitsubishi mitsubishi = new Mitsubishi(8, "Eclipse");
//        mitsubishi.startEngine();
//        mitsubishi.accelerate();
//        mitsubishi.brake();
//
//
//        Ford ford = new Ford(6, "Bronco");
//        ford.startEngine();
//        ford.accelerate();
//        ford.brake();


//  Printer
//        Printer printer = new Printer(50, false);
//
//            System.out.println("initial page count = " + printer.getPagesPrinted());
//            int pagesPrinted = printer.printPages(4);
//            System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer\n");
//
//            pagesPrinted= printer.printPages(1);
//            System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer\n");
//
//            pagesPrinted= printer.printPages(2);
//            System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer\n");
//


        //fillToner();

























// Encapsulation
//        EnhancedPlayer player = new EnhancedPlayer("Mike", 50, "sword");
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 50;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        Player player25 = new Player();
//        player25.name = "Mike";
//        player25.health = 40;
//        player25.weapon = "sword";
//
//        int damage2 = 10;
//        player25.loseHealth(damage2);
//        System.out.println("Remaining health = " + player25.healthRemaining());
//
//        damage2 = 11;
//        player25.loseHealth(damage2);
//        System.out.println("Remaining health = " + player25.healthRemaining());
//
//        damage2 = 50;
//        player25.loseHealth(damage2);
//        System.out.println("Remaining health = " + player25.healthRemaining());
//

// Composition
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//
//        bedRoom.makeBed();
//
//
//        System.out.println(wall2.getDirection());
//
//        bedRoom.getLamp().turnOn();



// inheritance
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius " + circle.getRadius());
//        System.out.println("circle.area " + circle.getArea());
//
//
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius " + cylinder.getRadius());
//        System.out.println("cylinder.Height " +cylinder.getHeight());
//        System.out.println("cylinder.Area " +cylinder.getArea());
//        System.out.println("cylinder.Volume " +cylinder.getVolume());

        // NumberToWords.numberToWords(1222);







