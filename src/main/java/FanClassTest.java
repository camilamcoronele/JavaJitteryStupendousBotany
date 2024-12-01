//2024-10-30_CoronelCamila_Module 9: Exercise 9.8
public class FanClassTest {
    public static void main(String[] args) {
        // Create first Fan object
        FanClass fan1 = new FanClass();
        fan1.setSpeed(FanClass.FAST); // Set speed to FAST
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true); // Turn the fan on

        // Create second Fan object
        FanClass fan2 = new FanClass();
        fan2.setSpeed(FanClass.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false); // Turn the fan off

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
    }
}
