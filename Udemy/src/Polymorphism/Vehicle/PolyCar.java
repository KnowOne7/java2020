package Polymorphism.Vehicle;

public class PolyCar {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public PolyCar() {
    }

    public PolyCar(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println( "car -> StartEngine()");

    }

    public void accelerate(){
        System.out.println("Car -> accelerate()");
    }

    public void brake(){
        System.out.println("Car -> brake()");

    }
}


