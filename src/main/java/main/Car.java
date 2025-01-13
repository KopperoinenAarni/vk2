package main;

public class Car {
    private String brand;
    private String model;
    private int speed; 

    public void setBrand(String brand) {
        this.brand = brand;    
    }

    public void setModel(String model) {
        this.model = model;    
    }

    public void setSpeed(int speed) {
        this.speed = speed;    
    }

    public String getBrand() {
        return brand;    
    }

    public String getModel() {
        return model;    
    }

    public int getSpeed() {
        return speed;    
    }

    public void printSpecs() {
        System.out.print("Auto: " + brand + " " + model + " ");
        System.out.println("Auton nopeus: " + speed + " km/h");
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }
    
    public void decelerate(int speed) {
        if (this.speed - speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed -= speed;
        }
    }
}
