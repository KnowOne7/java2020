package Polymorphism.Vehicle;

public class Mitsubishi extends PolyCar {


    public Mitsubishi(int cylinders, String name) {

        super(cylinders, name);
    }




    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+ "  -> StartEngine()");
    }

    @Override
    public void accelerate() {

        System.out.println(getClass().getSimpleName()+ "  -> accelerate()");
    }

    @Override
    public void brake() {

        System.out.println(getClass().getSimpleName()+ "  -> brake()");
    }

}
