//2024-09-15_CoronelCamila_Module2: Exercise 2.6
//Coded by Camila Coronel

import java.util.Scanner;
public class CalculateTips{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the subtotal: ");
    double subtotal = scanner.nextDouble();
    System.out.println("Please enter an optional gratuity rate/Tip:  %");
     double gratuityRate = scanner.nextDouble();
    System.out.println("Thank you for that! 😃");
  double gratuity = subtotal*(gratuityRate/100);
    double total=subtotal+gratuity;

    System.out.printf("The gratuity/tip is: %.2f and the total will be: %.2f\n", gratuity, total);
    System.out.println("Thank you! And we hope to see you again soon!! 😃");
    scanner.close();
  }
}