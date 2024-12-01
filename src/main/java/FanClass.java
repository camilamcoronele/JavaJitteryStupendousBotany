//2024-11-30_CoronelCamila_Module 9: Exercise 9.8

// Fan.java
public class FanClass {
    // fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3; // max speed

    // Private data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public FanClass() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    // Accessor methods
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Mutator
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method that describe the fan
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
}
