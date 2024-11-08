//2024-10-10_CoronelCamila_Module5Exercise5.4
//Camila Coronel 

public class MilesToKilometers {
  public static void main(String[] args) {
    System.out.println("-----------------------");
    System.out.println("  Miles to Kilometers  ");
    System.out.println("-----------------------");
    System.out.println();
    System.out.printf("%-15s%15s%n", "Miles", "Kilometers");
    for (int miles = 1; miles <= 10; miles++) {
      double kilometers = miles * 1.609;
      System.out.printf("%-15d%15.3f%n", miles, kilometers);
    }
  }
}

