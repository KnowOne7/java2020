package Polymorphism.Vehicle;

public class CRV extends PolyCar {

    public CRV(int cylinders, String name) {
        super(cylinders, name);
    }




    @Override
    public void startEngine() {
        System.out.println("CRV -> StartEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("CRV-> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("CRV -> brake()");
    }

}
