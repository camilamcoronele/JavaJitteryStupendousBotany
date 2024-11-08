
//2024-09-29_CoronelCamila_Module4Exercise4.4
import java.util.Scanner;

public class hexagonArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello there👋🏼! Let's alculate the area of an hexagon ⬡!");
    System.out.println();

    System.out.println("Please enter the side so that we can calculate the area for you: ");
    double side = scanner.nextDouble();

    // area formula (6 s^2) / (4 * tan(π/6))

    double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
    System.out.printf("The area of the hexagon will be: %.2f\n", area);
    scanner.close();

  }
}


