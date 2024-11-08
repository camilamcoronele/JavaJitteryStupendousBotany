
// 2024-09-24_CoronelCamila_Module 3:Exercise3.6
import java.util.Scanner;

public class HealthApplication {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello there 👋🏼, let's calculate your body mass index BMI!!");
    System.out.println();
    // ask user for wight in pounds, feet & inches
    System.out.println("Please enter your weight in pounds: ");
    double userWeight = scanner.nextDouble();
    System.out.println();

    System.out.println("Please enter your height (feet): ");
    double userHeight = scanner.nextDouble();
    System.out.println();

    System.out.println("Please enter your height(inches): ");
    double userHeightInches = scanner.nextDouble();
    System.out.println();
    // To make it easier convert the user's height to a TOTAL height.
    // 1 foot is = to 12 inches
    double TotalHeight = (userHeight * 12) + userHeightInches;
    // Calculate BMI = 703 * weight/height al cuadrado
    double bmi = 703 * userWeight / Math.pow(TotalHeight, 2);
    System.out.println("Your body mass index is: " + bmi);
    System.out.println();
    if (bmi < 18.5) {
      System.out.println("A range of under 18.5 is considered underweight 👀");
    } else if (bmi >= 18.5 && bmi <= 24.9) {
      System.out.println("A range between 18.5 and 24.9 is described as a Healthy Range 👍🏻");
    } else if (bmi >= 25 && bmi <= 29.9) {
      System.out.println("A range between 25 and 29.9 is considered Overweight 👀");
    } else if (bmi >= 30 && bmi <= 39.9) {
      System.out.println("A range from 30 and 39.9 is considered as Obesity 👀");
    }
    scanner.close();
  }
}