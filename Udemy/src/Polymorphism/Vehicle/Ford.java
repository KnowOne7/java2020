package Polymorphism.Vehicle;

public class Ford extends PolyCar {
    public Ford() {
    }

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }




    @Override
    public void startEngine() {
        System.out.println("Ford -> StartEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford-> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Ford -> brake()");
    }

}
