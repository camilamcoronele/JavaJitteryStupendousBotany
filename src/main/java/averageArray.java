//2024-11-08_CoronelCamila_Module 7: Exercise 7.8

import java.util.Scanner;

public class averageArray {
  public static int average(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum / array.length;
  }

  public static double average(double[] array) {
    double sum = 0.0;
    for (double num : array) {
      sum += num;
    }
    return sum / array.length;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] values = new double[10];

    System.out.println(
        "Hello there 👋🏼, today we are going to work on averages, for this you will need to write 10 numbers, each number needs to have a decimal point; for example: 12.34, 23.1, etc...");
    System.out.println("Are u ready 👀 ? (Please enter 'yes' or 'no'");
    String userResponse = scanner.nextLine();
    // IgnoreCase allows tge program to accept different variations of yes, like
    // YES, YeS, YEs, etc
    if (userResponse.equalsIgnoreCase("yes")) {
      System.out.println("Perfect 👍🏻 🤩, let’s start! Please enter 10 numbers");
      for (int i = 0; i < 10; i++) {
        System.out.print("Number " + (i + 1) + ": ");
        values[i] = scanner.nextDouble();
      }
      double avg = average(values);
      System.out.println("The average of the numbers you just gave us is: " + avg);
    } else {
      System.out.println("That’s okay! Come back whenever you’re ready 😊");
    }
    scanner.close();
  }

}