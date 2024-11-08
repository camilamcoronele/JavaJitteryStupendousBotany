//2024-10-11_CoronelCamila_Module5Exercise5.7

public class FutureTuition {
  public static void main(String[] args) {
    System.out.println("----------------------------------------");
    System.out.printf("%-10s %20s %n", "Cost", "Tuition Cost");
    System.out.println("----------------------------------------");
    double tuition = 10000;
    double tuitionIncrease = 0.05;
    int years = 10;

    for (int i = 1; i <= years; i++) {
      System.out.printf("%-10d %20.2f %n", i, tuition);
      tuition += tuition * tuitionIncrease;
    }
    double totalFourYears = tuition * 4;
    System.out.println("----------------------------------------");
    System.out.printf("The total cost of tuition for 4 years after 10 years will be: %.2f", totalFourYears);
  }
}