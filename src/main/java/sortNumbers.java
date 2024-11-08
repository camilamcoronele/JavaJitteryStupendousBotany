//2024-11-07_CoronelCamila_Module 6 Exercise 6.5

import java.util.Scanner;

public class sortNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print(
        "Hello there 👋🏼 today we are going to place numbers in increasing order, are you ready to start? please answer ‘yes’ or ‘no’?");
    String answer = input.next().toLowerCase();

    if (answer.equals("yes")) {
      System.out.println("Perfect! 🎊  Let's start then!");
      System.out.println("Please enter 3 random numbers 🔢 :   ");
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double num3 = input.nextDouble();
      displaySortedNumbers(num1, num2, num3);
    } else {
      System.out.println("Thta's okay, come back when you are ready! 👍🏻 :)");
    }
    input.close();
  }

  public static void displaySortedNumbers(double num1, double num2, double num3) {
    double temp;
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num1 > num3) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    System.out.println("The increasing order of the numbers you just gave us is: " + num1 + " " + num2 + " " + num3);

  }
}
