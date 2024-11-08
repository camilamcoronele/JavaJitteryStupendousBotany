// camila Coronel
//2024-09-23_CoronelCamila_Module3Exercise3.11

import java.util.Scanner;

public class DaysMonth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Lets find out how many days are in a month! 😃");
    System.out.println();

    System.out.println(
        "Please enter a month in number form (example, April is the fourth month so the number will be 4)");
    int numberMonth = scanner.nextInt();

    String monthName = "";
    System.out.println("Please enter a year: ");
    int year = scanner.nextInt();
    // we need to initialize
    int numberOfDaysMonth = 0;
    // 31 days
    switch (numberMonth) {
      case 1:
        numberOfDaysMonth = 31;
        monthName = "January";
        break;
      case 3:
        numberOfDaysMonth = 31;
        monthName = "March";
        break;
      case 5:
        numberOfDaysMonth = 31;
        monthName = "May";
        break;
      case 7:
        numberOfDaysMonth = 31;
        monthName = "July";
        break;
      case 8:
        numberOfDaysMonth = 31;
        monthName = "August ";
        break;
      case 10:
        numberOfDaysMonth = 31;
        monthName = "October";
        break;
      case 12:
        numberOfDaysMonth = 31;
        monthName = "December";
        break;
      // 30 days
      case 4:
        numberOfDaysMonth = 30;
        monthName = "April";
        break;
      case 6:
        numberOfDaysMonth = 30;
        monthName = "June";
        break;
      case 9:
        numberOfDaysMonth = 30;
        monthName = "September";
        break;
      case 11:
        numberOfDaysMonth = 30;
        monthName = "November";
        break;
      // 28 or 29 days (LEAP YEAR)
      case 2:
        monthName = "February";
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          numberOfDaysMonth = 29;
        } else {
          numberOfDaysMonth = 28;
        }
        break;
    }
    System.out.println(monthName + " " + "has" + " " + numberOfDaysMonth + " days!!");
    scanner.close();
  }
}