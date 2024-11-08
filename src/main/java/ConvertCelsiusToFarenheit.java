//2024-09-15_CoronelCamila_Module2:Exercise 2.1
//Coded by Camila Coronel

import java.util.Scanner;
public class ConvertCelsiusToFarenheit{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a degree in Celsius: ");
    double celsius = scanner.nextDouble();
    double farenheit =(9.0/5)*celsius +32;
    System.out.println("That temperature in Farenheit will be:  "+ farenheit + "°F 🥵");
    scanner.close();
  }
}