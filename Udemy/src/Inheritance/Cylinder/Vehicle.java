package Inheritance.Cylinder;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    private void move(int speed) {
        System.out.println("Vehicle is Moving forward at " + speed + ".");
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = currentVelocity = 0;
        this.currentDirection = currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): MOving at " + currentVelocity + " in direction" + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
