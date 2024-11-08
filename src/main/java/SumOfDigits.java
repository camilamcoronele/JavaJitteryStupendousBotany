//2024-10-23_CoronelCamila_Module6Exercise6.2 
import java.util.Scanner;

public class SumOfDigits {
  public static int SumDigits(long n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10; // we use % operator to extract digits
      n /= 10; // the / oprator will remove the extracted digiy
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("Hello there 👋🏼 Let’s do some math...");
    System.out.println("Please enter a number and I will sum it’s digits!! 🔢 👀");
    Scanner scanner = new Scanner(System.in);
    long number = scanner.nextLong();

    System.out.println("The sum of the digits in " + number + " is" + SumDigits(number) + "‼️");
    scanner.close();
  }
}
